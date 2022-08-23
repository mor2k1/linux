<!DOCTYPE html>
<html>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css"> 
<body>
<img src="${pageContext.request.contextPath}/resources/images/spring-logo.jpg" width="50px" height="50px">
	<form action="processFormV3" method="GET">
		<input type="text" placeholder="Enter your name:" name="user"> 
		<input type="submit" value="Submit now">
	</form>

</body>
</html>