algoritmo "Exercicio11"

var
nome: caractere
num1, num2, num3, media: real
faltas: inteiro

inicio
Escreva ("Digite o Nome do Aluno: ")
Leia(nome)
Escreva ("Digite a primeira Nota: ")
Leia(num1)
Escreva ("Digite a segunda Nota: ")
Leia (num2)
Escreva ("Digite a terceira Nota: ")
Leia (num3)
Escreva ("Digite a quantidade de falta: ")
Leia(faltas)

media <- (num1 + num2 + num3) / 3

Se (media >= 7) e (faltas <=20) entao
Escreval (nome, " Você foi Aprovado com a media= ", media, ". Faltas= ", faltas)
Senao
Escreval (nome, " Você foi Reprovado com a media= ", media, ". Faltas= ", faltas)

fimse
fimalgoritmo
