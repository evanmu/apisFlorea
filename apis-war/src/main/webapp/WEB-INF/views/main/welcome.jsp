<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="com.openIdeas.apps.apisflorea.util.PropertyFileUtil"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<%@ include file="/common/global.jsp"%>
<%@ include file="/common/meta.jsp"%>

<%@ include file="/common/include-base-styles.jsp"%>
<%@ include file="/common/include-jquery-ui-theme.jsp"%>
<link
	href="${ctx }/js/common/plugins/jui/extends/portlet/jquery.portlet.min.css?v=1.1.2"
	type="text/css" rel="stylesheet" />
<link href="${ctx }/js/common/plugins/qtip/jquery.qtip.css?v=1.1.2"
	type="text/css" rel="stylesheet" />
<%@ include file="/common/include-custom-styles.jsp"%>
<style type="text/css">
.template {
	display: none;
}

.version {
	margin-left: 0.5em;
	margin-right: 0.5em;
}

.trace {
	margin-right: 0.5em;
}

.center {
	width: 1200px;
	margin-left: auto;
	margin-right: auto;
}
</style>

<script src="${ctx }/js/common/jquery-1.8.3.js" type="text/javascript"></script>
<script
	src="${ctx }/js/common/plugins/jui/jquery-ui-${themeVersion }.min.js"
	type="text/javascript"></script>
<script
	src="${ctx }/js/common/plugins/jui/extends/portlet/jquery.portlet.pack.js?v=1.1.2"
	type="text/javascript"></script>
<script src="${ctx }/js/common/plugins/qtip/jquery.qtip.pack.js"
	type="text/javascript"></script>
<script src="${ctx }/js/common/plugins/html/jquery.outerhtml.js"
	type="text/javascript"></script>
<script src="${ctx }/js/module/main/welcome-portlet.js"
	type="text/javascript"></script>
</head>
<body style="margin-top: 1em;">
	<div class="center">
		<div style="text-align: center;">
			<h3>欢迎使用Apis Florea，为专业的电信接口服务</h3>
		</div>
		<div id='portlet-container'></div>
	</div>
	<div class="project-info template">
		<ul>
			<li>本应用主要用于企业批量发送短信使用</li>
			<li>1. 首先设置<a>手机用户</a>
			</li>
			<li>2. 然后使用类似http://xx的请求进行发短信处理</a>
			</li>
		</ul>
	</div>
</body>
</html>
