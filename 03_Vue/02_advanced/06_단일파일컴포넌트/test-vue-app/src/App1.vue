<template>
  <div id="app">
    <h1>📌 게시판 목록 v3 (Component)</h1>
    <PostForm @add-post="handleAddPost" />
    <hr />
    <PostList
      :posts="sortedPosts"
      @update-post="handleUpdatePost"
      @delete-post="handleDeletePost"
    />
  </div>
</template>

<script setup>
import { ref, computed } from 'vue';
import PostForm from './components/example4/PostForm.vue';
import PostList from './components/example4/PostList.vue';

const posts = ref([
  {
    no: 1,
    title: 'Vue.js 기초 배우기',
    content: 'Vue.js는 프로그레시브 프레임워크입니다.',
  },
  {
    no: 2,
    title: '자바스크립트 ES6 문법',
    content: 'ES6는 let/const 등을 제공합니다.',
  },
  {
    no: 3,
    title: 'Node.js와 Express',
    content: '서버 측 JS 런타임입니다.',
  },

  {
    no: 4,
    title: 'MongoDB 기본 개념',
    content:
      'MongoDB는 NoSQL 데이터베이스로 JSON과 유사한 문서 기반 데이터를 저장하고 관리할 수 있습니다.',
  },
  {
    no: 5,
    title: '프론트엔드와 백엔드의 차이',
    content:
      '프론트엔드는 사용자가 보는 부분을 개발하는 것이고, 백엔드는 서버와 데이터베이스를 관리하는 부분입니다.',
  },
  {
    no: 6,
    title: '비동기 프로그래밍',
    content:
      'JavaScript의 비동기 처리 방식에는 콜백, 프로미스, async/await가 있습니다.',
  },
  {
    no: 7,
    title: 'Vue Router 사용법',
    content:
      'Vue Router를 사용하면 Vue.js 애플리케이션에서 페이지 이동을 쉽게 처리할 수 있습니다.',
  },
  {
    no: 8,
    title: '컴포넌트 기반 개발',
    content:
      'Vue.js에서는 컴포넌트를 사용하여 UI를 작은 단위로 쪼개서 관리할 수 있습니다.',
  },
  {
    no: 9,
    title: 'CSS와 SCSS 차이점',
    content: 'SCSS는 CSS의 확장된 버전으로 변수, 중첩, 믹스인 등을 지원합니다.',
  },
  {
    no: 10,
    title: 'Git과 GitHub 사용법',
    content:
      'Git은 버전 관리 시스템이며, GitHub는 이를 활용한 원격 저장소 플랫폼입니다.',
  },
]);

const sortedPosts = computed(() => {
  return [...posts.value].sort((a, b) => b.no - a.no);
});

const handleAddPost = (newPost) => {
  const nextNo =
    posts.value.length > 0 ? Math.max(...posts.value.map((p) => p.no)) + 1 : 1;
  posts.value.push({ no: nextNo, ...newPost });
};

const handleUpdatePost = (updatedPost) => {
  const index = posts.value.findIndex((p) => p.no === updatedPost.no);
  if (index !== -1) posts.value[index] = updatedPost;
};

const handleDeletePost = (no) => {
  posts.value = posts.value.filter((p) => p.no !== no);
};
</script>

<style>
#app {
  max-width: 600px;
  margin: 50px auto;
  font-family: sans-serif;
}
h1 {
  text-align: center;
}
</style>
