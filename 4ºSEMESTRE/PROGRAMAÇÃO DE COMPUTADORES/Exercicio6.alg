algoritmo "Exercicio6"

var
a,b,c:inteiro

inicio
escreva("Digite o valor de a: ")
leia(a)

escreva ("Digite o valor de b: ")
leia(b)

se (a < b) entao

   escreval ("1º = ", a)
   escreval ("2º = ", b)
senao
   c <- a
   a <- b
   b <- c
   escreval("1º = ", a)
   escreval("2º = ", b)

fimse

fimalgoritmo
