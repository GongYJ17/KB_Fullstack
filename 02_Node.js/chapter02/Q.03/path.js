const path = require('path');

const pathJoin = path.join('some', 'work', 'ex.txt');

console.log(pathJoin);
console.log('파일 절대 경로:', __filename);

const dirNamePath = path.dirname(__filename);
console.log('경로만:', dirNamePath);

const basenamePath = path.basename(__filename);
console.log('파일명:', basenamePath);

const basenamePathNo = path.basename(__filename, '.js');
console.log('파일명(확장자제외):', basenamePathNo);

const ext = path.extname(__filename);
console.log('확장자:', ext);

const parsePath = path.parse(__filename);
console.log(parsePath);
