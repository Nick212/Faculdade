algoritmo "PrimeiroPrograma"


var
salBase, grat, imposto, salReceber: real

inicio
escreva ("Digite o salário base: ")
leia (salBase)
grat <- salBase * 5/100
imposto <- salBase * 7/100
salReceber <- salBase + grat - imposto
escreval
escreval ("Gratificação: ", grat)
escreval ("Imposto: ", imposto)
escreval ("Salário a receber: ", salReceber)


fimalgoritmo
