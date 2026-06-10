<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste des groupes</title>
</head>
<body>
<h3>Liste des groupes</h3>
<hr size="4" color="gray"/>
<table>
    <c:forEach items="${groupes}" var="groupe">
        <tr>
            <td>Groupe ID: <c:out value="${groupe.id}"/></td>
            <td>Tarifs du groupe: <c:out value="${groupe.tarifs}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
