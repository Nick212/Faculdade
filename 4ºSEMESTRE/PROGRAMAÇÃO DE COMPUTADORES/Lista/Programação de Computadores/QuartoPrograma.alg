algoritmo "QuartoPrograma"

var
salBase, grat, imposto, salReceber: real

inicio
escreva ("Digite o sal�rio base: ")
leia (salBase)

se (salBase > 2000) entao
   grat <- salBase * 8/100
   imposto <- salBase *10/100
senao
   grat <- salBase * 5/100
   imposto <- salBase *7/100
fimse
salReceber<-salBase-imposto+grat
escreval ("Sal�rio a receber: ", salReceber)

fimalgoritmo
