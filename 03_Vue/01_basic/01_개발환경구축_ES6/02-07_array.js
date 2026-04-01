// 배열 구조분해 할당

const animals = ['bear', 'tiger', 'giraffe', 'elephant', 'lion'];

// const [ani1, ani2, ani3] = animals;
// // console.log(ani1, ani2, ani3);

// const [first, ...rest] = animals;

// console.log(first);
// console.log(rest);

// 3. 기본값 설정
const zoo = ['panda', 'koala'];

const [animal1, animal2, animal3 = 'monkey', animal4 = 'penguin'] = zoo;
console.log(animal1, animal2, animal3, animal4);

// 4. 중첩된 배열
const arr = [1, [2, 3], 4];
const [num1, [num3, num4], num2] = arr;
console.log(num1, num3, num4, num2);
