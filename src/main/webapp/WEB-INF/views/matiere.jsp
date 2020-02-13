<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%> --%>
<%-- <%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Matieres</title>
</head>
<body>

	<form action="AjoutMatiere" method="post">
		<table>
			<tr>
				<td>Introduire l'id de la matiere : <input type="text" name="idMatiere"></td>
				<td>Introduire le nom de la matiere : <input type="text" name="nomMatiere"></td>
				<td><input type="submit" value="AjoutMatiere" name="action"></td>
			</tr>
		</table>
		
		<table class="table table-striped">
			<tr>
				<th>Id de la matiere</th>
				<th>Nom de la matiere</th>
			</tr>
			<c:forEach items="${listeDesMatieres }" var = "cl">
				<tr>
					<td>${cl.idMatiere }</td>
					<td>${cl.nomMatiere }</td>
				</tr>
			</c:forEach>
		</table>		
	</form>
	
	<form action="allMatiere" method="get">
		<input type="submit" value="AFFICHER" name="action">
	</form>

</body>
</html>