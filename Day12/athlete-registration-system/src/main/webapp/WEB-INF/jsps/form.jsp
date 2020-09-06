<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addAthlete" method="post">
		<table border="1" style="margin-left: auto;  margin-right: auto;">
			<tr>
				<td>Athlete Name</td>
				<td><input type="text" pattern="^([A-Z][a-z]*\s?)+$"
					maxlength="40" name="name" title="Name should not be empty, should start with an uppercase letter and must be less than 40 characters" required autofocus></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>Male<input type="radio" name="gender" value="Male" required>Female<input
					type="radio" name="gender" value="Female" required></td>
			</tr>
			<tr>
				<td>Category</td>
				<td><select name="category" required>
						<option value="Running">Running</option>
						<option value="High Jump">High Jump</option>
						<option value="Hurdles">Hurdles</option>
						<option value="Relay">Relay</option>
						<option value="Javelin Throw">Javelin Throw</option>
						<option value="Short put">Short put</option>
				</select></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" required></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="tel" title="Mobile number must be a valid 10 digit number" name="mobile" pattern="([0-9]{10})" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="ADD"><input type="reset" value="CANCEL"></td>
				<td><a href="http://localhost:8080/athlete-registration-system/">Home</a>
			</tr>
		</table>
	</form>
</body>
</html>