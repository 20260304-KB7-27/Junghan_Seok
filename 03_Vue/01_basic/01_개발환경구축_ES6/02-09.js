// 익명 함수
const test1 = function (a, b) {
  return a + b;
};

// 화살표 함수
const test2 = (a, b) => {
  return a + b;
};

// 화살표 함수에서 return문만 있을 경우 중괄호 생략 가능
const test3 = (a, b) => a + b;

console.log(test1(3, 4));
console.log(test2(3, 4));
console.log(test3(3, 4));
