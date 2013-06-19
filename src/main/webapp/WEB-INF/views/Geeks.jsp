<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Liste des Geeks</title>
	</head>	
	<body>		
		<h1>Liste des Geeks</h1> 
		<ul> 
			<c:forEach var="geek" items="${geeks}"> 
				<li> 
					<a href="Geeks/${geek.id}"> 
							<c:out value="${geek.name}"/> <c:out value="${geek.lastname}"/> 
					</a> 
				</li> 
			</c:forEach> 
		</ul>
		<a href="/Geektic"> Retour � l'accueil </a>
	</body>
</html>