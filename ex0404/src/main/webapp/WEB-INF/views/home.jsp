<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


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
<%@ include file="head.jsp" %>
	<div class="container" style="background-color: #bbb;margin: 1rem auto 1rem auto">
		<h1>
			Hello world!
		</h1>
		<p> CRUD 를 학습하였습니다. </p>
		<P>  The time on the server is ${aaa}. </P>
	</div>
</body>
</html>
