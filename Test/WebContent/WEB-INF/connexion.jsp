<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Connexion</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/WebContent/style.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    </head>
    <body>
        <h1 class="text-center mt-5"> Bienvenue ! </h1>
        <form method="POST" action="home" >
        <div class="d-flex flex-column mx-auto w-25">
        	<label for="name"> Nom :  </label>
        	<input type="text" id="name" name="name" required="true"/>
        	
        	<label for="surname"> Prénom : </label>
        	<input type="text" id="surname" name="surname" required="true"/>
        	
        	<button type="submit" class="btn btn-info mt-4 w-50 mx-auto">
        		Envoyer
        	</button>
        </div>
        </form>
    </body>
</html> 