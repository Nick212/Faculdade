algoritmo "TerceiroPrograma"


var
deposito, juros, rendimento, valorFinal: real

inicio
escreva ("Digite o valor do depósito: ")
leia (deposito)
escreva ("Digite o valor do juros: ")
leia (juros)

rendimento <- deposito * juros / 100
valorFinal <- rendimento + deposito

escreval ("Juros: ", rendimento)
escreval ("Valor Final: ", valorFinal)

fimalgoritmo
