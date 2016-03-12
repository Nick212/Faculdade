algoritmo "Exemplo decisão"

var
nota1, nota2, media: real
inicio

escreva ("Digita nota 1:")
leia(nota1)

escreva ("Digita nota 2:")
leia(nota2)

media <- (nota1+nota2)/2
escreval ("A média do aluno é:", media)

se (media >= 6) entao
   escreval ("Aprovado)

senao
   se (media >= 3) entao
      escreval  ("recuperacao")
   senao
      escreval ("Reprovado")
   fimse
fimse

fimalgoritmo
