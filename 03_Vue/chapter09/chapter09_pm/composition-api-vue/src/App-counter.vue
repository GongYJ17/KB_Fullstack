<template>
  <div>
    <h1>{{ count }}</h1>
    <h1>x= {{ obj.x }}, y= {{ obj.y }}, result= {{ obj.result }}</h1>
    <h1>{{ double }}</h1>
    <button @click="increment">+1</button>
    <button @click="decrement">+1</button>
  </div>
</template>

<script setup>
import { computed, reactive, ref } from 'vue';

const count = ref(2);

const obj = reactive({ x: 0, y: 0, result: 0 });
const double = computed(() => count.value * 2);
function increment() {
  count.value++;
}
function decrement() {
  count.value--;
}
</script>
