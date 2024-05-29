<template>
  <div class="container">
    <div class="title">
      <slot name="title"></slot>
    </div>
    <div class="photo">
      <slot name="photo"></slot>
    </div>
  </div>
</template>

<script>
export default {
  name: 'FancyPhotoBox',
};
</script>

<style scoped>
.container {
  text-align: center;
  display: flex;
  flex-direction: column;
  width: 300px;
}

.title {
  padding: 0;
}
.photo {
  background-color: bisque;
  padding: 30px;
  border-radius: 30px;
}
</style>

<style lang="scss" scoped></style>
