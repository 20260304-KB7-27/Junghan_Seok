const fs = require('fs');
const path = require('path');

const folderPath = path.join(__dirname, 'test');
const savePath = path.join(__dirname, './text-1.txt');

console.log('폴더 경로: ', folderPath);

if (fs.existSync(folderPath)) {
  console.log('폴더 존재');
} else {
  fs.mkdir(folderPath, (err) => {
    if (err) {
      console.error(err);
      return;
    }
  });
}
