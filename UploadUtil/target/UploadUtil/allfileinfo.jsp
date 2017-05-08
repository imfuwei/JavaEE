<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>

<body>

	<%@include file="index.jsp" %>
	<table border="1px">
		<tr>
			<td>文件名</td>
			<td>路径</td>
			<td>上传日期</td>
			<td>大小</td>
			<td>操作</td>
		</tr>
		<c:forEach var="uploadFile" items="${uploadFiles }" >
			<tr>
				<td><c:out value="${uploadFile.fileName}" />
				<td><c:out value="${uploadFile.path}" />
				<td><c:out value="${uploadFile.uploadTime}" />
				<td><c:out value="${uploadFile.length}" />
				<td><a href="delete.action?id=${uploadFile.id}">删除</a></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>
