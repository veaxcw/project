package com.bilibili.main.controller;

import com.bilibili.main.model.ModelConfig;
import com.bilibili.main.model.User;
import com.bilibili.main.model.UserExample;
import com.bilibili.main.service.UserServices;
import com.bilibili.main.utils.CommonUtils;
import com.sun.mail.util.MailSSLSocketFactory;
import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.GeneralSecurityException;
import java.util.*;

@Controller
public class UserController {

    private List<User> users = null;

    private ApplicationContext context = new AnnotationConfigApplicationContext(ModelConfig.class);

    private Map<String,String[]> map = null;

    private UserExample userExample = (UserExample)context.getBean("userExample");


    @Resource
    private UserServices userServices ;

    @RequestMapping("login")
    public String login(HttpServletRequest request){

        map = new HashMap<>(request.getParameterMap());

        User user = CommonUtils.toBean(map,User.class);//map的key与user的field匹配

        userExample.createCriteria().andUserNameEqualTo(user.getUserName());

        users = userServices.selectByExample(userExample);

        Iterator<User> iterable = users.iterator();

        while (iterable.hasNext()){
            User userTemp = iterable.next();
            if(user.getUserName().equals(userTemp.getUserName()) && user.getPassword().equals(userTemp.getPassword())){
                request.getSession().setAttribute("userName",userTemp.getUserName());//返回用户名
                request.getSession().setAttribute("userIcon",userTemp.getUserIcon());//返回用户头像路径
                return "index";
            }
            else
                return null;//TODO

        }


        return null;

    }

    @RequestMapping("register")
    public String register(HttpServletRequest request){
        map = new HashMap<>(request.getParameterMap());
        String[] verifyCode = map.get("checkCode");
        if(verifyCode[0].toLowerCase().equals(request.getSession().getAttribute("verifyCode"))){
            map.remove("checkCode");
            User user = CommonUtils.toBean(map,User.class);
            userServices.insert(user);
        }
         return "loginnew";
    }

    @RequestMapping("userInfo")
    public String userInfo(HttpServletRequest request){//用户信息
        String userName = (String) request.getSession().getAttribute("userName");
        userExample.createCriteria().andUserNameEqualTo(userName);
        users = userServices.selectByExample(userExample);
        System.out.println(users.get(0).toString());
        request.setAttribute("user",users.get(0));

        return "Information";
    }

    /**修改密码**/
    @RequestMapping("changePassword")
    public String changePassword(HttpServletRequest request, HttpServletResponse response){

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = null;

        map = new HashMap<>(request.getParameterMap());
        //userExample一般用作查询，更新等的条件部分
        userExample.createCriteria().andUserNameEqualTo((String) request.getSession().getAttribute("userName"));


        String oldPassword = userServices.selectByExample(userExample).get(0).getPassword();

        if (oldPassword.equals(map.get("oldPassword")[0])) {
            if(!map.get("newPassword")[0].equals(map.get("newPasswordConfirm")[0])){//两次输入密码不匹配
                try {
                    out = response.getWriter();
                    out.print("<script>alert('两次输入密码不匹配');history.back() </script>");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{

                User user = (User)context.getBean("user");
                user.setPassword(map.get("newPassword")[0]);
                userServices.updateByExampleSelective(user,userExample);//选择性插入
            }
        } else {
            try {
                out = response.getWriter();
                out.print("<script>alert('原密码输入错');history.back(); </script>");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    /**上传头像**/
    @RequestMapping("changeIcon")
    public void uploadUserIcon(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String userIcon = CommonUtils.uploadFile(request);

        response.setContentType("text/html,charset=utf-8");
        PrintWriter out = response.getWriter();
        if(userIcon == null){
            out.print("<script>alert('上传失败！！');history.back()</script>");

        }else {
            userExample.createCriteria().andUserNameEqualTo((String) request.getSession().getAttribute("userName"));
            User user = (User)context.getBean("user");
            user.setUserIcon(userIcon);
            userServices.updateByExampleSelective(user,userExample);
            out.print("<script>alert('修改成功失败！！');history.back()</script>");
        }

    }

    @RequestMapping("updateEmail")
    public void updateEmail(HttpServletRequest request){
        map = request.getParameterMap();

        User = (User)context.getBean("user");

        Runnable r = ()->{//新建一个线程来发送邮件
            Properties properties = new Properties();

            //设置邮件服务器主机名
            properties.setProperty("mail.host","smtp.qq.com");
            //发送邮件需要认证
            properties.setProperty("mail.smtp.auth","true");
            //发送协议
            properties.setProperty("mail.transport.protocol","smtp");

            //开启SSL加密
            MailSSLSocketFactory sf = null;
            try {
                sf = new MailSSLSocketFactory();
            } catch (GeneralSecurityException e) {
                e.printStackTrace();
            }
            sf.setTrustAllHosts(true);
            properties.put("mail.smtp.ssl.enable","true");
            properties.put("mail.smtp.ssl.socketFactory",sf);

            //创建一个session来发送邮件
            Session session = Session.getDefaultInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    PasswordAuthentication passwordAuthentication = new PasswordAuthentication("","");
                    return super.getPasswordAuthentication();
                }
            });
            //This class represents a MIME style email message.?????
            MimeMessage message = new MimeMessage(session);
            try {
                 message.setFrom(new InternetAddress("878899580@qq.com"));//发件人
                 message.setRecipients(Message.RecipientType.TO,new InternetAddress(map.get("newEmail")[0]));
            } catch (MessagingException e) {
                e.printStackTrace();
            }


        };
    }

}
