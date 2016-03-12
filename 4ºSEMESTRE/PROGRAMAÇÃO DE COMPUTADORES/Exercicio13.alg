algoritmo "Exercicio13"

var

valorProduto, valorVenda, lucro: real


inicio
Escreva ("Digite o valor do produto: ")
Leia(valorProduto)

Se (valorProduto <= 20) entao
   lucro <- 1.45
   valorVenda <- valorProduto * lucro
   Escreval ("Valor de Venda: ", valorVenda)
Senao
   lucro <- 1.30
   valorVenda <- valorProduto * lucro
   Escreval ("Valor de Venda: ", valorVenda)

fimse
fimalgoritmo
