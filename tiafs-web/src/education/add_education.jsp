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
<script type="text/javascript">
        $(function () {
            $(".datepicker").datepicker();

            $('#list').hide();
            $('#find').click(function () {
                $('#list').show();
            });
			$('.btnedit').click(function(){
				$.acc('Maintain-edit.html');
				alert('');
				}) 
		})
		</script>
	</head>
	<body>
    	<div class="alert alert-info">当前位置<b class="tip"></b>教学管理<b class="tip"></b>添加教学情况</div>

    	<form method="post" action="../educationServlet/save.do">
    	<input type="hidden" name="usercode" value="${sessionScope.teacher.usercode }"/>
    	<table class="table table-striped table-bordered table-condensed list">
        	<tbody>

            	<tr>
                	<td width="15%">主讲课程名称<font color="FF0000">*</font></td>
                	<td width="500">
                    	<input id="eduname" name="eduname" type="text" />
                	</td>
                	<td width="500">班级学生人数<font color="FF0000">*</font></td>
                	<td width="500">
                    	<input id="edustudent" name="edustudent" type="text" /></td>
            	</tr>
            	<tr>
                	<td>授课时间<font color="FF0000">*</font></td>
                	<td>
                    	<input id="edudate" name="edudate" type="text" /></td>
                    <td>学时<font color="FF0000">*</font></td>
                	<td>
                    	<input id="edutime" name="edutime" type="text" /></td>
            	</tr>
            	<tr>
                	<td>工作量<font color="FF0000">*</font></td>
                	<td>
                    	<input id="workload" name="workload" value="" type="text" />
                	</td>
                	<td>质量系数<font color="FF0000">*</font></td>
                	<td>
                    	<input id="mass" name="mass" type="text" />
                	</td>
            	</tr>
            	<tr>
                	<td>授课分值<font color="FF0000">*</font></td>
                	<td colspan="3">
                    	<input id="eduscore" name="eduscore" type="text" /></td>
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
        </form>
	</body>
</html>
