const ext = require('path');

const ext = path.extname(__filename);
console.log('확장자: ', ext);
const parsedPath = path.Parse(__filename);
console.log('parsedPath: ', parsedPath);
