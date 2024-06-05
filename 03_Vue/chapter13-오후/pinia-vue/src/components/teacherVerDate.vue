<template>
  <div>
    <h1>오늘 날짜</h1>
    <h1>{{ msg }}</h1>
    <button @click="getYear">년도출력</button>
    <button @click="getMonth">월 출력</button>
    <button @click="getDate">일자 출력</button>
  </div>
</template>

<script setup>
import { computed } from 'vue';
import { useDateStore } from '@/stores/teacherVerDate';

const dateStore = useDateStore();
const { getYear, getMonth, getDate } = dateStore;

const msg = computed(() => dateStore.dateMsg);
</script>

<style lang="scss" scoped></style>
