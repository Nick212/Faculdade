algoritmo "problema04"

var
peso, altura, imc :real
inicio

Escreval("Digite seu peso: ")
leia(peso)

Escreval ("Digite sua altura")
leia(altura)

imc <- peso / (altura*altura)
se(imc > 0) e (imc <= 18.5) entao
   Escreval("Magro :", img)
fimse
se(imc > 18.5) e ( imc <=25) entao
   Escreval("Normal : ", imc)
fimse
se(imc > 25) e (imc <= 30) entao
   Escreval("Sobrepeso : ", imc)
fimse
se(imc > 30) entao
   Escreval("Obeso : ", img)
fimse
fimalgoritmo
