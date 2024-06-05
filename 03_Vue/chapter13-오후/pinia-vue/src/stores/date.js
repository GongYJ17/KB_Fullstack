import { ref, computed } from 'vue';

import { defineStore } from 'pinia';

export const useDateStore = defineStore('date', () => {
  const date = new Date();

  const msg = ref('');

  function getYear() {
    msg.value = `오늘은 ${date.getFullYear()}년 입니다.`;
  }
  function getMonth() {
    msg.value = `오늘은 ${date.getMonth() + 1}월 입니다.`;
  }
  function getDate() {
    msg.value = `오늘은 ${date.getDate()}일 입니다.`;
  }

  return { getYear, getMonth, getDate, msg };
});
