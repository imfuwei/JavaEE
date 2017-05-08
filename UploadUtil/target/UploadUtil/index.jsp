<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
  <form action="upload.action" method="post" enctype="multipart/form-data">
	<input type="file" name="file">
	<input type="submit" value="上传">
	</form>
	<br><a href="look.action">查看所有文件</a>
  </body>
</html>
