<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>AppCriadouro</title>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Cadastro de canários</h2>
		<form action="/canario/incluir" method="post">
		<c:import url="/WEB-INF/jsp/ave/cadastro.jsp"/>
		<div class="mb-3 mt-3">
				<label >Tipo:</label> <input type="text"
					class="form-control" placeholder="Entre o tipo"
					name="tipo">
			</div>
		
			<div class="mb-3 mt-3">
				<label for="raca">Raça:</label> <input type="text"
					class="form-control" placeholder="Entre com a raça"
					name="raca">
			</div>
			<div class="mb-3">
				<label for="classificacao">Classificação:</label> <input type="text"
					class="form-control" placeholder="Entre com sua senha"
					name="classificacao">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>