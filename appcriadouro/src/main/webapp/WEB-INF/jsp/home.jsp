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
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descri��o</th>
	      </tr>
	    </thead>
	    <tbody>	      
	      <tr>
	        <td>nome</td>
	        <td>String</td>
	        <td>Nome do criadouro.</td>
	      </tr>
	      <tr>
	        <td>endereco</td>
	        <td>String</td>
	        <td>Endere�o do criadouro.</td>
	      </tr>
	      <tr>
	        <td>tpAve</td>
	        <td>String</td>
	        <td>Tipo de ave vendida.</td>
	      </tr>	      
	    </tbody>
	  </table>
	  <h3>Classe: Respons�vel</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descri��o</th>
	      </tr>
	    </thead>
	    <tbody>	      
	      <tr>
	        <td>nome</td>
	        <td>String</td>
	        <td>Nome do respons�vel pelo criadouro.</td>
	      </tr>
	       <tr>
	        <td>email</td>
	        <td>String</td>
	        <td>Email do respons�vel pelo criadouro.</td>
	      </tr>
	      <tr>
	        <td>cpf</td>
	        <td>String</td>
	        <td>CPF do respons�vel pelo criadouro.</td>
	      </tr>	      
	    </tbody>
	  </table>
	   <h3>Classe: Ave</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descri��o</th>
	      </tr>
	    </thead>
	    <tbody>	      
	      <tr>
	        <td>nome</td>
	        <td>String</td>
	        <td>Nome da ave.</td>
	      </tr>
	      <tr>
	        <td>anilha</td>
	        <td>String</td>
	        <td>N�mero da anilha de identifica��o da ave.</td>
	      </tr>
	      <tr>
	        <td>dtNascimento</td>
	        <td>String</td>
	        <td>Data de nascimento da ave.</td>
	      </tr>	 	      
	    </tbody>
	  </table>
	  <h3>Classe: Can�rio</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descri��o</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>tipo</td>
	        <td>String</td>
	        <td>Tipo de can�rio (timbre, porte ou cor).</td>
	      </tr>
	      <tr>
	        <td>raca</td>
	        <td>String</td>
	        <td>Ra�a do Can�rio.</td>
	      </tr>
	      <tr>
	        <td>classificacao</td>
	        <td>String</td>
	        <td>Classificac�o do padr�o da qualidade do can�rio.</td>
	      </tr>		  		  
	    </tbody>
	  </table>
	  <h3>Classe: Curi�</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descri��o</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>cantPraia</td>
	        <td>boolean</td>
	        <td>Informa��o se o canto do curi� � o praia cl�ssico.</td>
	      </tr>
	      <tr>
	        <td>categoria</td>
	        <td>String</td>
	        <td>Categoria do curi� (canto ou fibra).</td>
	      </tr>	      
		  <tr>
	        <td>tempCantMin</td>
	        <td>int</td>
	        <td>Minutos que o curi� canta sem pausar.</td>
	      </tr>		  			  		  
	    </tbody>
	  </table>
	  <h3>Classe: Coleiro</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descri��o</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>cantTuiTui</td>
	        <td>boolean</td>
	        <td>Informa��o se o canto do coleiro � Tui Tui.</td>
	      </tr>
	      <tr>
	        <td>regiao</td>
	        <td>String</td>
	        <td>Regi�o de onde o coleiro pertence.</td>
	      </tr>	      
		  <tr>
	        <td>cantPorMin</td>
	        <td>int</td>
	        <td>Quantas repeti��es de canto o coleiro faz por minuto.</td>
	      </tr>	  			  		  
	    </tbody>
	  </table>
	</div>
</body>
</html>