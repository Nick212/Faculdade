algoritmo "SegundoPrograma"


var
salBase, imposto, salReceber: real

inicio
escreva ("Digite o salário base: ")
leia (salBase)
imposto <- salBase * 10/100
salReceber <- salBase + 50 - imposto
escreval
escreval ("Gratificação: R$ 50,00")
escreval ("Imposto: ", imposto)
escreval ("Salário a receber: ", salReceber)


fimalgoritmo
