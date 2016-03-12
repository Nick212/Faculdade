function myFunction(){
	var user = document.getElementById('usuario').value;
	var passw = document.getElementById('senha').value;
	
	if(user === "admin" && passw ==="admin"){
		//alert("login Efetuado com Sucesso")
		window.location.assign("file:///E:/NICOLAS/FACULDADE/4%C2%BASEMESTRE/PROGRAMAÇÃO PARA INTERNET/gravatas%20e%20cia%20V_2.0/cadastroProduto.html")
	}
	else{
		alert("Senha ou usuário Inválida")
	}
}
function newDoc() {
    window.location.assign("http://www.w3schools.com")
}