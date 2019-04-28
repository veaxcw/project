<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
   <title>教师年度工作填报系统</title>
    <link rel="icon" href="favicon.ico" type="image/x-icon" />
	<link rel="shortcut icon" href="favicon.ico" type="image/x-icon" /> 
    <link rel="stylesheet" type="text/css" href="Styles/admin-all.css" />
    <link rel="stylesheet" type="text/css" href="Styles/base.css" />
    <link rel="stylesheet" type="text/css" href="Styles/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="Styles/ui-lightness/jquery-ui-1.8.22.custom.css" />
    <script type="text/javascript" src="Scripts/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="Scripts/jquery-ui-1.8.22.custom.min.js"></script>
    <script type="text/javascript" src="Scripts/index.js"></script>
  </head>
  
<body>
    <div class="warp">
        <!--头部开始-->
        <div class="top_c">
            <div class="top-menu">
                <ul class="top-menu-nav">
                    <li><a href="#">首页</a></li>
                    <li><a >科研管理<i class="tip-up"></i></a>
                        <ul class="kidc">
                            <c:choose>
							 <c:when test="${teacher.roleid==1}">
                           		<li><a target="Conframe" href="${pageContext.request.contextPath}/findByCondition">科研项目管理</a></li>
                            	<li><a target="Conframe" href="${pageContext.request.contextPath}/researchResultServlet/findByCondition">科研成果管理</a></li>
                            </c:when>
                            <c:otherwise>
                            	<li><a target="Conframe" href="${pageContext.request.contextPath}/findByUserCode">科研项目</a></li>
                            	<li><a target="Conframe" href="research/add_research.jsp">增加科研项目</a></li>
                            	<li><a target="Conframe" href="${pageContext.request.contextPath}/researchResultServlet/findByUsercode">科研成果</a></li>
                            	<li><a target="Conframe" href="research/add_researchresult.jsp">增加科研成果</a></li>
                            </c:otherwise>
                            </c:choose>
                        </ul>
                    </li>
                    
                    <li><a >论文管理<i class="tip-up"></i></a>
                        <ul class="kidc">
                            <c:choose>
							 <c:when test="${teacher.roleid==1}">
                            <li><b class="tip"></b><a target="Conframe" href="articleServlet/findByCondition.do">论文信息</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="articleServlet/findTotal.do">论文统计</a></li>
                            </c:when>
                            <c:otherwise>
                             <li><b class="tip"></b><a target="Conframe" href="articleServlet/findByUsercode.do">论文信息</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="article/add_article.jsp">增加论文</a></li>
                            </c:otherwise>
                            </c:choose>
                        </ul>
                    </li>
                    
                    <li><a >教学管理<i class="tip-up"></i></a>
                        <ul class="kidc">
                            <c:choose>
                             <c:when test="${teacher.roleid==1}">
                            <li><b class="tip"></b><a target="Conframe" href="prizeServlet/findByCondition.do">获奖管理</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="educationServlet/findByCondition.do">教学管理</a></li>
                            </c:when>
                            <c:otherwise>
                            <li><b class="tip"></b><a target="Conframe" href="educationServlet/findByUsercode.do">教学情况</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="education/add_education.jsp">增加教学情况</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="prizeServlet/findByUsercode.do">获奖管理</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="education/add_prize.jsp">添加获奖</a></li>
                            </c:otherwise>
                            </c:choose>
                        </ul>
                    </li>
                    

					<li><a >人员管理<i class="tip-up"></i></a>
                        <ul class="kidc">
                         <c:choose>
                         <c:when test="${teacher.roleid==1}">
                            <li><b class="tip"></b><a target="Conframe" href="${pageContext.request.contextPath}/teacherServlet/findByCondition">教师列表</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="teaching/teacher_add.jsp">添加教师</a></li>
                         </c:when>
                         <c:otherwise>
                             <li><b class="tip"></b><a target="Conframe" href="${pageContext.request.contextPath}/teacherServlet/findByCondition">教师列表</a></li>
                             <li><b class="tip"></b><a target="Conframe" href="teaching/teacher_add.jsp">添加教师</a></li>
                         </c:otherwise>
                         </c:choose>
                        </ul>
                    </li>

					<li><a >个人信息<i class="tip-up"></i></a>
                        <ul class="kidc">
                        <li><b class="tip"></b><a target="Conframe" href="teacherServlet/findById.do?usercode=${teacher.usercode}">查看个人信息</a></li>
                        </ul>
                    </li>

                </ul>
            </div>
            <div class="top-nav">欢迎您，<span style="color: red;font-size: 20px;">${teacher.username}</span>！&nbsp;&nbsp;<a href="#">修改密码</a> | <a href="login.jsp">安全退出</a></div>
        </div>
        <!--头部结束-->
        <!--左边菜单开始-->
        <div class="left_c left">
            <h1>导航栏</h1>
            <div class="acc">
                <div>
                    <a class="one">科研管理</a>
                    <ul class="kid">
                     <c:choose>
							 <c:when test="${teacher.roleid==1}">
                           		<li><a target="Conframe" href="${pageContext.request.contextPath}/findByUserCode">科研项目管理</a></li>
                            	<li><a target="Conframe" href="${pageContext.request.contextPath}/researchResultServlet/findByCondition">科研成果管理</a></li>
                            </c:when>
                            <c:otherwise>
                            	<li><a target="Conframe" href="${pageContext.request.contextPath}/findByUserCode">科研项目</a></li>
                            	<li><a target="Conframe" href="research/add_research.jsp">增加科研项目</a></li>
                            	<li><a target="Conframe" href="${pageContext.request.contextPath}/researchResultServlet/findByUsercode">科研成果</a></li>
                            	<li><a target="Conframe" href="research/add_researchresult.jsp">增加科研成果</a></li>
                            </c:otherwise>
                            </c:choose>
                    </ul>
                </div>
                
                <div>
                    <a class="one">论文管理</a>
                    <ul class="kid">
                           <c:choose>
							 <c:when test="${teacher.roleid==1}">
                            <li><b class="tip"></b><a target="Conframe" href="articleServlet/findByCondition.do">论文信息</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="article/total_article.jsp">论文统计</a></li>
                            </c:when>
                            <c:otherwise>
                             <li><b class="tip"></b><a target="Conframe" href="articleServlet/findByUsercode.do">论文信息</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="article/add_article.jsp">增加论文</a></li>
                            </c:otherwise>
                            </c:choose>
                        </ul>
                </div>
                
                <div>
                    <a class="one">教学管理</a>
                    <ul class="kid">
                        <c:choose>
                             <c:when test="${teacher.roleid==1}">
                            <li><b class="tip"></b><a target="Conframe" href="prizeServlet/findByCondition.do">获奖管理</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="educationServlet/findByCondition.do">教学管理</a></li>
                            </c:when>
                            <c:otherwise>
                            <li><b class="tip"></b><a target="Conframe" href="educationServlet/findByUsercode.do">教学情况</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="education/add_education.jsp">增加教学情况</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="prizeServlet/findByUsercode.do">获奖管理</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="education/add_prize.jsp">添加获奖</a></li>
                            </c:otherwise>
                            </c:choose>
                    </ul>
                </div>
                

                <div>
                  <a class="one">人员管理</a>
                    <ul class="kid">
                        <c:choose>
                            <c:when test="${teacher.roleid==1}">
                            <li><b class="tip"></b><a target="Conframe" href="${pageContext.request.contextPath}/teacherServlet/findByCondition">教师列表</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="teaching/teacher_add.jsp">添加教师</a></li>
                    </ul>
                     		</c:when>
							 <c:otherwise>
                                 <li><b class="tip"></b><a target="Conframe" href="teacherServlet/findByCondition.do">教师列表</a></li>
                                 <li><b class="tip"></b><a target="Conframe" href="teaching/teacher_add.jsp">添加教师</a></li>
                             </c:otherwise>
                             </c:choose>
                </div>
                <div>
					<a class="one">个人信息</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="teacherServlet/findById.do?usercode=${teacher.usercode}">查看个人信息</a></li>
                    </ul>
                </div>
                <div id="datepicker"></div>
            </div>

        </div>
        <!--左边菜单结束-->
        <!--右边框架开始-->
        <div class="right_c">
            <div class="nav-tip" onclick="javascript:void(0)">&nbsp;</div>

        </div>
        <div class="Conframe">
            <iframe name="Conframe" id="Conframe" >

            </iframe>
        </div>
        <!--右边框架结束-->

        <!--底部开始-->
        <div class="bottom_c">Copyright &copy;2014-2015 计算机与通信学院 软件学院 版权所有</div>
        <!--底部结束-->
    </div>
</body>
</html>
