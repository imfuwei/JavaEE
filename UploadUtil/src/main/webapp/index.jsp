<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>查看上传文件</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="css/foundation.min.css">
<script
	src="js/jquery.min.js"></script>
<script
	src="js/foundation.min.js"></script>
<script
	src="js/vendor/modernizr.js"></script>
</head>


<body>


	<div class="row">
		<div class="medium-12 columns">
			<div class="panel">
				<form action="upload.action" method="post"
					enctype="multipart/form-data">
					<input type="file" name="file"> <input type="submit"
						value="上传">
				</form>
				<br> <a href="look.action">查看所有文件</a>
			</div>
		</div>

	</div>
</body>
</html>
