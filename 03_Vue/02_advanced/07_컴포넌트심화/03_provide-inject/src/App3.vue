<template>
  <div>
    <h2>비동기 컴포넌트 실습</h2>
    <AsyncComp />
  </div>
</template>

<script setup>
import { defineAsyncComponent } from 'vue';
import LoadingComp from './components/LoadingComp.vue';
import ErrorComp from './components/ErrorComp.vue';

/**
 * [defineAsyncComponent 사용 시점 및 효과]
 * 1. 초기 로딩 속도(FCP) 개선: 당장 화면에 보이지 않는 컴포넌트를 나중에 불러와 메인 번들 크기를 줄임.
 * 2. 조건부 렌더링: 특정 클릭 이벤트나 조건(v-if)이 충족될 때만 무거운 라이브러리/컴포넌트를 로드.
 * 3. 사용자 경험(UX) 향상: 로딩 중 상태와 에러 발생 시의 UI를 명확하게 제공.
 */

const AsyncComp = defineAsyncComponent({
  // 1. 컴포넌트를 로드하는 핵심 함수
  loader: () =>
    new Promise((resolve, reject) => {
      // 실습을 위해 3초 대기 후 임포트 실행
      setTimeout(() => {
        resolve(import('./components/AsyncComponent.vue'));
      }, 3000);
    }),

  // 2. 로딩 중 표시할 컴포넌트
  loadingComponent: LoadingComp,

  // 3. 로딩 컴포넌트를 보여주기 전 대기 시간 (ms)
  // 너무 빨리 로딩되면 로딩바가 깜빡거리는 것을 방지하기 위함
  delay: 200,

  // 4. 로딩 실패나 타임아웃 시 표시할 컴포넌트
  errorComponent: ErrorComp,

  // 5. 지정된 시간 내에 로딩되지 않으면 에러로 간주 (ms)
  // 오타 수정: timeput -> timeout
  timeout: 5000,
});
</script>

<style scoped></style>
