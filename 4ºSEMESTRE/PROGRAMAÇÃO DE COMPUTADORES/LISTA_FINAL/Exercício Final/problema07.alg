algoritmo "problema07"

var
   valor : real
   codigo : inteiro
inicio
         Escreva("Digite o valor do produto:")
         Leia(valor)
         Escreva("Digite um dos códigos de aumento seguintes(1, 3, 4 ou 8)")
         leia(codigo)
            Escolha(codigo)
               Caso 1
                    Escreva("Valor do produto com 15% de aumento é: ","R$",valor*1.15)
               Caso 3
                    Escreva("Valor do produto com 20% de aumento é: ","R$",valor*1.20)
               Caso 4
                    Escreva("Valor do produto com 35% de aumento é: ","R$",valor*1.35)
               Caso 8
                    Escreva("Valor do produto com 40% de aumento é: ","R$",valor*1.40)
               OutroCaso
                    Escreva("Código inválido!")
               fimescolha
fimalgoritmo
