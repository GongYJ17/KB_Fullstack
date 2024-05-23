//01
const gongObj = {
  name: '공연정',
  isOld: true,
  condition: 'good',
};

function getKeyValue(obj, key) {
  if (key in obj) {
    console.log(obj[key]);
  }
}

getKeyValue(gongObj, 'name');

//02
const gongObj = {
  name: '공연정',
  isOld: true,
  condition: 'sleeeeeepy',
};

for (let key in gongObj) {
  console.log(`key는 ${key}이고, 그에 대한 값은 ${gongObj[key]}`);
}

for (let key in gongObj) {
  console.log(`${key} : ${gongObj[key]}`);
}
