<template>
  <div>
    <h1>Todo List</h1>
    <!-- 입력파트 -->
    <div>
      <input type="text" v-model.trim="todo" />
      <button @click="addTodo">추가</button>
    </div>
    <br />
    <!-- 리스트 파트 -->
    <ol>
      <!-- 투두항목 -->
      <li v-for="todoItem in states.todoList" :key="todoItem.id">
        <span
          :style="
            todoItem.done
              ? { textDecoration: 'line-through' }
              : { textDecoration: 'none' }
          "
          @click="toggleTodo(todoItem.id)"
        >
          {{ todoItem.todo }} {{ todoItem.done ? '(완료)' : '' }}</span
        >
        <!-- 수정모드 -->
        <!-- editing를 추가함. -->
        <div v-if="todoItem.editing">
          <input type="text" v-model.trim="todoEdit" />
          <button @click.stop="confirmEditTodo(todoItem.id)">확인</button>
          <button @click.stop="cancelEditTodo(todoItem.id)">취소</button>
        </div>
        &nbsp;
        <!-- 위에 것과 다르게 해서 둘 중에 하나만 보일 수 있게 한다. -->
        <span v-if="!todoItem.editing">
          <!-- 수정버튼을 눌렀을 때 이 span태그는 사라지고 위에 것이 나와야함. -->
          <button @click.stop="editTodo(todoItem.id)">수정</button>
          /
          <button @click.stop="deleteTodo(todoItem.id)">삭제</button>
        </span>
      </li>
    </ol>
  </div>
</template>

<script setup>
import axios from 'axios';
import { ref, reactive } from 'vue';

const states = reactive({
  todoList: [],
});
const todo = ref('');
const todoEdit = ref('');

const BASEURL = '/api/todos';

// 가장 먼저 데이터를 받아오는 함수를 작성한다.
async function fetchTodoList() {
  try {
    const fetchTodoRes = await axios.get(BASEURL);
    states.todoList = fetchTodoRes.data;
  } catch (e) {
    alert('todoList 데이터 통신 Err 발생');
    console.log(e);
  }
}

async function addTodo() {
  if (todo.value === '') return alert('할 일을 입력해주세요.');

  try {
    const newTodo = { todo: todo.value, done: false };
    //새로운 투두를 데이터에 추가함.
    const addTodoRes = await axios.post(BASEURL, newTodo);
    // ealry return 으로 추가 실패시 끝냄.
    if (addTodoRes.status !== 201) return alert('Todo 추가 실패');
    // 추가 성공할 시 todo인풋 창을 비워준다.
    todo.value = '';
    // 추가한 투두를 반영한 데이터를 보여준다.
    fetchTodoList();
  } catch (e) {
    alert('Todolist 추가 작업중 에러 발생!!');
    console.log(e);
  }
}

//id를 받아온다.
async function deleteTodo(id) {
  try {
    //투두를 데이터에서 삭제함
    const deleteTodoRes = await axios.delete(`/api/todos/${id}`);
    // ealry return 으로 삭제 실패시 끝냄.
    if (deleteTodoRes.status !== 200) return alert('Todo 삭제 실패');
    // 추가한 투두를 반영한 데이터를 보여준다.
    fetchTodoList();
  } catch (e) {
    alert('Todolist 삭제 작업중 에러 발생!!');
    console.log(e);
  }
}

async function toggleTodo(id) {
  try {
    // 배열 내에서 모든 객체를 todo에 넣어 돌린다음 그 id값이 동일한 것을 찾아줌.
    const targetTodo = states.todoList.find((todo) => todo.id === id);
    // 찾은 todo객체에서 done을 반대인 값(true -> false/false-> true)으로 수정시킴.
    const payload = { ...targetTodo, done: !targetTodo.done };
    // 해당 id값을 가진 객체를 payload로 바꿔달라는 뜻(수정).
    const toggleTodoRes = await axios.put(`${BASEURL}/${id}`, payload);

    if (toggleTodoRes.status !== 200) return alert('Todo toggle 실패');

    fetchTodoList();
  } catch (e) {
    alert('Todolist 토글 작업 중 에러 발생');
    console.log(e);
  }
}

//서버랑 통신 x하면 비동기처리 안해도 됨.
function editTodo(id) {
  const targetTodo = states.todoList.find((todo) => todo.id === id);
  // 객체에 editing을 추가한 후 true를 해줌.
  targetTodo.editing = true;
}

//서버랑 통신 x하면(데이터에 접근을 안하면) 비동기처리 안해도 됨.
function cancelEditTodo(id) {
  const targetTodo = states.todoList.find((todo) => todo.id === id);
  // 객체에 editing을 추가한 후 false를 해줌
  targetTodo.editing = false;
}

//todoEdit
async function confirmEditTodo(id) {
  // 입력값이 아무것도 없을 때!! 입력하도록 하기!
  if (todoEdit.value === '') return alert('수정내용을 입력하세요!');

  try {
    const targetTodo = states.todoList.find((todo) => todo.id === id);
    // 현재 editing 키 값이 true로 되어 있기 때문에 false로 바꿔줘야함.
    const payload = { ...targetTodo, todo: todoEdit.value, editing: false };

    const editTodoRes = await axios.put(`${BASEURL}/${id}`, payload);
    if (editTodoRes.status !== 200) return alert('todo수정 실패!');
    todoEdit.value = '';

    fetchTodoList();
  } catch (e) {
    alert('수정작업중 오류발생 !!');
    console.log(e);
  }
}

fetchTodoList();
console.log();
</script>
