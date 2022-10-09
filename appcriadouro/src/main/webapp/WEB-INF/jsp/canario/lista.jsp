<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="ISO-8859-1">
	<title>AppCriadouro</title>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
	  <h2>AppCriadouro</h2>
	  <p>Criadouro de Pássaros nativos e exóticos.</p>   
	  <h4><a href="/canario">Novo</a></h4>
	  <h3>Classe: Canário</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	       	<th>ID</th>
	        <th>Nome</th>
	        <th>Anilha</th>
	        <th>Data de nascimento</th>
	        <th>Tipo</th>
	        <th>Raça</th>
	        <th>Classificação</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		    <c:forEach var= "c" items="${listagem}">
		      <tr>
		      	<td>${c.id}</td>
		        <td>${c.nome}</td>
		        <td>${c.anilha}</td>
		        <td>${c.dtNascimento}</td>
		        <td>${c.tipo}</td>
		        <td>${c.raca}</td>
		        <td>${c.classificacao}</td>
		        <td><a href="/canario/${c.id}/excluir">Excluir</a></td>
		      </tr>
		    </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>