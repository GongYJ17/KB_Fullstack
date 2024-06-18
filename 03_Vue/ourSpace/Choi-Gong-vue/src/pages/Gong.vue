<template>
  <div>
    <div id="selfIntroduce">
      <div><img id="img" :src="" alt="오구" @click="toggleImg" /></div>
      <div v-if="!isImg1">
        <h2>000</h2>
        <h2>1999.02.05</h2>
        <div id="imgs">
          <span><img src="" alt="인스타" /></span>
          <span><img src="" alt="페북" /></span>
          <span><img src="" alt="카카오톡" /></span>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup></script>

<style lang="scss" scoped></style>
