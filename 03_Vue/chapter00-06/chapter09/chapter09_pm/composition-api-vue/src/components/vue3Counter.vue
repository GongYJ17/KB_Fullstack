<template>
  <div>
    <h1>Vue3 counter</h1>
    <h1>{{ count }}</h1>
    <p>{{ double }}</p>
    <p>{{ counter }}</p>
    <button @click="increment">Increment</button>
    <button @click="decrement">Decrement</button>
  </div>
</template>

<script setup>
import { computed, reactive, ref } from 'vue';

const count = ref(2);
const counter = ref(0);

const obj = reactive({ x: 0, y: 0, result: 0 });

const double = computed(() => {
  counter.value++;
  return count.value * 2;
});

function increment() {
  count.value++;
  counter.value++;
}
function decrement() {
  count.value--;
  counter.value++;
}
</script>
