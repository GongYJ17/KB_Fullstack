<template>
  <div>
    <h1>{{ msg }}</h1>
    <ChildComponent :rand="rand" @send-msg="sendMsgHandler" />
  </div>
</template>

<script setup>
import { ref } from 'vue';
import ChildComponent from './components/ChildComponent.vue';
const parentMsg = ref('랜덤숫자를 맞춰 주세요!');

function sendMsgHandler(value) {
  parentMsg.value = value;
}

const rand = ref(parseInt(Math.random() * 20));
</script>
