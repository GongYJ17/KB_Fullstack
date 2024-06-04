const todo = {
  id: '1',
  todo: '오브젝트 이해하기',
  done: false,
};

//const copyTodo = todo를 하면 얕은 복사가 된다.
const copyTodo = {
  ...todo,
  done: true,
  done: false,
};

// console.log(todo === copyTodo);
console.log(copyTodo);
