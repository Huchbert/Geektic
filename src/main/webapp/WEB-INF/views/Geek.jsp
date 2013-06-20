<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Geek</title>
		<link rel="stylesheet" type="text/css" href="/Geektic/css/bootstrap.css"/>
	</head>	
	<body>
		<h1>Geek</h1> 	
		<p>
			<c:out value="${geek.name}"/> 
			<c:out value="${geek.lastname}"/>
			<c:out value="${geek.gender}"/>
		</p> 
		<ul>
			<c:forEach var="interest" items="${geek.interests}"> 
				<li>${interest.label}</li>
			</c:forEach>
		</ul>
		<a href="/Geektic/Geeks"> Retour à la liste des Geeks </a>
	</body>
</html>