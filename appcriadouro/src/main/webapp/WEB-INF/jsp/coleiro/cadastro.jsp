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
		<form action="/coleiro/incluir" method="post">
		<c:import url="/WEB-INF/jsp/ave/cadastro.jsp"/>
		<div class="mb-3 mt-3">
				
					 <label>Canto tui tui:</label>
		  <label class="radio-inline">
		      <input type="radio" name="cantTuiTui" value="true" checked> Sim
		  </label>
		  <label class="radio-inline">
		      <input type="radio" name="cantTuiTui" value="false"> Não
		  </label>
			</div>
		
			<div class="mb-3 mt-3">
				<label for="regiao">Raça:</label> <input type="text"
					class="form-control" placeholder="Entre com a região do coleiro"
					name="regiao">
			</div>
			<div class="mb-3">
				<label for="cantPorMin">Cantos por minuto:</label> <input type="number"
					class="form-control" placeholder="Entre com quntidade de cantos por minuto"
					name="cantPorMin">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>