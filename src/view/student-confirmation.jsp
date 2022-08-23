<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<title>Confirmation Page</title>
<body>

<h1>Confirmation Page:</h1>
<hr><br/>
Hello ${student.firstName} ${student.lastName}. Your submission completed successfully! 
<br/>
Country: ${student.country}
<br/>
Favorite programming language is: ${student.programmingLanguage}
<br/>
Operating Systems:

<c:forEach var="os" items="${student.operatingSystem}">
	<li>${os}</li>
</c:forEach>
</body>
</html>