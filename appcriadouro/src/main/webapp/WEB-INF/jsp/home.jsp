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
	  <p>Criadouro de Pássaros nativos e exóticos.</p>   
	  
	  <h3>Classe: Criadouro</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
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
	        <td>Endereço do criadouro.</td>
	      </tr>
	      <tr>
	        <td>tpAve</td>
	        <td>String</td>
	        <td>Tipo de ave vendida.</td>
	      </tr>	      
	    </tbody>
	  </table>
	  <h3>Classe: Responsável</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>	      
	      <tr>
	        <td>nome</td>
	        <td>String</td>
	        <td>Nome do responsável pelo criadouro.</td>
	      </tr>
	       <tr>
	        <td>email</td>
	        <td>String</td>
	        <td>Email do responsável pelo criadouro.</td>
	      </tr>
	      <tr>
	        <td>cpf</td>
	        <td>String</td>
	        <td>CPF do responsável pelo criadouro.</td>
	      </tr>	      
	    </tbody>
	  </table>
	   <h3>Classe: Ave</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
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
	        <td>Número da anilha de identificação da ave.</td>
	      </tr>
	      <tr>
	        <td>dtNascimento</td>
	        <td>String</td>
	        <td>Data de nascimento da ave.</td>
	      </tr>	 	      
	    </tbody>
	  </table>
	  <h3>Classe: Canário</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>tipo</td>
	        <td>String</td>
	        <td>Tipo de canário (timbre, porte ou cor).</td>
	      </tr>
	      <tr>
	        <td>raca</td>
	        <td>String</td>
	        <td>Raça do Canário.</td>
	      </tr>
	      <tr>
	        <td>classificacao</td>
	        <td>String</td>
	        <td>Classificacão do padrão da qualidade do canário.</td>
	      </tr>		  		  
	    </tbody>
	  </table>
	  <h3>Classe: Curió</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>cantPraia</td>
	        <td>boolean</td>
	        <td>Informação se o canto do curió é o praia clássico.</td>
	      </tr>
	      <tr>
	        <td>categoria</td>
	        <td>String</td>
	        <td>Categoria do curió (canto ou fibra).</td>
	      </tr>	      
		  <tr>
	        <td>tempCantMin</td>
	        <td>int</td>
	        <td>Minutos que o curió canta sem pausar.</td>
	      </tr>		  			  		  
	    </tbody>
	  </table>
	  <h3>Classe: Coleiro</h3>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>cantTuiTui</td>
	        <td>boolean</td>
	        <td>Informação se o canto do coleiro é Tui Tui.</td>
	      </tr>
	      <tr>
	        <td>regiao</td>
	        <td>String</td>
	        <td>Região de onde o coleiro pertence.</td>
	      </tr>	      
		  <tr>
	        <td>cantPorMin</td>
	        <td>int</td>
	        <td>Quantas repetições de canto o coleiro faz por minuto.</td>
	      </tr>	  			  		  
	    </tbody>
	  </table>
	</div>
</body>
</html>