<template>
  <div>
    <h2>App Components</h2>
    <hr />
    <ul>
      <CheckboxItem />
      <CheckboxItem />
      <CheckboxItem />
      <CheckboxItem />
    </ul>
  </div>
</template>

<script setup>
import CheckboxItem from './components/CheckboxItem.vue';

// setup 사용 안할 시
// export defalut{
//   name: 'CheckboxItem',
//   setup(){
//     const checked = ref(false);
//   };

//   return false;
// };

// setup 사용시
import { ref } from 'vue';

const checked = ref(false);
</script>

<style lang="scss" scoped></style>
