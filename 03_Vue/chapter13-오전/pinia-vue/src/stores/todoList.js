import axios from 'axios';
import { defineStore } from 'pinia';
import { computed, reactive } from 'vue';

export const useTodoListStore = defineStore('todoList', () => {
  const BASEURL = '/api/todos';
  const state = reactive({
    todoList: [],
  });
});

const fetchTodoList = async () => {
  try {
    // URL을 통해 데이터 가져옴.
    const response = await axios.get(BASEURL);
    // 호출 과정 에러 발생시
    if (response.status !== 200) return alert('데이터 불러오기 실패..');
    state.todoList = response.data;
  } catch (e) {
    //데이터 호출과정에서 에러가 발생할 시
    alert('에러 발생!!');
    console.log(e);
  }
};

const addTodo = async ({ todo, desc }, successCallback) => {
  try {
    const payload = { todo, desc };
    const response = await axios.post(BASEURL, payload);
    if (response.status !== 201) return alert('Todo추가 실패');
    state.todoList.push({ ...response.data, done: false });
    successCallback();
  } catch (e) {
    alert(`에러 발생: ${e}`);
  }
};

const updateTodo = async ({ id, todo, desc, done }, successCallback) => {
  try {
    // 필요 변수를 객체에 담는다.
    const payload = { id, todo, desc, done };
    // 변경된 내용을 데이터로 보낸다.
    const response = await axios.put(`${BASEURL}/${id}`, payload);
    // 데이터가 변경이 되면, 로컬 todoList 목록에도 반영을 한다. 이는 프론트쪽에서 보이게 하는 것임.
    if (response.status !== 200) return alert('Todo 변경실패');
    let index = state.todoList.findIndex((todo) => todo.id === id);
    state.todoList[index] = payload;
    successCallback();
  } catch (e) {
    alert(`에러 발생: ${e}`);
  }
};

const deleteTodo = async (id) => {
  try {
    const response = await axios.delete(`${BASEURL}/${id}`);

    if (response.status !== 200) return alert('Todo 삭제실패!');
    let index = state.todoList.findIndex((todo) => todo.id === id);
    state.todoList.splice(index, 1);
  } catch (e) {
    alert(`에러 발생!! : ${e}`);
  }
};

const toggleDone = async (id) => {
  try {
    let todo = state.todoList.find((todo) => todo.id === id);
    const payload = { ...todo, done: !todo.done };
    const response = await axios.put(`${BASEURL}/${id}`, payload);
    if (response.status !== 200) return alert('Todo 완료 변경 실패');
    todo.done = !todo.done;
  } catch (e) {
    alert(`에러 발생!! : ${e}`);
  }
};

const todoList = computed(() => state.todoList);
const isLoading = computed(() => state.isLoading);
const doneCount = computed(() => {
  const filtered = state.todoList.filter((todoItem) => todoItem.done === true);
  return filtered.length;
});

return {
  todoList,
  isLoading,
  doneCount,
  fetchTodoList,
  addTodo,
  deleteTodo,
  updateTodo,
  toggleDone,
};
