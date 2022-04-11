<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<% 
// 	String url = request.getRequestURI();
// 	if (url.contains("select"))
// 		out.println("select 포함되어져있음..");
%>
<c:set var="str" value="${pageContext.request.requestURI}"/>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<div class="container-fluid">
		<a class="navbar-brand" href="/ex0404">CRUD</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item">
					<c:if test="${fn:contains(str, 'insert')}">
						<a class="nav-link active" href="insert">INSERT</a>
					</c:if>
					<c:if test="${not fn:contains(str, 'insert')}">
						<a class="nav-link" href="insert">INSERT</a>
					</c:if>
				</li>
				<li class="nav-item">
					<c:if test="${fn:contains(str, 'select')}">
						<a class="nav-link active" href="select">SELECT</a>
					</c:if>
					<c:if test="${not fn:contains(str, 'select')}">
						<a class="nav-link" href="select">SELECT</a>
					</c:if>
				</li>
			</ul>
		</div>
	</div>
</nav>