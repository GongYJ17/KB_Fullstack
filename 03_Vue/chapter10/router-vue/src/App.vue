<script setup></script>

<template>
  <div>
    <nav>
      <RouterLink to="/">안녕하세요!!</RouterLink>
      &nbsp;
      <RouterLink to="/about">아기오구</RouterLink>
      &nbsp;
      <RouterLink to="/dynamic/happy">행복하다!</RouterLink>
      &nbsp;
      <RouterLink to="/dynamic/exited">신난다~</RouterLink>
    </nav>
    <RouterView />
  </div>
</template>
