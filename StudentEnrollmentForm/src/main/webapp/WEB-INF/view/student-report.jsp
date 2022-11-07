<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

                      ****   Student Relation Management ****
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>


	<div class="container mt-3">

		<h1>Add Student Form</h1>
		<a href="addStudent" class="btn btn-primary"> Add Student </a>
		<div class="row">

			<table class="table table-hover">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Name</th>
						<th scope="col">FirstName</th>
						<th scope="col">LastName</th>
						<th scope="col">Course</th>
						<th scope="col">Edit</th>
						<th scope="col">Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="stu" items="${student}">
						<tr>
							<td class="table-plus">${stu.id}</td>
							<td>${stu.name}</td>
							<td>${stu.firstname}</td>
							<td>${stu.lastname}</td>
							<td>${stu.course}</td>
							<td><a href="editStudent/${stu.id}" class="btn btn-warning">
									Edit </a></td>
							<td><a href="deleteStudent/${stu.id}"
								class="btn btn-danger"> Delete </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>