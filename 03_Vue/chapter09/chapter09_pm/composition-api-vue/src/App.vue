<template>
  <div class="main">
    <button @click="showModal">모달 열기</button>
    <modalComponent :visible="isModalVisible" @close-modal="hideModal">
      <h1>잘지내니..</h1></modalComponent
    >
  </div>
</template>

<script setup>
import { ref } from 'vue';
import modalComponent from './components/modalComponent.vue';

const isModalVisible = ref(false);

function showModal(params) {
  isModalVisible.value = true;
}

function hideModal(params) {
  isModalVisible.value = false;
}
</script>

<style scoped>
.main {
  display: flex;
  flex-direction: column;
  align-items: center;
}
</style>
