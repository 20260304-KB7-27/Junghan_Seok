// 객체 구조분해할당

const user = {
  name: 'Alice',
  age: 25,
  job: 'Developer',
  info: {
    address: 'Seoul',
    hobbies: ['reading', 'coding'],
  },
};
// // 객체 속성명을 다르게 사용하고 싶다면 별칭을 지정할 수 있다.
// const { age: ageNo, name = userName, ...rest } = user;
// // console.log(ageNo);
// // console.log(userName);

// // 중첩된 겍체 구조 분해
// const { userName, age, info } = user;
// console.log(info);

const {
  name,
  age,
  info: {
    address,
    hobbies: [fistHobby, secondHobby],
  },
} = user;

console.log(address);
console.log(fistHobby); // reading
console.log(secondHobby); // coding
