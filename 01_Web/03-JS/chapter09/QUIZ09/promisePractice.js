const promise = new Promise((resolve, reject) => {
  console.log('promise 시작');
  setTimeout(() => {
    console.log('setTime 끝!');
    resolve('promise 비동기 구현 성공!');
  }, 2000);
});

promise.then((data) => {
  console.log(data);
});

console.log(promise);
