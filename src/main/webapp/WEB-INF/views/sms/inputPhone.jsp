<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<%@ include file="/common/global.jsp"%>
<title>设置手机号</title>
<%@ include file="/common/meta.jsp"%>
<%@ include file="/common/include-base-styles.jsp"%>
<%@ include file="/common/include-jquery-ui-theme.jsp"%>
<link
	href="${ctx }/js/common/plugins/jui/extends/timepicker/jquery-ui-timepicker-addon.css"
	type="text/css" rel="stylesheet" />

<link href="${ctx }/js/common/plugins/uploadify/uploadify.css"
	type="text/css" rel="stylesheet" />
<style type="text/css">
input {
	vertical-align: middle;
	margin: 0;
	padding: 0
}

.file-box {
	position: relative;
	width: 340px
}

.txt {
	height: 22px;
	border: 1px solid #cdcdcd;
	width: 180px;
}

.btn {
	background-color: #FFF;
	border: 1px solid #CDCDCD;
	height: 24px;
	width: 70px;
}
</style>
<script src="${ctx }/js/common/jquery-1.8.3.js" type="text/javascript"></script>
<script
	src="${ctx }/js/common/plugins/uploadify/jquery.uploadify.min.js"
	type="text/javascript"></script>
<script
	src="${ctx }/js/common/plugins/jui/jquery-ui-${themeVersion }.min.js"
	type="text/javascript"></script>

</head>

<body>
	<div class="container showgrid">
		<c:if test="${not empty message}">
			<div id="message" class="alert alert-success">${message}</div>
			<!-- 自动隐藏提示信息 -->
			<script type="text/javascript">
				setTimeout(function() {
					$('#message').hide('slow');
				}, 5000);
			</script>
		</c:if>
		<c:if test="${not empty error}">
			<div id="error" class="alert alert-error">${error}</div>
			<!-- 自动隐藏提示信息 -->
			<script type="text/javascript">
				setTimeout(function() {
					$('#error').hide('slow');
				}, 5000);
			</script>
		</c:if>
		<fieldset>
			<legend>
				<small>导入手机号</small>
			</legend>
			<input type="file" name="fileField" class="file" id="fileField" /> <input
				type="button" id="submit" class="btn" value="上传" />
		</fieldset>
	</div>

	<table width="60%" class="need-border">
		<thead width="60%">
			<tr>
				<th width="100">编号</th>
				<th>手机号</th>
			</tr>
		</thead>
		<tbody id='phoneTb'>
		</tbody>
	</table>
</body>
</html>
<script type="text/javascript">
	$(document).ready(function() {
		$('#fileField').uploadify({
			'buttonText' : '浏览...',
			'multi' : false,
			'swf' : '${ctx}/js/common/plugins/uploadify/uploadify.swf',
			'uploader' : '${ctx}/file/upload',
			'auto' : false,
			'fileTypeDesc' : 'csv文件或txt文件',
			'fileTypeExts' : '*.csv;*.txt',
			'with' : '28px',
			'removeCompleted' : false,
			'onComplete' : function(event, ID, fileObj, response, data) {
				listAll();
			}
		});

		$("#submit").bind("click", function() {
			$('#fileField').uploadify('upload', '*');
		});
		
		listAll();
	});

	function listAll() {
		$.ajax({
			url : '${ctx}/phone/list',
			type : 'post',//提交方式
			dataType : 'json',//返回数据的类型
			success : function(data) {
				if (null == data) {
					console.log('没有任何手机号数据');
					return;
				}
				
				if(data.success) {
					for(var item in data.dataSet) {
						appendTr("#phoneTb", data.dataSet[item]);
					}
				} else {
					alert("数据为空")
					//$("#phoneTb").append("<tr></tr>").show();
				}
			},
			error : function(data) {

			}
		})
	}

	function appendTr(el, s) {
		var trString = "<tr>";
		for (i in s) {
			trString += "<td>" + s[i] + "</td>";
		}
		trString += "</tr>";
		$(el).append(trString).show();
	}
</script>
