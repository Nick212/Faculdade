algoritmo "Exercicio14"

var

salario: real


inicio
Escreva ("Digite o seu salario: ")
Leia(salario)

Se (salario <= 600) entao
   salario <- salario * 1.30
   Escreval ("Seu salario será: ", salario)
Senao Se(salario <=1100) entao
	salario <- salario * 1.25
	Escreval ("Seu salario será: ", salario)
Senao Se(salario <= 2400) entao
	salario <- salario * 1.20
	Escreval ("Seu salario será: ", salario)
Senao Se(salario <= 3550) entao
	salario <- salario * 1.15
	Escreval ("Seu salario será: ", salario)
Senao Se(salario > 3550) entao
	salario <- salario * 1.10
	Escreval ("Seu salario será: ", salario)
	

fimse
fimalgoritmo
