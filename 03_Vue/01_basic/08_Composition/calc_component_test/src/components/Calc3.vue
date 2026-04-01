<template>
  <div>
    X : <input type="text" v-model.number="x" />
    <br />
    Y : <input type="text" v-model.number="y" />
    <br />
    <button @click="calcAdd">계산</button>
    <br />
    <div>결과 : {{ result }}</div>
  </div>
</template>

<script>
import { reactive, toRefs } from 'vue';

/* reactive() - 객체 전용 반응형 API (Object, Array, Map, Set) - 속성에 직접
접근 ([객체명].[속성명]) - proxy로 반응형 주입 ref() - 모든 타입 가능 (원시값도
포함 num) - .value로 접근([반응형 데이터명].value) - Wrapper형태로 반응형 객체로
감쌀 수 있음. */

export default {
  name: 'Calc3',
  setup() {
    const state = reactive({ x: 10, y: 20, result: 30 });

    const calcAdd = () => {
      state.result = state.x + state.y;
    };

    return {
      // toRefs: reactive 객체의 각 속성을 개별 ref로 변환 (반응성 유지)
      ...toRefs(state),
      calcAdd,
    };
  },
};
</script>
