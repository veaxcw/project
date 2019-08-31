
<template>
  <div class="background">
    <div id="clouds" class="stage"></div>
    <div class="loginMain"></div>
    <div id="loginForm">
      <div class="row-fluid">
        <h1 class="title">学习用DemoProject</h1>
        <el-form :model="loginForm" label-position="left" label-width="0pix">
          <el-form-item >
            <el-input v-model="loginForm.username" auto-complete="off" placeholder="账号"/>
          </el-form-item>
          <el-form-item >
            <el-input v-model="loginForm.password" auto-complete="off" placeholder="账号"/>
          </el-form-item>
          <el-form-item >
            <el-input v-model="loginForm.verifyCode" auto-complete="off" placeholder="验证码"/>
          </el-form-item>
          <el-form-item style="width:100%;">
            <el-button type="primary" style="width:100%;" >登录</el-button>
          </el-form-item>
        </el-form>
      </div>
    </div>
  </div>
</template>

<script>

    import Sidentify from "../identify/identify"
    export default {
        name: "login",
        components:{
          Sidentify
        },
        data(){
          return{
            loginForm:{
              username:'',
              password:'',
              verifyCode:''
            }
          }
        }

    }



    function reloadImage(){
      document.getElementById("identity").src="/tiafs/api/checkCode?ts=" + new Date().getDate();
    }
    function Login(){

      let username = document.getElementById("username").value;
      let password = document.getElementById("password").value;
      let checkCode = document.getElementById("code").value;

      $.ajax({
        type:"POST",
        url:"/tiafs/api/login",
        dataType:"json",
        contentType:"application/json",
        data:JSON.stringify({
          "username": username,
          "password": password,
          "checkCode": checkCode
        }),
        async:false,
        success:function(result) {
          console.log(result);
          if(result.code == 200){
            window.location.href = "index.html";
          }
          if(result.code == 401){
            alert("验证码输入错误");
          }else if(result.code == 402){
            alert("用户名或者密码错误");
          }

        }
      });
    }

</script>

<style scoped>



@import "../../style/base.css";
@import "../../style/admin-all.css";
@import "../../style/bootstrap-responsive.min.css";
@import "../../style/login.css";
</style>
