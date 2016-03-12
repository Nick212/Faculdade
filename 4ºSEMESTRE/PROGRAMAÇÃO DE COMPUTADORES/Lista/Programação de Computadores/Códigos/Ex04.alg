algoritmo "eX04"

var
a, b, resto: inteiro

inicio
escreva ("Digite um número (A): ")
leia (a)
escreva ("Digite um número (B): ")
leia (b)

resto <- a MOD b

se (resto = 0) entao
   escreval ("Número A é divisível por B")
senao
   escreval ("Número A NÃO é divisível por B")
fimse

fimalgoritmo
