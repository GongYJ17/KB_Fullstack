<template>
  <div>
    <h1>Counter</h1>
    <h1>count : {{ count }}</h1>
    <h1>count x2 : {{ doubleCount }}</h1>
    <button @click="increment">+1</button>
  </div>
</template>

<script setup>
import { computed } from 'vue';
import { useCounterStore } from '@/stores/counter';

//이부분은 암기하듯이 작성하면됨. useCounterStore에서 return한 값을 받는다!
const counterStore = useCounterStore();
//구조 분해 할당해줌. increment라는 변수에 increment()함수를 넣어준 것임.
const { increment } = counterStore;

//함수가 아닌 원시형 데이터들은 computed로 받아줘야함. 그냥 받으면 렌더링(store쪽에서 변경되면 자동으로 변경되는 것)이 안됨.
const count = computed(() => counterStore.count);
const doubleCount = computed(() => counterStore.doubleCount);
</script>

<style lang="scss" scoped></style>
