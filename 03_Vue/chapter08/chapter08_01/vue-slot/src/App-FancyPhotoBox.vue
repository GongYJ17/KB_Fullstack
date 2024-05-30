<script setup>
import ParentFancyPhotoBox from './components/ParentFancyPhotoBox.vue';
</script>

<template>
  <div>
    <ParentFancyPhotoBox />
  </div>
</template>

<script>
export default {
  name: 'App',
  components: {
    ParentSlot,
    ParentFancyPhotoBox,
  },
};
</script>

<style scoped></style>
