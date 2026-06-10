<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-   8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<% List Groupes = (List)session.getAttribute("groupes");%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<c:out value="Hello"></c:out>
<h3>Employee Details</h3>
<hr size="4" color="gray"/>
<table>
    <%=Groupes X%>
    <c:forEach items="${X}" var="groupe">
        <tr>
            <td>Groupe ID: <c:out value="${groupe.id}"/></td>
            <td>Groupe Name: <c:out value="${groupe.nom}"/></td>
            <td>Tarifs du groupe: <c:out value="${groupe.tarifs}"/></td> 
        </tr>
    </c:forEach>
</table>

</body>