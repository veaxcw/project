<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>教师年度工作填报系统</title>
   		<link rel="stylesheet" type="text/css" href="../Styles/bootstrap.min.css" />
    	<link rel="stylesheet" type="text/css" href="../Styles/admin-all.css" />
    	<script type="text/javascript" src="../Scripts/jquery-1.7.2.js"></script>
    	<script type="text/javascript" src="../Scripts/jquery-ui-1.8.22.custom.min.js"></script>
    	<link rel="stylesheet" type="text/css" href="../Styles/ui-lightness/jquery-ui-1.8.22.custom.css" />

	</head>
	<body>
    	<div class="alert alert-info">当前位置<b class="tip"></b>个人信息<b class="tip"></b>修改个人信息</div>

    	<form method="post" action="../teacherServlet/update.do">
    	<table class="table table-striped table-bordered table-condensed list">
        	<tbody>

            	<tr>
                	<td width="15%">教师编号<font color="FF0000">*</font></td>
                	<td width="500">
                    	<input id="usercode" name="usercode" type="text" value="${teacherBean.usercode}" readonly="readonly"/>
                	</td>
                	<td width="500">登陆密码<font color="FF0000">*</font></td>
                	<td width="500">
                    	<input id="password" name="password" type="text" value="${teacherBean.password }"/></td>
            	</tr>
            	<tr>
                	<td>教师姓名<font color="FF0000">*</font></td>
                	<td>
                    	<input id="username" name="username" type="text"  value="${teacherBean.username }"/></td>
                	<td>性别<font color="FF0000">*</font></td>
                	<td>
                		<c:choose>
                			<c:when test="${teacherBean.sex}=='男'">
                				<input id="sex"  name="sex" value="男" type="radio" checked="checked"/>男
								<input id="sex"  name="sex" value="女" type="radio" />女
                			</c:when>
                			<c:otherwise>
                				<input id="sex"  name="sex" value="男" type="radio" />男
								<input id="sex"  name="sex" value="女" type="radio" checked="checked"/>女
                			</c:otherwise>
                		</c:choose>
                    	
					</td>
            	</tr>
            	<tr>
                	<td>年龄<font color="FF0000">*</font></td>
                	<td>
                    	<input id="age" name="age" value="${teacherBean.age }" type="text" />
                	</td>
                	<td>职位<font color="FF0000">*</font></td>
                	<td>
                    	<input id="depart" name="depart" type="text" value="${teacherBean.depart }"/></td>
            	</tr>
            
            	<tr>
                	<td width="15%">毕业院校<font color="FF0000">*</font></td>
                	<td>
                    	<input id="graduschool" name="graduschool" type="text" value="${teacherBean.graduschool }"/>
                	</td>
                	<td width="500">学历学位</td>
                	<td width="500">
                    	<input id="curriculum" name="curriculum" type="text" value="${teacherBean.curriculum }"/>
                	</td>
            	</tr>
           
        	</tbody>
        	<tfoot>
            	<tr>
                	<td colspan="4">
                    	<input class="btn btn-inverse" id="find" type="submit" value="保存" />
                    	<input class="btn btn-inverse" type="reset" value="取消" /></td>
            	</tr>
        	</tfoot>
    	</table>
    	<span >${addsuccess}</span>
        </form>
	</body>
</html>
