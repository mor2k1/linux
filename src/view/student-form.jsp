<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<title>User Registration form</title>
<body>

	<!-- The modelAttribute name need to be equal to the written one in the StudentController file -->
	<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName" autocomplete="off" />
		<br />
	Last name: <form:input path="lastName" autocomplete="off" />
		<br/> 
		Country: 
		<form:select path="country">
		<!-- 
			<form:option value="BZL" label="Brazil" />
			<form:option value="ISR" label="Israel" />
			<form:option value="FRN" label="France" />
			<form:option value="GER" label="Germany" />  -->
			
			<form:options items="${student.countryOptions}" />
		</form:select>
		<br/><br/> Favorite BE Language: <br/>
		<!--  
			JAVA <form:radiobutton path="programmingLanguage" value="JAVA"/>
			Python <form:radiobutton path="programmingLanguage" value="Python"/>
			PHP <form:radiobutton path="programmingLanguage" value="PHP"/>
			NodeJS <form:radiobutton path="programmingLanguage" value="NodeJS"/> -->
			
			<form:radiobuttons path="programmingLanguage" items="${student.favoriteLanguage}" />
			<br/>
			<br/>
			Operating System: <br/>
			Windows<form:checkbox path="operatingSystem" value="Windows" />
			Linux<form:checkbox path="operatingSystem" value="Linux" />
			MacOS<form:checkbox path="operatingSystem" value="MacOS" />
			
			<br/>
			<input type="submit" value="submit">
	</form:form>

</body>
</html>
