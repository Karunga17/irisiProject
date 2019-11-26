<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Produit List</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		</br>
		<h1>Projet DevOps</h1>
		<h1>Hello mr OUBELLA</h1>
		<div class="alert alert-secondary text-center" role="alert">La liste des produits</div>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">#</th>
					<th scope="col">Name</th>
					<th scope="col">Description</th>
					<th scope="col">Prix</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${produits}">
					<tr>
						<th>${item.id}</th>
						<td>${item.name}</td>
						<td>${item.description}</td>
						<td>${item.prix}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>