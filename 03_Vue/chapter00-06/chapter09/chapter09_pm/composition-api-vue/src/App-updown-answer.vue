<template>
  <div>
    <h1>{{ parentMsg }}</h1>
    <ChildUpDown :rand="rand" @send-msg="changeMsg"></ChildUpDown>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import ChildUpDown from './components/ChildUpDown.vue';

const parentMsg = ref('랜덤숫자를 맞춰 주세요!');
const rand = ref(parseInt(Math.random() * 20));

function changeMsg(payload) {
  parentMsg.value = payload;
}
</script>
