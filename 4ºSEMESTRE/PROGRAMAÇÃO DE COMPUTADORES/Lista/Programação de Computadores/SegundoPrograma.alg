algoritmo "SegundoPrograma"


var
salBase, imposto, salReceber: real

inicio
escreva ("Digite o sal�rio base: ")
leia (salBase)
imposto <- salBase * 10/100
salReceber <- salBase + 50 - imposto
escreval
escreval ("Gratifica��o: R$ 50,00")
escreval ("Imposto: ", imposto)
escreval ("Sal�rio a receber: ", salReceber)


fimalgoritmo
