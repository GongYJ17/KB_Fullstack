<template>
  <li
    :class="
      todoItem.done
        ? 'list-group-item list-group-item-success'
        : 'list-group-item'
    "
  >
  <span :class="todoItem.done ? 'todo-done pointer' : 'pointer'">

  </span>
  </li>
</template>

<script setup></script>

<style lang="scss" scoped></style>
