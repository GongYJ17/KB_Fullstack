let p = new Promise((res, rej) => {
  res('first!');
});

p.then((msg) => {
  console.log(msg);
  throw new error();
  return 'second';
})
  .then((msg) => {
    console.log(msg);
    return 'third!';
  })
  .then((msg) => {
    console.log(msg);
  })
  .catch((error) => {
    console.log('에러발생');
  });
