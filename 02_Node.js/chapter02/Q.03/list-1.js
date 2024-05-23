const fs = require('fs');

const readSync = fs.readdirSync('./');
console.log(readSync);

fs.readdir('./', (err, file) => {
  if (err) {
    throw err;
  }
  console.log(file);
});
