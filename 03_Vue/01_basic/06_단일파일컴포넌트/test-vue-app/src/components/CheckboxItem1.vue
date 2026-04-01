<template>
  <li><input type="checkbox" :checked="checked" />{{ name }}</li>
</template>

<!-- setup 사용시 -->
<script setup>
// defineProps : 부모요소에서 전달받은 Props를 정의하는 함수
defineProps(['name', 'checked']);
</script>

<style lang="scss" scoped></style>
