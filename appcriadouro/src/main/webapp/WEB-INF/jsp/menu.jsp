<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<nav class="navbar navbar-expand-sm bg-light navbar-light">
  <div class="container-fluid">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link active" href="/">Home</a>
      </li>
      
      <c:if test="${not empty user}">
       <li class="nav-item">
        <a class="nav-link active" href="/usuario/lista">Usuário</a>
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
      </c:if>
    </ul>
    
    <ul class="navbar-nav">
    <c:if test="${empty user}">
      <li class="nav-item">
        <a class="nav-link " href="/usuario">Signup</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" href="/login">Login</a>
      </li>
      </c:if>
      
      <c:if test="${not empty user}">
       <li class="nav-item">
        <a class="nav-link active" href="/logout">Logout, ${user.nome}</a>
      </li>
      </c:if>
    </ul>
  </div>
</nav>

	