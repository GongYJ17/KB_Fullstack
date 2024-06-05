import { ref } from 'vue';
import { defineStore } from 'pinia';

// 밖으로 내보내야 하니까 export를 사용함.
// 이때 defindeStore(id, [option])이므로 id는 다르게 해야함.
export const useDateStore = defineStore('teacherDate', () => {
  const date = new Date();
  //변경될 msg내용을 ref로 선언함.
  const dateMsg = ref('');

  function getYear() {
    dateMsg.value = `오늘은 ${date.getFullYear()}년 입니다.`;
  }

  function getMonth() {
    dateMsg.value = `오늘은 ${date.getMonth() + 1}월 입니다.`;
  }

  function getDate() {
    dateMsg.value = `오늘은 ${date.getDate()}일 입니다.`;
  }

  return { getYear, getMonth, getDate, dateMsg };
});
