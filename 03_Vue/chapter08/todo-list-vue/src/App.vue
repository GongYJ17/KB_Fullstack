<script setup>
import inputTodo from './components/inputTodo.vue';
import TodoList from './components/TodoList.vue';
</script>

<template>
  <div style="F; flex-direction: column; align-items: center">
    <h1>Gong TodoList</h1>
    <inputTodo @addTodo="addTodo" />
    <TodoList
      :todoList="todoList"
      @toggleCompeleted="toggleCompeletedHandler"
      @deleteTodo="deleteTodoHandler"
    />
  </div>
</template>

<script>
export default {
  components: { inputTodo, TodoList },
  data() {
    return {
      todoList: [
        { id: 1, todo: 'TodoList 만들기', completed: false },
        { id: 2, todo: '프로그래머스 계정 문의하기', completed: true },
        { id: 3, todo: '복습하기', completed: false },
        { id: 4, todo: '저녁먹기', completed: false },
      ],
    };
  },
  methods: {
    addTodo(todo) {
      this.todoList.push({
        id: this.todoList.length + 1,
        todo: todo.todo,
        compledted: false,
      });
    },
    toggleCompeletedHandler(id) {
      const index = this.todoList.findIndex(function (item, index) {
        return id === item.id;
      });
      this.todoList[index].completed = !this.todoList[index].completed;
    },
    deleteTodoHandler(id) {
      const index = this.todoList.findIndex((item) => id === item.id);
      this.todoList.splice(index, 1);
    },
  },
};
</script>

<style scoped></style>
