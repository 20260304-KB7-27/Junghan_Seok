<template>
  <h1>You did it!</h1>
  <p>
    Visit
    <a href="https://vuejs.org/" target="_blank" rel="noopener"> vuejs.org </a>
    to read the documentation
  </p>

  <hr />

  <NoSlotTest />
  <SlotTest>
    <p>이것은 Slot을 통해 전달되는 콘텐츠입니다.</p>
  </SlotTest>
</template>

<script setup>
import NoSlotTest from './components/example1/NoSlotTest.vue';
import SlotTest from './components/example1/SlotTest.vue';
</script>
<style scoped></style>
