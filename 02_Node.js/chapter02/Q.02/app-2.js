// const users = require('./users-1');
const hello = require('./userHello');
// console.log(users);

// console.log(hello(users.user1));
// console.log(hello(users.user2));

const { user1, user2 } = require('./users-1');

console.log(hello(user1));
