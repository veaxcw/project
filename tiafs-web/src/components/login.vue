<template>
  <div class="background">
    <div id="clouds" class="stage"></div>
    <div class="loginMain">
    </div>
    <div id="loginForm">
      <div class="row-fluid">
        <h1 class="title">学习用DemoProject</h1>
        <p style="margin-bottom: 9px">
          <label>帐&nbsp;&nbsp;&nbsp;&nbsp;号：<input type="text" name="username" id="username" /></label>
        </p>
        <p style="margin-bottom: 9px">
          <label>密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="password" id="password" /></label>
        </p>
        <p style="margin-bottom: 9px">
          <label>验证码：<input type="text" id="code" name="checkCode"/>
            <img src="http://localhost:8889/tiafs/api/checkCode" alt="验证码" title="点击更换" id="identity" onclick="reloadImage()"/></label>
        </p>

        <p class="tip">&nbsp;</p>
        <input type="button" value=" 登 录 " class="btn btn-primary btn-large login" onclick="Login()" />
        &nbsp;&nbsp;&nbsp;<input type="reset" value=" 重 置 " class="btn btn-large" />
      </div>
    </div>
  </div>
</template>

<script>
    export default {
        name: "login"
    }

    import "src/scripts/chur.min";

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

@import "../style/base.css";
@import "../style/admin-all.css";
@import "../style/bootstrap-responsive.min.css";
@import "../style/login.css";
</style>
