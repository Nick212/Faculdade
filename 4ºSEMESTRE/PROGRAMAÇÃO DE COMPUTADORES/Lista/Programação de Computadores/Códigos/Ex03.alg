algoritmo "M�duloDivis�o"

var
numero, resto :inteiro

inicio
escreva ("Digite um n�mero inteiro: ")
leia (numero)

resto <- numero MOD 2

se (resto = 0) entao
   escreval ("N�mero digitado � par")
senao
   escreval ("N�mero digitado � �mpar")
fimse

fimalgoritmo
