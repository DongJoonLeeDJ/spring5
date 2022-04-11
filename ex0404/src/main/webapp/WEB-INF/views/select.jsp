<%-- <%@page import="com.org.ex0404.Member"%> --%>
<%-- <%@page import="java.util.List"%> --%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

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
	<div class="container py-2" style="background-color: #bbb;margin: 1rem auto 1rem auto">
		<h1>
			select
		</h1>
		<p> select 를 학습하였습니다. </p>
		<%
// 			List<Member> list = (List<Member>)request.getAttribute("list");
// 			out.println(list);
		%>
		<form action="delete" method="post">
			<table class="table table-primary table-hover table-striped">
				<tr class="table-success">
					<th class="text-center">#</th>
					<th>ID</th>
					<th>USERNAME</th>
					<th>PASSWORD</th>
				</tr>
				<c:forEach var="member" items="${list}">
					<tr>
						<td class="text-center">
<%-- 						
	JSTL
	${member.id } 
--%>
							<input class="form-check-input" type="checkbox" name="id" value="${member.id}">
						</td>
						<td>${member.id}</td>
						<td>${member.username}</td>
						<td>${member.password}</td>
					</tr>
				</c:forEach>
			</table>
			<div class="d-flex justify-content-end">
				<input class="btn btn-primary" type="submit" value="삭제"/>
			</div>
		</form>
	</div>
</body>
</html>









