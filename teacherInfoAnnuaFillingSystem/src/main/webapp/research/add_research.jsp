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
				}); 
		});
		</script>
	</head>
	<body>
    	<div class="alert alert-info">当前位置<b class="tip"></b>科研管理<b class="tip"></b>添加科研项目</div>

    	<form method="post" action="${pageContext.request.contextPath}/save" enctype="multipart/form-data">
    	<input type="hidden" name="usercode" value="${sessionScope.teacher.usercode}"/>
    	<table class="table table-striped table-bordered table-condensed list">
        	<tbody>

            	<tr>
                	<td width="15%">科研项目名称<font color="FF0000">*</font></td>
                	<td width="500">
                    	<input id="rname" name="rname" type="text" />
                	</td>
                	<td width="500">上传科研项目<font color="FF0000">*</font></td>
                	<td width="500">
                    	<input id="rpath" name="rpath" type="file" /></td>
            	</tr>
            	<tr>
                	<td>发表时间<font color="FF0000">*</font></td>
                	<td>
                    	<input class="ipt datepicker" size="16" type="text" id="publishdate" name="publishdate"/>
                    	<span class="add-on"><i class="icon-calendar"></i></span>
                    </td>
                    <td>上传时间<font color="FF0000">*</font></td>
                	<td>
                    	<input class="ipt datepicker" size="16" type="text" id="uploaddate" name="uploaddate"/>
                    	<span class="add-on"><i class="icon-calendar"></i></span>
                    </td>
            	</tr>
            	<tr>
                	<td>发表刊物<font color="FF0000">*</font></td>
                	<td >
                    	<input id="publishreader" name="publishreader" type="text" />
                	</td>
                	<td>所需经费<font color="FF0000">*</font></td>
                	<td >
                    	<input id="funds" name="funds" type="text" />
                	</td>
            	</tr>
            	<tr>
                	<td>科研项目简介<font color="FF0000">*</font></td>
            		<td colspan="3"><textarea name="summary"  rows="10" style="width: 820px;"></textarea></td>
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
