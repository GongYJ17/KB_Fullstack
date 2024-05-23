const animals = ['dog', 'cat'];

function showAnimals() {
  animals.map((el) => {
    console.log(el);
  });
}

module.exports = {
  animals,
  showAnimals,
};
// 모듈은 큰 객체형태로 내보내게 된다.
