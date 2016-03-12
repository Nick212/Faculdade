algoritmo "problema10"

var
   sexo : vetor[1..2] de caractere
   altura, alturaFinal  : vetor[1..2] de real
   mulherCont, homemCont : inteiro
   cont : inteiro
inicio
      para cont de 1 ate 2 passo 1 faca
      Escreva("Digite o seu sexo, M para masculino e F para Feminino: ")
      Leia(sexo[cont])
      Escreva("Digite a sua altura: ")
      Leia(altura[cont])
      alturaFinal[cont] <-  altura[cont]/100
      fimpara
      mulherCont <- 0
      homemCont <- 0
      para cont de 1 ate 2 passo 1 faca
           se(sexo[cont] = "F") ou (sexo[cont] = "f") entao
           mulherCont <- mulherCont + 1
              Senao entao
              homemCont <- homemCont + 1
           fimse
      fimpara
      Escreval("Mulheres: ",(100/cont)*mulherCont,"%")
      Escreval("Homens: ",(100/cont)*homemCont,"%")
fimalgoritmo
