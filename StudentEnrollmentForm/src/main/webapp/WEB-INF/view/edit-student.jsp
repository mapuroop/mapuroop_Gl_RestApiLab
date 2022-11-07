<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>


	<div class="container mt-3">

		<h1>Edit Student Form</h1>
		<form action="updateStudent" method="post">

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="id">Id</label> <input type="text"
							value="${student.id}" class="form-control" id="id" name="id"
							readonly="readonly">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="name">Name</label> <input type="text"
							value="${student.name }" class="form-control" id="name"
							name="name" placeholder="Enter Name">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="firstname">FirstName</label> <input type="text"
							value="${student.firstname }" class="form-control" id="firstname" name="firstname"
							placeholder="Edit firstname">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="lastname">LastName</label> <input type="text"
							value="${student.lastname }" class="form-control" id="lastname" name="lastname"
							placeholder="Edit lastname">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="course">Course</label>
						<p>Please edit your course</p>
						  <input type="radio" id="html" name="course" value="HTML">
						  <label for="html">HTML</label><br>   <input type="radio"
							id="css" name="course" value="CSS">   <label for="css">CSS</label><br>
						  <input type="radio" id="javascript" name="course"
							value="JavaScript">   <label for="javascript">JavaScript</label>
						<br>
					</div>
				</div>

			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>

</body>
</html>