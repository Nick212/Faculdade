algoritmo "MóduloDivisão"

var
numero, resto :inteiro

inicio
escreva ("Digite um número inteiro: ")
leia (numero)

resto <- numero MOD 2

se (resto = 0) entao
   escreval ("Número digitado é par")
senao
   escreval ("Número digitado é ímpar")
fimse

fimalgoritmo
