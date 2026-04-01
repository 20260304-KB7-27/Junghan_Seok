const pizzaOrder = (isAvailable) => {
  return new Promise((resolve, reject) => {
    console.log('피자 주문을 시도하는 중...');

    setTimeout(() => {
      if (isAvailable) {
        resolve('피자를 주문했습니다.');
      } else {
        reject('피자를 주문하지 않습니다.');
      }
    }, 1000);
  });
};

const pizzaReady = true;

pizzaOrder(pizzaReady)
  .then((result) => {
    console.log(result);
  })
  .catch((error) => {
    console.log(error);
  })
  .finally(() => {
    console.log('배송중...');
  });
