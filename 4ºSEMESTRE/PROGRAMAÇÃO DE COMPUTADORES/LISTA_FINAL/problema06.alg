algoritmo "problema06"

var
n, i, resto, contador, j, contador2: inteiro

inicio

escreval("Digite um número: ")
leia(n)

para i de 1 ate n passo 1 faca

       se(i mod 2 <> 0 ) entao
            contador <- contador + i
            escreva ("|", contador )
       fimse
fimpara


Escreva("Resultado = ", contador)

fimalgoritmo
