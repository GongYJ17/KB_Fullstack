<template>
  <div>
    <h1>드디어 도착한 내용: {{ drilling }}</h1>
    <h1>provide로 보낸 내용: {{ fly }}</h1>
  </div>
</template>

<script>
export default {
  name: 'GrandChild',
  props: ['drilling'],
  inject: ['fly'],
};
</script>

<style lang="scss" scoped></style>
