function foodReport(name, age = 0, ...favoriteFoods) {
  console.log(name + ', ' + age);
  console.log(favoriteFoods);
}
foodReport('이몽룡', 20, '짜장면', '냉면', '불고기');
foodReport('홍길동', 16, '초밥');
