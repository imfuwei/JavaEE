<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>查看上传文件</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://www.w3cschool.cn/statics/assets/foundation-5.5.3/foundation.min.css">
<script
	src="http://www.w3cschool.cn/statics/assets/jquery/2.0.3/jquery.min.js"></script>
<script
	src="http://www.w3cschool.cn/statics/assets/foundation-5.5.3/js/foundation.min.js"></script>
<script
	src="http://www.w3cschool.cn/statics/assets/foundation-5.5.3/js/vendor/modernizr.js"></script>
</head>

<body style="padding:20px;">

	<h4>上传文件信息</h4>
	<table class="panel">
		<thead>
			<tr>
				<th>文件名</th>
				<th>路径</th>
				<th>上传日期</th>
				<th>大小</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="uploadFile" items="${uploadFiles }">
				<tr>
					<td><c:out value="${uploadFile.fileName}" />
					<td><c:out value="${uploadFile.path}" />
					<td><c:out value="${uploadFile.uploadTime}" />
					<td><c:out value="${uploadFile.length}" />
					<td><a href="delete.action?id=${uploadFile.id}">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>