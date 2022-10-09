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
	  <h4><a href="/coleiro">Novo</a></h4>
	  <h3>Classe: Coleiro</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th>ID</th>
	        <th>Nome</th>
	        <th>Anilha</th>
	        <th>Data de nascimento</th>
	        <th>Canta tui tui</th>
	        <th>Região</th>
	        <th>Cantos por minuto</th>
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
		        <td>${c.cantTuiTui}</td>
		        <td>${c.regiao}</td>
		        <td>${c.cantPorMin}</td>
		        <td><a href="/coleiro/${c.id}/excluir">Excluir</a></td>
		      </tr>
		    </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>