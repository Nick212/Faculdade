algoritmo "PrimeiroPrograma"


var
salBase, grat, imposto, salReceber: real

inicio
escreva ("Digite o sal�rio base: ")
leia (salBase)
grat <- salBase * 5/100
imposto <- salBase * 7/100
salReceber <- salBase + grat - imposto
escreval
escreval ("Gratifica��o: ", grat)
escreval ("Imposto: ", imposto)
escreval ("Sal�rio a receber: ", salReceber)


fimalgoritmo
