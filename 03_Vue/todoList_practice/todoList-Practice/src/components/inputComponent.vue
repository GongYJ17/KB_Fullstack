<template>
  <div>
    <input type="text" v-model="todo" />
    <button @click="$emit('addTodo', { todo })">할일 추가!</button>
  </div>
</template>

<script>
export default {
  name: 'inputComponent',
  data() {
    return {
      todo: '',
    };
  },
};
</script>

<style lang="scss" scoped></style>
