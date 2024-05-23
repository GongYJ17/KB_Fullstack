const gongObj = {
  name: '공연정',
  hoobit: ['Singing', 'Listening', 'running'],
};

console.log(gongObj);
const strgongObj = JSON.stringify(gongObj);
console.log(strgongObj);

console.log(typeof gongObj);
console.log(typeof strgongObj);
console.log(gongObj.name);
console.log(strgongObj.name); // JSON으로 압축 ==> 데이터를 다른 곳으로 보낼 때 문자열의 형태로 모두 전환해서 보낸다.
