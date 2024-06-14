<template>
  <div>
    <nav>
      <RouterLink to="/">홈페이지</RouterLink>
      &nbsp;
      <RouterLink to="/login">로그인</RouterLink>
      &nbsp;
      <RouterLink to="/todo">Todolist</RouterLink>
    </nav>
    <RouterView></RouterView>
  </div>
</template>

<script setup></script>
