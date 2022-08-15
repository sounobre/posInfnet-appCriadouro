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
	  
	  <h3>Classe: Coleiro</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Nome</th>
	        <th>Anilha</th>
	        <th>Data de nascimento</th>
	        <th>Canta tui tui</th>
	        <th>Regi�o</th>
	        <th>Cantos por minuto</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>Alpiste</td>
	        <td>01</td>
	        <td>25/04/2020</td>
	        <td>Sim</td>
	        <td>Norte</td>
	        <td>3</td>
	      </tr>
	      
	       <tr>
	        <td>Pain�o</td>
	        <td>02</td>
	        <td>25/05/2020</td>
	        <td>n�o</td>
	        <td>nordeste</td>
	        <td>1</td>
	      </tr>
	      
	       <tr>
	        <td>Aveia</td>
	        <td>03</td>
	        <td>25/08/2020</td>
	        <td>n�o</td>
	        <td>Sudeste</td>
	        <td>8</td>
	      </tr>
	      	  		  
	    </tbody>
	  </table>
	</div>
</body>
</html>