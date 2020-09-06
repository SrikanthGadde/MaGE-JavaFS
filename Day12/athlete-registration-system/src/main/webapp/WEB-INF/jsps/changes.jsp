<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateAthlete" method="post">
		<table border="1" style="margin-left: auto;  margin-right: auto;">
			<tr>
				<td>Athlete ID</td>
				<td><input type="number" title="ID must be a valid 4 digit number" name="id" pattern="([0-9]{4})" required readonly value="${athlete.id}"></td>
			</tr>
			<tr>
				<td>Athlete Name</td>
				<td><input type="text" pattern="^([A-Z][a-z]*\s?)+$" value="${athlete.name}"
					maxlength="40" name="name" title="Name should not be empty, should start with an uppercase letter and must be less than 40 characters" required autofocus></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>Male<input type="radio" name="gender" value="Male" required ${(athlete.gender=="Male")? "checked":""}>Female<input
					type="radio" name="gender" value="Female" required ${(athlete.gender=="Female")? "checked":""}></td>
			</tr>
			<tr>
				<td>Category</td>
				<td><select name="category" required>
						<option value="Running" ${(athlete.category=="Running")? "selected":""}>Running</option>
						<option value="High Jump" ${(athlete.category=="High Jump")? "selected":""}>High Jump</option>
						<option value="Hurdles" ${(athlete.category=="Hurdles")? "selected":""}>Hurdles</option>
						<option value="Relay" ${(athlete.category=="Relay")? "selected":""}>Relay</option>
						<option value="Javelin Throw" ${(athlete.category=="Javelin Throw")? "selected":""}>Javelin Throw</option>
						<option value="Short put" ${(athlete.category=="Short put")? "selected":""}>Short put</option>
				</select></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" required value="${athlete.email}"></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="tel" title="Mobile number must be a valid 10 digit number" value="${athlete.mobile}" name="mobile" pattern="([0-9]{10})" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="UPDATE"></td>
				<td><a href="http://localhost:8080/athlete-registration-system/">Home</a>
			</tr>
		</table>
	</form>
</body>
</html>