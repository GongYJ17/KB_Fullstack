<script setup>
import { RouterLink, RouterView } from 'vue-router';
import { reactive, computed, provide } from 'vue';
import Header from '@/components/Header.vue';
import Loading from '@/components/Loading.vue';
import { useTodoListStore } from '@/stores/todoList.js';

const todoListStore = useTodoListStore();
const isLoading = computed(() => todoListStore.isLoading);
const fetchTodoList = todoListStore.fetchTodoList;
fetchTodoList();
</script>

<template>
  <div class="container">
    <Header></Header>
    <router-view />
  </div>
</template>

<style scoped></style>
