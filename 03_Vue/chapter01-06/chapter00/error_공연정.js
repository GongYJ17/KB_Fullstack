const promise = new Promise((resolve, reject) => {
  setTimeout(() => {
    let num = parseInt(Math.random() * 10);

    if (num >= 5) {
      reject(num);
    }

    resolve(num);
  }, 1000);
});

// promise.then((result) => {
//     console.log('무사 통과! 생성된 숫자 :', result);
// }).catch((error) => {
//     console.log('Erro 발생! 생성된 숫자:', error);
// });

async function promiseAsync() {
  try {
    const result = await promise;
    console.log('무사 통과! 생성된 숫자 :', result);
  } catch (error) {
    console.log('Erro 발생! 생성된 숫자:', error);
  }
}

promiseAsync();

console.log('## Promise 객체생성');
