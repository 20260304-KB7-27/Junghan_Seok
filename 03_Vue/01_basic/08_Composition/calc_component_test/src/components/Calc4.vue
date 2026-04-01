<template>
  <div>
    X : <input type="text" v-model.number="state.x" />
    <br />
    Y : <input type="text" v-model.number="state.y" />
    <br />
    <div>결과 : {{ result }}</div>
  </div>
</template>
<script>
import { reactive, computed } from 'vue';
export default {
  name: 'Calc4',

  setup() {
    const state = reactive({ x: 10, y: 20 });

    // computed: 의존하는 반응형 데이터가 변경될때만 자동으로 재계산
    // -> 결과가 캐싱
    // 읽기 전용
    const result = computed(() => {
      return state.x + state.y; //결과값이 바뀌었을 때
    });
    return {
      state,
      result,
    };
  },
};
</script>
