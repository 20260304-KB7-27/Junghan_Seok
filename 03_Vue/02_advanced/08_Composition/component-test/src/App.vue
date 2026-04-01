<template>
  <div class="container">
    <div class="card card-body bg-light">
      <div classe="title">:: Todolist App</div>
    </div>
    <div class="card card-default card-borderless">
      <div class="card-body">
        <InputTodo @add-todo="addTodo"></InputTodo>
        <TodoList
          :todoList="state.todoList"
          @delete-todo="deleteTodo"
          @toggle-completed="toggleCompleted"
        ></TodoList>
      </div>
    </div>
  </div>
</template>
<script setup>
import { reactive, onMounted } from 'vue';
import InputTodo from './components/InputTodo.vue';
import TodoList from './components/TodoList.vue';

const ts = new Date().getTime();
const state = reactive({ todoList: [] });
const emit = defineEmits(addTodo, toggleCompleted, deleteTodo);
onMounted(() => {
  state.todoList.push({ id: ts, todo: '자전거 타기 ', completed: false });
  state.todoList.push({ id: ts + 1, todo: '딸과 공원 산책 ', completed: true });
  state.todoList.push({
    id: ts + 2,
    todo: '일요일 애견 카페 ',
    completed: false,
  });
  state.todoList.push({ id: ts + 3, todo: 'Vue 원고 집필 ', completed: false });
});

const addTodo = (e) => {
  if (todo.value === '') return;

  emit('add', {
    id: new Date().getTime(),
    todo: todo.value,
    completed: e.ctrlKey ? true : false,
  });
};

const toggleCompleted = () => {
  let index = state.todoList.value;
};
</script>
