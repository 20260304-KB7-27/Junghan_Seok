<template>
  <li><input type="checkbox" :checked="checked" />{{ name }}</li>
</template>

<!-- setup 사용시 -->
<script setup>
// defineProps : 부모요소에서 전달받은 Props를 정의하는 함수

// 유효성 검사
defineProps({
  id: [Number, String], // 문자열과 숫자형 타입체크
  name: {
    type: String,
    required: true, // 기본적으로 false
  },
  checked: {
    type: Boolean,
    default: true, //기본값 설정
  },
});
</script>

<style lang="scss" scoped></style>
