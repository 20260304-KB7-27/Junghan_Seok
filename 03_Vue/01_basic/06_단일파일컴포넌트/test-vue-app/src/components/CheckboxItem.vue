<template>
  <li><input type="checkbox" v-model="checked" /> 옵션</li>
</template>

<!-- setup을 사용하지 않았을때 -->
<!-- <script>
import { ref } from 'vue';

export default {
  name: 'CheckboxItem',
  setup() {
    const checked = ref(false);

    return {
      checked,
    };
  },
};
</script> -->

<!-- setup 사용시 -->
<script setup>
import { ref } from 'vue';

const checked = ref(false);
</script>

<style lang="scss" scoped></style>
