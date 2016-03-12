algoritmo "Exercicio9"

var
lado1, lado2, lado3: real
inicio
Escreva ("Digite o primeiro Lado do Triângulo: ")
Leia(lado1)
Escreva ("Digite o segundo Lado do Triângulo: ")
Leia (lado2)
Escreva ("Digite o terceiro Lado do Triângulo: ")
Leia (lado3)
Se (lado1 = lado2) e (lado2 = lado3) entao
   Escreva ("O Triângulo formado será Equilátero")
Senao
   Se (lado1 = lado2) ou (lado1 = lado3) ou (lado2 = lado3) entao
      Escreva ("O Triângulo formado será Isósceles")
   Senao
      Se (lado1 <> lado2) e (lado2 <> lado3) e (lado1 <> lado3) entao
         Escreva ("O Triângulo formado será Escaleno")
      Senao
         Escreva("Não é possível formar um Triângulo Equilátero Isósceles ou Escaleno")
      fimse
   fimse
fimse

fimalgoritmo
