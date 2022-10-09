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
		<h2>Cadastro de coleiro</h2>
		<form action="/curio/incluir" method="post">
		<c:import url="/WEB-INF/jsp/ave/cadastro.jsp"/>
		<div class="mb-3 mt-3">
				
					 <label>Canto praia:</label>
		  <label class="radio-inline">
		      <input type="radio" name="cantPraia" value="true" checked> Sim
		  </label>
		  <label class="radio-inline">
		      <input type="radio" name="cantPraia" value="false"> N�o
		  </label>
			</div>
		
			<div class="mb-3 mt-3">
				<label for="categoria">Categoria:</label> <input type="text"
					class="form-control" placeholder="Entre com a categoria do curi�"
					name="categoria">
			</div>
			<div class="mb-3">
				<label for="tempCantMin">Tempo em minutos cantando:</label> <input type="number"
					class="form-control" placeholder="Entre com tempo cantado em minutos"
					name="tempCantMin">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>