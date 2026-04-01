<script setup>
import GlobalCssDemo from './components/GlobalCssDemo.vue';
import ScopedCssDemo from './components/ScopedCssDemo.vue';
import CssModuleDemo from './components/CssModuleDemo.vue';
</script>

<template>
  <div id="app">
    <h1>Vue CSS 스타일 방법</h1>
    <div class="container">
      <GlobalCssDemo />
      <ScopedCssDemo />
      <CssModlueDemo />
    </div>
  </div>
</template>
<style scoped></style>
