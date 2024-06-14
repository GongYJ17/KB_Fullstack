import { defineStore } from 'pinia';
import { reactive, computed } from 'vue';

export const useTodoListStore = defineStore('todolist', () => {
  //객체, 배열은 reactive (반응형 데이터화) 사용.
  const state = reactive({
    todoList: [
      { id: 1, todo: 'ES6학습', done: false },
      { id: 2, todo: 'React학습', done: false },
      { id: 3, todo: 'ContextAPI 학습', done: true },
      { id: 4, todo: '야구경기 관람', done: false },
    ],
  });

  const addTodo = (todo) => {
    state.todoList.push({ id: new Date().getTime(), todo, done: false });
  };

  const deleteTodo = (id) => {
    //지울 애가 누군지 id로 찾는 것.
    const index = state.todoList.findIndex((todo) => todo.id === id);
    // index를 포함하여 지우는 요소 개수 1개라는 뜻.
    state.todoList.splice(index, 1);
  };

  const toggleDone = (id) => {
    //완료된 애가 누군지 id로 찾는 것.
    const index = state.todoList.findIndex((todo) => todo.id === id);
    state.todoList[index].done = !state.todoList[index].done;
  };

  // computed에는 return을 꼭 적어줘야한다.
  const doneCount = computed(() => {
    // done = true인 애들만 모아서 새로운 배열을 만들어준다.
    return state.todoList.filter((todoItem) => todoItem.done === true).length;
  });

  // 외부에서 state를 맘대로 못 바꿔주도록 computed로 감싸서 값이 바뀔 때마다 새롭게 복사해서 준다.
  // state.todoList를 복사하는 것이라 이해.
  const todoList = computed(() => state.todoList);
  // todoList(비원시) => 그냥 보낼 시 다르애들이 임의로 주소값을 바꾸고 원본훼손을 할 수도 있어서 computed로 싸서 보냄
  // doneCount(원시) => 원시 애들이 받을 때 렌더링이 될 수 있도록 받는 쪽에서 computed로 감싸준다.
  return { todoList, doneCount, addTodo, deleteTodo, toggleDone };
});
