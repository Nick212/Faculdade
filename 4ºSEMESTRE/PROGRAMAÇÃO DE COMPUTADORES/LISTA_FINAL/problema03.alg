algoritmo "problema03"

var
salInicial, salFinal :real

inicio
Escreva("Digite o sal�rio do Funcion�rio: ")
leia(salInicial)

se(salInicial <= 2000) entao
   salFinal <- salInicial +((salInicial * 50) / 100)
   Escreval("Sal�rio Final: ", salFinal)
fimse
se (salInicial <= 5000) entao
   salFinal <- salInicial +((salInicial * 20) /100)
   Escreval ("Sal�rio Final: ", salFinal)
fimse
se(salInicial > 5000) entao
   salFinal <- salInicial +((salInicial * 10) /100)
   Escreval("Sal�rio Final: ", salFinal)
fimse
fimalgoritmo
fimse
