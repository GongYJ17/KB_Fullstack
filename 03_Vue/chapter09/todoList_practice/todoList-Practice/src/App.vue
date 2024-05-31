<script setup>
import inputComponent from './components/inputComponent.vue';
</script>

<template>
  <div>
    <inputComponent :addTodo="addTodo" />
  </div>
</template>

<script>
export default {
  name: 'App',
  components: { inputComponent },
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
        completed: false,
      });
    },
  },
};
</script>

<style scoped></style>
