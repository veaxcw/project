<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<base href="<%=basePath%>"/>
		<title>教师年度工作填报系统</title>
   		<link rel="stylesheet" type="text/css" href="Styles/bootstrap.min.css" />
    	<link rel="stylesheet" type="text/css" href="Styles/admin-all.css" />
    	<script type="text/javascript" src="Scripts/jquery-1.7.2.js"></script>
    	<script type="text/javascript" src="Scripts/jquery-ui-1.8.22.custom.min.js"></script>
    	<link rel="stylesheet" type="text/css" href="Styles/ui-lightness/jquery-ui-1.8.22.custom.css" />
<style>
.table th, .table td 
{ 
	text-align: center; 
}
			/* 正文：分页功能区 */
#pages a
{
    color: #000;
}
#pages a:hover
{
    background: #cddde4;
    border: #97b9c9 solid 1px;
    color: #067db5;
    padding: 5px 9px;
}
#pages a.current_page
{
    background: #FFF;
    border: #89bdd8 solid 1px;
    color: #067db5;
}
/* 正文：分页功能区 */
#pages
{
    width: 940px;
    text-align: center;
    height: 28px;
    line-height: 28px;
    margin-top: 5px;
}
#pages a, #pages a.current_page:hover
{
    padding: 5px 10px;
}

        </style>
	</head>
	<body>
    	<div class="alert alert-info">当前位置<b class="tip"></b>人员管理<b class="tip"></b>教师列表</div>
    	<form method="post" action="${pageContext.request.contextPath}/teacherServlet/findByCondition">
    	<div style="margin-left: 30px;">
    	教师编号：<input id="usercode" name="usercode" type="text" />
    	&nbsp;教师姓名：<input id="username" name="username" type="text" />
    	<a href="${pageContext.request.contextPath}/teacherServlet/findByCondition?page=${page }">
				<input type="submit" value="搜索" class="btn_search" />
    	</a></div><br/>
    	<table class="table table-striped table-bordered table-condensed" align="center">
        	<tbody>
            	<tr class="tr_title" >
                	<th>教师编号</th>
                	<th>教师姓名</th>
                	<th>登陆密码</th>
                	<th>性别</th>
                	<th>年龄</th>
                	<th>职位</th>
                	<th>毕业学校</th>
                	<th>学历学位</th>
                	<th>操作 </th>
            	</tr>
            	<c:forEach items="${teachers}" var="l">
					<tr>
						<td>${l.usercode}</td>
						<td>${l.username}</td>
						<td>${l.password}</td>
						<td>${l.sex}</td>
						<td>${l.age}</td>
						<td>${l.depart}</td>
						<td>${l.graduschool}</td>
						<td>${l.curriculum}</td>
						<td>&nbsp;
							<a class="btn btn-mini btn-danger" href="${pageContext.request.contextPath}/teacherServlet/findById.do?usercode=${l.usercode}">修改</a>
							<c:choose>
							 <c:when test="${l.status==1}">
							 	<a class="btn btn-mini btn-primary add" href="${pageContext.request.contextPath}/teacherServlet/stopUser.do?usercode=${l.usercode}">暂停</a>&nbsp;&nbsp;
							 </c:when>
							 <c:otherwise>
							 	<a class="btn btn-mini btn-danger" href="${pageContext.request.contextPath}/teacherServlet/startUser.do?usercode=${l.usercode}">开通</a>&nbsp;&nbsp;
							 </c:otherwise>
							</c:choose>
                			<a class="btn btn-mini btn-danger" href="${pageContext.request.contextPath}/teacherServlet/delete.do?usercode=${l.usercode}">删除</a>
                		</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<!-- 分页 -->                 
			<div id="pages">
				<c:choose>
					<c:when test="${page==1}">
						<a  onclick="return false;" style="cursor:pointer">上一页</a>
					</c:when>
					<c:otherwise>
						<a href="${pageContext.request.contextPath}/teacherServlet/findByCondition?page=${page-1}" style="cursor:pointer">上一页</a>
					</c:otherwise>
				</c:choose>
				<c:forEach begin="1" end="${maxPage}" var="p">
					<c:choose>
						<c:when test="${page==p}">
							<a href="${pageContext.request.contextPath}/teacherServlet/findByCondition?page=${p}" class="current_page">${p}</a>
						</c:when>
						<c:otherwise>
							<a href="${pageContext.request.contextPath}/teacherServlet/findByCondition?page=${p}">${p}</a>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				<c:choose>
					<c:when test="${page==maxPage}">
						<a  onclick="return false;" style="cursor:pointer">下一页</a>
					</c:when>
					<c:otherwise>
						<a href="${pageContext.request.contextPath}/teacherServlet/findByCondition?page=${page+1 }" style="cursor:pointer">下一页</a>
					</c:otherwise>
				</c:choose>
				</div>
			</form>
 	 </body>
</html>