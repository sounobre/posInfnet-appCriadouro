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

<nav class="navbar navbar-expand-sm bg-light navbar-light">
  <div class="container-fluid">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link active" href="/">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" href="/canario/lista">Canario</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/coleiro/lista">Coleiro</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/curio/lista">Curio</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="/ave/lista">Ave</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/criadouro/lista">Criadouro</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/responsavel/lista">Responsavel</a>
      </li>
    </ul>
  </div>
</nav>

	<div class="container mt-3">
	  <h2>AppCriadouro</h2>
	  <p>Criadouro de P�ssaros nativos e ex�ticos.</p>   
	  
	  <h3>Classe: Criadouro</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th>ID</th>
	        <th>Nome</th>
	        <th>Endere�o</th>
	        <th>Tipo de Ave</th>
	        <th>Responsavel</th>
	        <th>Aves</th>
	        <th>Data de cria��o</th>
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