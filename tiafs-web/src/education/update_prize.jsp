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
    	<div class="alert alert-info">当前位置<b class="tip"></b>教学管理<b class="tip"></b>修改获奖信息</div>

    	<form method="post" action="../prizeServlet/update.do" enctype="multipart/form-data">
    	<input type="hidden" name="usercode" value="${sessionScope.teacher.usercode }"/>
    	<input type="hidden" name="pid" value="${prize.pid}"/>
    	<table class="table table-striped table-bordered table-condensed list">
        	<tbody>

            	<tr>
                	<td width="15%">获奖项目名称<font color="FF0000">*</font></td>
                	<td width="500">
                    	<input id="pname" name="pname" value="${prize.pname }" type="text" />
                	</td>
                	<td width="500">上传获奖证书<font color="FF0000">*</font></td>
                	<td width="500">
                    	<input id="ppath" name="ppath" value="${prize.ppath }" type="file" /></td>
            	</tr>
            	<tr>
                	<td>获奖时间<font color="FF0000">*</font></td>
                	<td>
                    	<input class="ipt datepicker" size="16" type="text" id="pdate" name="pdate" value="${prize.pdate }"/>
                    	<span class="add-on"><i class="icon-calendar"></i></span>
                    </td>
                    <td>上传时间<font color="FF0000">*</font></td>
                	<td>
                    	<input class="ipt datepicker" size="16" type="text" id="uploaddate" name="uploaddate" value="${prize.uploaddate }" />
                    	<span class="add-on"><i class="icon-calendar"></i></span>
                    </td>
            	</tr>
            	<tr>
                	<td>颁发单位<font color="FF0000">*</font></td>
                	<td>
                    	<input id="pdepart" name="pdepart" value="${prize.pdepart }" type="text" />
                	</td>
                	<td>获奖等级<font color="FF0000">*</font></td>
                	<td>
                    	<input id="diploma" name="diploma" value="${prize.diploma }" type="text" />
                	</td>
            	</tr>
            	<tr>
                	<td>简介<font color="FF0000">*</font></td>
            		<td colspan="3"><textarea name="summary"  rows="10" style="width: 820px;">${prize.summary }</textarea></td>
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
