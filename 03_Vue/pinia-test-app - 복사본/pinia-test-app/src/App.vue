<template>
  <div>
    <h1>TodoList 테스트(composition API)</h1>
    <hr />
    할일 추가 : <input type="text" v-model="todo" />
    <!-- todo를 매개변수로 담아서 보내줘야함.  -->
    <button @click="addTodoHandler">추가</button>
    <hr />
    <ul>
      <!-- 받아온 todoList에서 각 객체를 todoItem에 넣어 사용함!-->
      <li v-for="todoItem in todoList" :key="todoItem.id">
        <!-- done은 화면에 찍히는 용도기 아니라 true일 때 (완료)라고 찍혀야함.-->
        <span style="cursor: pointer" @click="toggleDone(todoItem.id)"
          >{{ todoItem.todo }} {{ todoItem.done ? '(완료)' : '' }}</span
        >
        &nbsp;&nbsp;&nbsp;
        <button @click="deleteTodo(todoItem.id)">삭제</button>
      </li>
    </ul>
    <div>완료된 할일 수 : {{ doneCount }}</div>
  </div>
</template>

<script setup>
import { computed, ref } from 'vue';
import { useTodoListStore } from '@/stores/todo';

//input에서 새롭게 받을 todo를 변수선언 해준다.
const todo = ref('');

const todoListStore = useTodoListStore();
// todoList는 원시형이 아님. 배열로 비원시형임. or computed로 감싸서 보내서 그럼?
const { todoList, addTodo, deleteTodo, toggleDone } = todoListStore;

// 원시형이라 computed
const doneCount = computed(() => todoListStore.doneCount);

//handler는 기능을 더 추가해주고 싶을 떄 사용함.
const addTodoHandler = () => {
  // ref로 선언해서 input으로 받은 todo가 들어가도록 함.
  addTodo(todo.value);
  // 추가클릭 후 input창이 비워질 수 있도록 기능 추가함.
  todo.value = '';
};
</script>
