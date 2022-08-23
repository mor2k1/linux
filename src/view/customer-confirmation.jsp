<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<title>Confirmation Page</title>
<body>

The customer is confirmed: ${customer.firstName} ${customer.lastName}
<br/>
Free passes: ${customer.freePasses}
<br/>
Zip code: ${customer.postalCode}
<br/>
Course Code: ${customer.courseCode}
</body>
</html>