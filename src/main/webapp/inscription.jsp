<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%! String URL_SERVLET = "./Ajouter"; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajout de Personne</title>
</head>
<body>
	<form action="<%=URL_SERVLET%>" method="POST">
        <label for="pName"></label>
        <input type="text" id="pName" name="pName">
        <br>
        <label for=""pDateNaiss></label>
        <input type="date" id="pDateNaiss" name="pDateNaiss">
        <button type="submit">Ajouter</button>
    </form>
</body>
</html>