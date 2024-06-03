<template>
  <div>
    <h1>오늘의 기분은?! {{ msg }}</h1>
    <img :src="imgSrc" :alt="msg" />
  </div>
</template>

<script setup>
import { ref, computed, watch } from 'vue';
import { useRoute } from 'vue-router';

const currentRoute = useRoute();
const mood = ref(currentRoute.params.mood);

watch(
  () => currentRoute.params.mood,
  (newMood) => (mood.value = newMood)
);

const msg = computed(() =>
  mood.value === 'happy' ? '행복합니다' : '신납니다!'
);

const imgSrc = computed(() =>
  mood.value === 'happy'
    ? 'https://search.pstatic.net/sunny/?src=https%3A%2F%2Fi.pinimg.com%2F736x%2F84%2Fd4%2Fcd%2F84d4cd3a339c162af43742bb44fa543a.jpg&type=a340'
    : 'https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.net%2Fimage%2F047%2F2017%2F04%2F21%2F0002148279_004_20170421171806205.jpg&type=a340'
);
</script>
