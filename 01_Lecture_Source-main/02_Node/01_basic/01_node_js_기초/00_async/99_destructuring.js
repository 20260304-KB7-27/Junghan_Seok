// 구조 분해 할당
// - 배열이나 객체에 들어있는 값을 더 짧고 편하게
// - 원하는 변수에 나누어 담는 문법

// 배열 구조 분해할당
const fruits = ['apple', 'banana', 'orange'];

const [a, , b] = fruits;

// console.log(a);
// console.log(b);
// console.log(c);

// 객체
const student = {
  name: 'Mamba',
  age: 20,
  major: '컴공',
};

// 객체를 구조 분해 할당할때는 key값이 중요.
// 객체를 원하는 변수명으로 받고 싶은 경우 -> { 기존 key: 새로운 변수명 }
const { name: student_name, age: student_age, major } = student;
// console.log(student_name);
// console.log(student_age);
// console.log(major);

const person = {
  username: 'hong',
  city: 'Seoul',
};

function printUser({ username, city }) {
  console.log(`사용자 이름: ${username}`);
  console.log(`사용자 이름: ${city}`);
}

printUser(person);
