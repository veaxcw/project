<template>
  <div>
    <router-view></router-view>
  </div>
</template>

<script>
import Login from './components/login/login'

export default {
  name: 'App',
  components: {Login}
}
</script>

<style>

</style>
