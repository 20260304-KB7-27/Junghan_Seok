<script setup>
import { ref } from 'vue';
const emit = defineEmits(['add-post']);

const newTitle = ref('');
const newContent = ref('');

const submitPost = () => {
  if (!newTitle.value.trim() || !newContent.value.trim()) return;
  emit('add-post', { title: newTitle.value, content: newContent.value });
  newTitle.value = '';
  newContent.value = '';
};
</script>

<template>
  <div class="input-group">
    <input type="text" v-model="newTitle" placeholder="새 게시글 제목" />
    <input type="text" v-model="newContent" placeholder="새 게시글 내용" />
    <button class="btn-add" @click="submitPost">작성</button>
  </div>
</template>

<style scoped>
.input-group {
  display: flex;
  gap: 5px;
  margin-bottom: 20px;
}
.input-group input {
  flex: 1;
  padding: 8px;
}
.btn-add {
  background: #ff6b6b;
  color: white;
  border: none;
  padding: 8px 15px;
  cursor: pointer;
}
</style>
