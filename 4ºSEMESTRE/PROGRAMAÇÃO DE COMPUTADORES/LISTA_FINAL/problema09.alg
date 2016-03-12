algoritmo "problema09"

var
   nome : caractere
   aulasSemestre, faltas : inteiro
   nota1, nota2, notaSemestral, frequencia : real
   notaPassa, frequenciaPassa : logico

inicio
      Escreva("Digite o total de aulas do semestre:")
      Leia(aulasSemestre)
      Escreval("")
      Escreva("Digite o nome do aluno(a):")
      Leia(nome)
      Escreva("Digite o total de faltas do aluno(a) ",nome,":")
      Leia(faltas)
      Escreval("")
      Escreva("Digite a nota 1:")
      Leia(nota1)
      Escreva("Digite a nota 2:")
      Leia(nota2)
      Escreval("")
      notaSemestral <- ((nota1 + nota2)/2)
      frequencia <- (100/aulasSemestre) * (aulasSemestre - faltas)
      Se(notaSemestral >= 6) entao
          notaPassa <- verdadeiro
          Senao entao
          notaPassa <- falso
      fimse
      Se(frequencia >= 75) entao
          frequenciaPassa <- verdadeiro
          Senao entao
          frequenciaPassa <- falso
      fimse
      Se(notaPassa = verdadeiro) E (frequenciaPassa = verdadeiro) entao
          Escreval("Aluno ",nome)
          Escreval("Freuqência: ",frequencia,"%")
          Escreval("Nota Semestral = ",notaSemestral)
          Escreval("Aluno(a) Aprovado")
      fimse
      Se(notaPassa = falso) E (frequenciaPassa = verdadeiro) entao
          Escreval("Aluno ",nome)
          Escreval("Freuqência: ",frequencia,"%")
          Escreval("Nota Semestral = ",notaSemestral)
          Escreval("Aluno(a) reprovado por NOTA")
      fimse
      Se(notaPassa = verdadeiro) E (frequenciaPassa = falso) entao
           Escreval("Aluno ",nome)
           Escreval("Freuqência: ",frequencia,"%")
           Escreval("Nota Semestral = ",notaSemestral)
           Escreval("Aluno(a) reprovado por FALTA")
      fimse
fimalgoritmo
