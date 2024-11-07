<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Sign-Up Page</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
body {
	background-color: #f8f9fa;
}

.container {
	margin-top: 50px;
	max-width: 500px;
}

h2 {
	color: #007bff;
	text-align: center;
	margin-bottom: 20px;
}
</style>
</head>
<body>
	<div class="container">
		<h2>Sign Up</h2>
		<span class="text-success">${success}</span> 
		<span class="text-danger">${failed}</span>

		<form action="signup" method="post">
			<div class="form-group">
				<label for="userId">User Id</label> <input type="number"
					class="form-control" id="userId" name="userId" required value="${dto.userId }">
			</div>
			<div class="form-group">
				<label for="email">Email</label> <input type="email"
					class="form-control" id="email" name="email" required value="${dto.email}">
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					class="form-control" id="password" name="password" required value= "${dto.password }">
			</div>
			<div class="form-group">
				<label for="confirmPassword">Confirm Password</label> <input
					type="password" class="form-control" id="confirmPassword"
					name="confirmPassword" required value= "${dto.confirmPassword }">
			</div>
			<button type="submit" class="btn btn-primary btn-block">Sign
				Up</button>
		</form>
	</div>
</body>
</html>
