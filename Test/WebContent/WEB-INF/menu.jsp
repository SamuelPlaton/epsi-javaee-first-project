<div id="menu" class="d-flex flex-row justify-content-between align-items-center p-2 bg-info">
	<div class="d-flex flex-row justify-content-start align-items-center ">
		<p class="mx-2 mb-0"> <a href="/Test/" class="text-light"> Connexion  </a> </p>
		<p class="mx-2 mb-0"> <a  href="/Test/home" class="text-light"> Accueil </a> </p>
	</div>
	<p class="mx-2 mb-0 text-light"> Bienvenue ${ sessionScope.surname }</p>
	<form method="POST" action="/Test?disconnect=true">
		<button type="submit" class="btn btn-light"> Se déconnecter</button>
	</form>
</div>