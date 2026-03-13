const fs = require('fs');
const path = require('path');

const filePath = path.join(__dirname, 'example.txt');
const savePath = path.join(__dirname, './text-1.txt');
//파일이 있을 경우
if (fs.existSync(savePath)) {
  console.log('파일 존재');
} else {
  fs.writeFileSync(savePath, data);
}
// fs.readFile(filePath, 'utf-8', (err,data) => {
//     if(err){
//         console.error(err);
//     }
// })
