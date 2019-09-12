<template>
  <div class="background">
    <div id="clouds" class="stage"></div>
    <div class="loginMain"></div>
    <div id="loginForm">
      <div class="row-fluid">
        <h1 class="title">学习用DemoProject</h1>
        <el-form :model="loginData" label-position="left" :inline="true" hide-required-asterisk>
          <el-form-item  prop="username">
            <el-input v-model="loginData.username" placeholder="账号" />
          </el-form-item>
          <el-form-item  prop="password">
            <el-input v-model="loginData.password" placeholder="密码" />
          </el-form-item>
          <el-form-item  prop="password">
            <span @click="reloadImage">
              <img ref="vCode" :src="vCodeImg" style="width: 150px;height: 40px"/>
            </span>
          </el-form-item>
          <el-form-item  prop="vcode">
            <el-input v-model="loginData.verifyCode" placeholder="验证码"/>
          </el-form-item>
          <el-form-item style="width:100%;">
            <el-button type="primary" style="width:100%;" @click="login">登录</el-button>
          </el-form-item>
        </el-form>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'login',
  data () {
    return {
      vCodeImg: `http://localhost:8666/tiafs/public/v1/vCode?v=${new Date().getTime()}`,
      loginData: {
        username: '',
        password: '',
        verifyCode: ''
      }
    }
  },
  methods: {
    reloadImage () {
      this.vCodeImg = `http://localhost:8666/tiafs/public/v1/vCode?v=${new Date().getTime()}`
      console.log(this.vCodeImg)
    },
    login () {
      console.log(this.loginData)
      this.$services.login(this.loginData).then(data => {
        console.log(data.data)
        if (data.data.code === 101) {
          console.log(1131313)
          this.$alert(data.data.message)

          return
        }
        console.log('jwt:', data.data.result)
        debugger
        this.$cookies.set('username', this.loginData.username, 24 * 60 * 60 * 1000)
        this.$cookies.set('token', data.data.result)
        sessionStorage.setItem('token', data.data.result)
        this.$alert('登录成功')
        this.$router.push({
          name: 'user'
        })
      })
    }
  }

}

</script>

<style scoped>
  @import "../../style/base.css";
  @import "../../style/admin-all.css";
  @import "../../style/bootstrap-responsive.min.css";
  @import "../../style/login.css";
</style>
