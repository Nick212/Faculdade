algoritmo "Exercicio9"

var
lado1, lado2, lado3: real
inicio
Escreva ("Digite o primeiro Lado do Tri�ngulo: ")
Leia(lado1)
Escreva ("Digite o segundo Lado do Tri�ngulo: ")
Leia (lado2)
Escreva ("Digite o terceiro Lado do Tri�ngulo: ")
Leia (lado3)
Se (lado1 = lado2) e (lado2 = lado3) entao
   Escreva ("O Tri�ngulo formado ser� Equil�tero")
Senao
   Se (lado1 = lado2) ou (lado1 = lado3) ou (lado2 = lado3) entao
      Escreva ("O Tri�ngulo formado ser� Is�sceles")
   Senao
      Se (lado1 <> lado2) e (lado2 <> lado3) e (lado1 <> lado3) entao
         Escreva ("O Tri�ngulo formado ser� Escaleno")
      Senao
         Escreva("N�o � poss�vel formar um Tri�ngulo Equil�tero Is�sceles ou Escaleno")
      fimse
   fimse
fimse

fimalgoritmo
