<template>
  <!-- Teleport: 컴포넌트의 일부 HTML을 컴포넌트가 위치한 곳이 아닌 다른 DOM의 위치 -->
  <Teleport to="#modal">
    <Modal v-if="isModal"></Modal>
  </Teleport>

  <div>
    <h2>Teleport 테스트</h2>
    <hr />

    <button @click="openModal">모달 열기</button>
  </div>
</template>

<script setup>
import Modal from './components/Modal.vue';
import { ref } from 'vue';

const isModal = ref(false);

function openModal() {
  isModal.value = true;
  setTimeout(function () {
    isModal.value = false;
  }, 3000);
}
</script>

<style scoped></style>
