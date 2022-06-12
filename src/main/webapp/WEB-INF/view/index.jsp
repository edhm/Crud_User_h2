<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container mt-4">
		<a href="/nuevo" class="btn btn-succes">Add User</a>
		<table class="table">
			<thead>
				<tr>
					<th>ID:</th>
					<th>First name:</th>
					<th>Last name:</th>
					<th>Sex:</th>
					<th>Dni:</th>
					<th>Email:</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${users}">
					<tr>
						<td>${user.id}</td>
						<td>${user.firstName}</td>
						<td>${user.lastName}</td>
						<td>${user.sex}</td>
						<td>${user.dni}</td>
						<td>${user.email}</td>
						<td><a href="/editar/${user.id}" class="btn btn-warning">Edit</a>
							<a href="/eliminar/${user.id}" class="btn btn-danger">Delete</a></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
</body>
</html>