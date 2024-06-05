import { ref, computed } from 'vue';
// 창고를 만드는 함수를 가져옴.
import { defineStore } from 'pinia';

// 창고 이름을 정해줌(use-로 관용적으로 사용함. ).
export const useCounterStore = defineStore('counter', () => {
  // 반응성 데이터(ref, reactive)로 선언된 놈들이 '상태'임.
  const count = ref(0);
  const doubleCount = computed(() => count.value * 2);
  // 내부에서는 상태로 뭔가를 만들 수 있음. but 외부에서는 요청만 가능.
  function increment() {
    count.value++;
  }

  // 외부에서 사용하도록 내보내줌.

  return { count, doubleCount, increment };
});
