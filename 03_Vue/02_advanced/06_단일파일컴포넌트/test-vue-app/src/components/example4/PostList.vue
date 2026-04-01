<script setup>
import { ref } from 'vue';

const props = defineProps(['posts']);
const emit = defineEmits(['update-post', 'delete-post']);

const selectedPostNo = ref(null);
const isEditing = ref(false);
const editingPost = ref({ no: 0, title: '', content: '' });

const togglePost = (post) => {
  if (selectedPostNo.value === post.no) {
    selectedPostNo.value = null;
    isEditing.value = false;
  } else {
    selectedPostNo.value = post.no;
    isEditing.value = false;
  }
};

const startEdit = (post) => {
  isEditing.value = true;
  editingPost.value = { ...post };
};

const onSave = () => {
  emit('update-post', { ...editingPost.value });
  isEditing.value = false;
};

const onDelete = (no) => {
  if (confirm('정말로 삭제하시겠습니까?')) {
    emit('delete-post', no);
    selectedPostNo.value = null;
  }
};
</script>

<template>
  <ul>
    <li v-for="post in posts" :key="post.no">
      <div class="post-item" @click="togglePost(post)">
        <span>{{ post.no }}. {{ post.title }}</span>
        <span>{{ selectedPostNo === post.no ? '▲' : '▼' }}</span>
      </div>

      <div v-if="selectedPostNo === post.no" class="post-content">
        <div v-if="!isEditing">
          <h3>{{ post.title }}</h3>
          <p>{{ post.content }}</p>
          <div class="button-group">
            <button class="btn btn-edit" @click="startEdit(post)">수정</button>
            <button class="btn btn-delete" @click="onDelete(post.no)">
              삭제
            </button>
          </div>
        </div>

        <div v-else class="edit-box">
          <input type="text" v-model="editingPost.title" />
          <textarea v-model="editingPost.content" rows="3"></textarea>
          <div class="button-group">
            <button class="btn btn-save" @click="onSave">저장</button>
            <button class="btn btn-close" @click="isEditing = false">
              취소
            </button>
          </div>
        </div>
      </div>
    </li>
  </ul>
</template>

<style scoped>
ul {
  list-style: none;
  padding: 0;
}
.post-item {
  padding: 15px;
  cursor: pointer;
  display: flex;
  justify-content: space-between;
  border-bottom: 1px solid #eee;
}
.post-content {
  padding: 20px;
  background: #f9f9f9;
  border: 1px solid #ddd;
}
.button-group {
  display: flex;
  gap: 5px;
  margin-top: 10px;
}
.btn {
  border: none;
  padding: 5px 10px;
  cursor: pointer;
  background: #ff6b6b;
  color: white;
  border-radius: 3px;
}
.edit-box input,
.edit-box textarea {
  width: 100%;
  display: block;
  margin-bottom: 10px;
  padding: 8px;
}
</style>
