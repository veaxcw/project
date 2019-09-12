<template>
  <div>
    <div> 用户名：<a>{{user.username}}</a></div>
    <button @click="getUserInfo">
      测试
    </button>
  </div>
</template>

<script>
  export default {
    name: 'user',
    data () {
      return {
        user: {
          username: ''
        }
      }
    },
    created () {
      this.getUserInfo()
    },
    methods: {
      getUserInfo () {
        // this.$services.getUserInfo(null)

         this.$services.getUserInfo(null).then(data => {
           console.log(data.data)
          if(data.data.code === 200){
            console.log(data.username)
            this.user.username = data.data.result.username
          }
        })
      }
    }
  }
</script>
