algoritmo "Exercicio7"

var
a,b,c:inteiro

inicio
escreva("Digite o valor de a: ")
leia(a)

escreva ("Digite o valor de b: ")
leia(b)

se (a < b) entao

   escreval ("1� = ", a)
   escreval ("2� = ", b)
senao
   c <- a
   a <- b
   b <- c
   escreval("1� = ", a)
   escreval("2� = ", b)

fimse

fimalgoritmo
