<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<form action="apply" method="post">
<h2>Register Form</h2><br>
<h3>Enter your Details</h3>

${success}
<span>${failed}</span>
<pre>
Name <input type="text" name="name"/>
Email <input type="text" name="email"/>
Age <input type="number" name="age"/>
City <input type="text" name="city"/>
State <select name="state">
<option>SELECT</option>
<option>Tamil Nadu</option>
<option>Kerala</option>
<option>Andhra</option>
<option>Karnataka</option>
<option>Kashmir</option>
</select>
Country <input type="text" name="country"/>
<input type="submit" value="Confirm"/>
</pre>
</form>
</body>
</html>