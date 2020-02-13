<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%> --%>
<%-- <%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Etudiants</title>
</head>
<body>

	<form:form action="AjoutEtudiant" method="post">
		<table>
			<tr>
				<td>Introduire l'id de l'etudiant : <input type="text" name="idEtudiant"></td>
				<td>Introduire le nom de l'etudiant : <input type="text" name="nomEtudiant"></td>
				<td>Introduire le prenom de l'etudiant : <input type="text" name="prenomEtudiant"></td>
				<td><input type="submit" value="AjoutEtudiant" name="action"></td>
			</tr>
		</table>
	</form:form>
	
	<p></p>
	<p></p>
	
	<form:form action="SupprimerEtudiant" method="get">
		<table>
			<tr>
				<td>Introduire l'id de l'etudiant : <input type="text" name="idEtudiant"></td>
				<td><input type="submit" value="SupprimerEtudiant" name="action"></td>
			</tr>
		</table>
	</form:form>
	
		<table class="table table-striped">
			<tr>
				<th>Id de l'etudiant</th>
				<th>Nom de l'etudiant</th>
				<th>Prenom de l'etudiant</th>
			</tr>
			<c:forEach items="${ListeDesEtudiants }" var = "cl">
				<tr>
					<td>${cl.idEtudiant }</td>
					<td>${cl.nomEtudiant }</td>
					<td>${cl.prenomEtudiant }</td>
				</tr>
			</c:forEach>
		</table>		
	
	
	<form:form action="GetAllEtudiant" method="get">
		<input type="submit" value="AFFICHER" name="action">
	</form:form>

</body>
</html>