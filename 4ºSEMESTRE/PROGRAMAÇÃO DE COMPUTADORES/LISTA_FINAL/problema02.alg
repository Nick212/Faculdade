algoritmo "problema02s"

var
ms100, ms50, ms10, ms5, ms1, valor: inteiro

inicio

Escreva("Digite um valor pra ser calculado a M$: ")
leia(valor)
ms100 <- (valor \ 100)

ms50 <- (valor mod 100)
ms50 <- (ms50 \ 50)

ms10 <- (valor mod 50)
ms10 <- (ms10 \ 10)

ms5 <- (valor mod 10)
ms5 <- (ms5 \ 5)

ms1 <- (valor mod 5)
ms1 <- (ms1 \ 1)

Escreval(" Cédulas de 100 = ",ms100)
Escreval (" Cédulas de 50 = ",ms50)
Escreval (" Cédulas de 10 = ",ms10)
Escreval (" Cédulas de 5 =  ",ms5)
Escreval (" Cédulas de 1 =  ",ms1)

fimalgoritmo
