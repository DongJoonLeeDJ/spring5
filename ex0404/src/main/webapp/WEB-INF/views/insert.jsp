<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta charset="utf-8">
	<title>Home</title>
	<link href="https://fonts.googleapis.com/css?family=Black+Han+Sans:400" rel="stylesheet">
	<style type="text/css">
		*{
			font-family: Black Han Sans;
		}
	</style>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="/ex0404">CRUD</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item">
						<a class="nav-link active" href="insert">INSERT</a>
					</li>
					<li class="nav-item">
						<a class="nav-link " href="select">SELECT</a>
					</li>
					<li class="nav-item">
						<a class="nav-link " href="delete">DELETE</a>
					</li>
					<li class="nav-item">
						<a class="nav-link " href="update">UPDATE</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container" style="background-color: #bbb;margin: 1rem auto 1rem auto">
		<h1>
			insert
		</h1>
		<p> insert 를 학습하였습니다. </p>
		<form method="post" >
			<label for="username">username</label>
			<input id="username" class="form-control" type="text" name="username"/>
			<label for="password">password</label>
			<input id="password" class="form-control" type="text" name="password"/>
			<input type="submit" class="btn btn-primary my-2" value="insert"/>
		</form>
	</div>
</body>
</html>










