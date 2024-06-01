<template>
  <div id="selfIntroduce">
    <h1>오구를 눌러보세요!</h1>
    <div><img id="img" :src="img" alt="동오구" @click="toggleImg" /></div>
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
</template>

<script setup>
import { ref } from 'vue';
const img1 =
  'https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNDAxMTdfMjQg%2FMDAxNzA1NDkwNjAzMzk3._tCxktZVvH9lPk6PrrU4GpWT5_qMvvTnPbl4nk1e3cQg.-ReI58WZx9b1xCa_iJ29ZgxuT8evvkCjSuUF6wfK2_4g.PNG.kkukku0711%2Fimage.png&type=sc960_832';
const img2 =
  'https://dnvefa72aowie.cloudfront.net/origin/article/202307/b1101b8bbe191b1123876c5fa366dd64db4678e90c2bc2646cbbf05503a742a0_0.webp?f=webp&q=95&s=1440x1440&t=inside';

const img = ref(img1);
const isImg1 = ref(true);

function toggleImg() {
  if (isImg1.value) {
    img.value = img2;
  } else {
    img.value = img1;
  }
  isImg1.value = !isImg1.value;
}
</script>

<style scoped>
#img {
  margin: 0px;
  cursor: pointer;
  width: 400px;
}

#selfIntroduce {
  height: 100vh;
  display: flex;
  align-items: center;
  flex-direction: column;
}

#imgs {
  display: flex;
  justify-content: space-between;
}
</style>
