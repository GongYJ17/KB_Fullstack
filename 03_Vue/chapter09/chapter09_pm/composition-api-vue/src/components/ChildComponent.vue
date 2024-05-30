<template>
  <div>
    <input type="text" v-model.trim="inputMsg" />
    <button @click="sendMsg">정답!</button>
  </div>
</template>

<script setup>
import { ref, defineProps, defineEmits } from 'vue';

const inputMsg = ref(0);
const msg = ref('');
const props = defineProps({
  rand: {
    type: Number,
    required: true,
  },
});

const emit = defineEmits(['send-msg']);

const isAnswer = computed(() => {
  if (props.rand === inputMsg.value) {
    msg.value = '정답입니다.';
  } else if (props.rand > inputMsg.value) {
    msg.value = 'UP';
  } else {
    msg.value = 'Down';
  }
});

function sendMsg() {
  emit('send-msg', msg.value);
  msg.value = '';
}
</script>
