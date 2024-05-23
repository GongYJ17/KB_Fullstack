//01

const getTriangle = (base, height) => (base * height) / 2;

console.log(`삼각형의 면적: ${getTriangle(5, 2)}`);

//02
function displayA() {
  console.log('A');
}

function displayB(callback) {
  setTimeout(() => {
    // () => console.log('B') 로 가능함. return할 값이 없는 한줄짜리도 {} 생략가능.
    console.log('B');
  }, 2000);
}

function displayC() {
  console.log('C');
}

displayA();
displayB();
displayC();
//03
function displayA() {
  console.log('A');
}

function displayB(callback) {
  setTimeout(() => {
    console.log('B');
    callback();
  }, 2000);
}

function displayC() {
  console.log('C');
}

displayA();
displayB(displayC);

//04

const order = (result, callback) => {
  console.log('아메리카노 주문 접수');
  setTimeout(() => {
    callback(result);
  }, 3000);
};

const display = (result) => {
  console.log(`${result} 완료!`);
};

order('아메리카노', display);
