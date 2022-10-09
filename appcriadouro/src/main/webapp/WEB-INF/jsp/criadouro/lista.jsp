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
	  
	  <h3>Classe: Criadouro</h3>      
	  <h4><a href="/criadouro">Novo</a></h4>   
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th>ID</th>
	        <th>Nome</th>
	        <th>Endereço</th>
	        <th>Tipo de Ave</th>
	        <th>Responsavel</th>
	        <th>Aves</th>
	        <th>Data de criação</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
	    	<c:forEach var= "c" items="${listagem}">
		      <tr>
		      	<td>${c.id}</td>
		        <td>${c.nome}</td>
		        <td>${c.endereco}</td>
		        <td>${c.tpAve}</td>
		        <td>${c.responsavel.nome}</td>
		        <td>${c.aves.size()}</td>
		         <td>${c.dtCriaddouro}</td>
		        <td><a href="/criadouro/${c.id}/excluir">Excluir</a></td>
		      </tr>
		    </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>