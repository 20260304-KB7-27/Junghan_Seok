// function login(userId, callback) {
//   setTimeout(() => {
//     console.log('로그인 성공');
//     callback({ userId: userId });
//   }, 1000);
// }

// Promise 객체로 만들기
// Promise
// 비동기 처리 함수(resolve, reject)를 제공해준다.
// 비동기 처리 함수를 실행시 성공, 실패에 처리가 용이하다.

// Promise의 상태
// pendding: 대기 상태
// fulfilled: 작업 성공
// rejected: 작업 실패
function login(userId) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (!userId) {
        return reject('로그인 실패'); // return을 추가하여 함수 종료
      }
      console.log('로그인 성공');
      resolve({ userId: userId });
    }, 1000);
  });
}

// 사용자 정보 조회
function getUserInfo(user) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      // login('user1')로 호출해야 통과됨
      if (user.userId !== 'user1') {
        return reject('사용자 정보를 찾을 수 없음');
      }

      console.log('사용자 정보 조회 완료');
      resolve({ userId: user.userId, name: 'kim' });
    }, 1000);
  });
}

// 주문 조회
function getOrders(userInfo) {
  // 매개변수 명을 명확하게 변경
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      const orders = [{ orderId: 1 }, { orderId: 2 }];

      if (!orders || orders.length === 0) {
        return reject('주문 내역 없음');
      }

      console.log('주문 목록 조회 완료');
      resolve(orders);
    }, 1000);
  });
}

// 배송 조회
function getDelivery(order) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (!order) {
        return reject('주문 정보 없음');
      }

      console.log('배송 상태 조회 완료');
      resolve({ orderId: order.orderId, status: '배송중' });
    }, 1000);
  });
}

// 실행부 (호출 인자를 'user1'으로 변경)
login('user1')
  .then((user) => {
    console.log('유저 데이터:', user);
    return getUserInfo(user);
  })
  .then((userInfo) => {
    console.log('상세 정보:', userInfo);
    return getOrders(userInfo);
  })
  .then((orders) => {
    console.log('주문 목록:', orders);
    return getDelivery(orders[0]); // 첫 번째 주문의 배송 정보
  })
  .then((delivery) => {
    console.log('최종 결과 ->', delivery);
  })
  .catch((error) => {
    console.error('에러 발생:', error);
  });

// async await: Promise를 더 쉽게 사용하기 위한 방법
async function processOrder() {
  try {
    // await: Promise가 종료될때까지 기다린 뒤 결과를 꺼내온다.
    // reject가 발생할 경우 error를 발생 시킴 -> catch
    const user = await login('user');
    console.log(user);

    const userInfo = await getUserInfo(user);
    console.log(user);

    const orders = await getOrders(userInfo);
    console.log(orders);

    const delivery = await getDelivery(orders[0]);
    console.log('최종 배송 상태: ', delivery);
  } catch (error) {
    console.log('에러 발생: ', error);
  }
}
