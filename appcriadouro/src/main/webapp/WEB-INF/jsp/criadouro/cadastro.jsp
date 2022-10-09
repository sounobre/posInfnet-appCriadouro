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

	<c:set var="ativaBotao" value="" />
	
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Cadastro de criadouro</h2>
		<form action="/criadouro/incluir" method="post">
		
		<div class="mb-3 mt-3">
				<label >Nome:</label> <input type="text"
					class="form-control" placeholder="Entre com o nome do criadouro"
					name="nome">
			</div>
		
			<div class="mb-3 mt-3">
				<label for="endereco">Endereço:</label> <input type="text"
					class="form-control" placeholder="Entre com o endereço"
					name="endereco">
			</div>

			<div class="mb-3 mt-3">
				<label >Data de inauguração:</label> <input type="date"
					class="form-control" placeholder="Entre com a data de inauguração do criadouro"
					name="dtCriaddouro">
			</div>
		


 <div class="mb-3 mt-3">
	    	<c:if test="${not empty responsaveis}">
		        <label>Responsavel:</label>
				<select name="responsavel" class="form-control" id="sel1">
				    <c:forEach var="r" items="${responsaveis}">
				    	<option value="${r.id}" >${r.nome}</option>
				    </c:forEach>
			    </select>
		    </c:if>
	    	<c:if test="${empty responsaveis}">
		        <label>Não existem responsaveis cadastrados!</label>
		        <c:set var="ativaBotao" value="disabled" />
		    </c:if>
	    </div>	    

	    <div class="mb-3 mt-3">
	    	<c:if test="${not empty aves}">
		        <label>Aves:</label>
		      	<c:forEach var="a" items="${aves}">
					<div class="checkbox">
					  <label><input type="checkbox" name="aves" value="${a.id}"> ${a.nome}</label>
					</div>
				</c:forEach>
			</c:if>
	    	<c:if test="${empty aves}">
		        <label>Não existem aves cadastradas!</label>
		        <c:set var="ativaBotao" value="disabled" />
			</c:if>
	    </div>	    

	    <button ${ativaBotao} type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>