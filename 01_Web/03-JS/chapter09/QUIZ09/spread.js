const fruits = ['딸기', '샤인머스켓', '사과'];

console.log(fruits);
console.log(...fruits);

function conLog(a, b, c) {
  console.log(a, b, c);
}

conLog(...fruits);
