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
		<form action="/actualizar" method="POST" class="col-sm-5">
			<div class="card">
				<div class="card-header">
					<h4>Edit User</h4>
				</div>
				<div class="card-body">
					<div class="form-group">
						<label>Id:</label> <input type="text" name="id"
							class="form-control" value="${user.id}" readonly="readonly">
					</div>
					<div class="form-group">
						<label>Last Name:</label> <input type="text" name="firstName"
							class="form-control" value="${user.firstName}">
					</div> 

					<div class="form-group">
						<label>Last Name:</label> <input type="text" name="lastName"
							class="form-control" value="${user.lastName}">
					</div>
					<div class="form-group">
						<label>Dni: </label> <input type="text" name="dni"
							class="form-control" value="${user.dni}">
					</div>

				</div>
				<div class="card-footer">
					<input type="submit" value="Update" class="btn btn-info" /> <a
						href="/listar" classs="btn btn-link">Return</a>
				</div>


			</div>
		</form>
	</div>
</body>
</html>