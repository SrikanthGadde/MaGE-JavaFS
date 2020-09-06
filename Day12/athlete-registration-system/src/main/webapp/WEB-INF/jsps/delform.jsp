<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="deleteAthlete" method="post">
		<table border="1" style="margin-left: auto;  margin-right: auto;">
			<tr>
				<td>Athlete ID</td>
				<td><input type="number" title="ID must be a valid 4 digit number" name="id" pattern="([0-9]{4})" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="DELETE"><input type="reset" value="CANCEL"></td>
				<td><a href="http://localhost:8080/athlete-registration-system/">Home</a>
			</tr>
		</table>
	</form>
</body>
</html>