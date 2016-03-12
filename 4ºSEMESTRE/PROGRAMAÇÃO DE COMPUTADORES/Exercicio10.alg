algoritmo "Exercicio10"

var
num1, num2, num3: inteiro
inicio
Escreva ("Digite o primeiro Número: ")
Leia(num1)
Escreva ("Digite o segundo Número: ")
Leia (num2)
Escreva ("Digite o terceiro Número: ")
Leia (num3)
Se (num1 <= num2) e (num2 <= num3) entao
   Escreva (num1, num2, num3)
Senao
   Se (num1 <= num2) e (num2 <= num3) entao
      Escreva (num1, num3, num2)
   Senao
      Se (num2 <= num1) e (num1 <= num3) entao
         Escreva (num2, num1, num3)
      Senao
         Se (num2 <= num3) e (num3 <= num1) entao
            Escreva (num2, num3, num1)
         Senao
            Se (num3 <= num1) e (num1 <= num2) entao
               Escreva (num3, num1, num2)
            Senao
               Escreva (num3, num2, num1)
            fimse
         fimse
      fimse
   fimse
fimse
fimalgoritmo
