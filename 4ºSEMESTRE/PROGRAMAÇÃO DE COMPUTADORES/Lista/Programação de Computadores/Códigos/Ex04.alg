algoritmo "eX04"

var
a, b, resto: inteiro

inicio
escreva ("Digite um n�mero (A): ")
leia (a)
escreva ("Digite um n�mero (B): ")
leia (b)

resto <- a MOD b

se (resto = 0) entao
   escreval ("N�mero A � divis�vel por B")
senao
   escreval ("N�mero A N�O � divis�vel por B")
fimse

fimalgoritmo
