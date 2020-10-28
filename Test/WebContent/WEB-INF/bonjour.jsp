<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>
    <body>
    <%@ include file="menu.jsp" %>
        <form method="POST" action="bonjour">
      
        	<label for="login"> Login : </label>
        	<input type="text" id="login" name="login"/>
        	
        	<label for="password"> Mot de passe </label>
        	<input type="password" id="password" name="password"/>
        	
        	<button type="submit">
        		Envoyer
        	</button>
        </form>
        
        <c:if test="${ !empty form }">
        <p> <c:out value="${ form.resultat }"/> </p>
        </c:if>
    </body>
</html> 