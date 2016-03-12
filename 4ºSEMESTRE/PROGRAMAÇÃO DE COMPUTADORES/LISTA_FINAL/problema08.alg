algoritmo "problema08"

var
   horasDeTrabalho, salarioHora, salarioBruto, iNSS, iR, salarioLiquido: real
   numDependentes : inteiro
inicio
   Escreva("Digte a sua quantidade de horas trabalhadas:")
   Leia(horasDeTrabalho)
   Escreva("Digite o seu salario por hora:")
   Leia(salarioHora)
   Escreva("Digite o número de dependentes:")
   Leia(numDependentes)
       salarioBruto <- (horasDeTrabalho * salarioHora +(50 * numDependentes))
       Se(salarioBruto <= 1500) entao
             iNSS <-  salarioBruto * (8.5/100)
           Senao entao
               iNSS <- salarioBruto * (9/100)
       fimse
       Se(salarioBruto <= 1900) entao
           iR <- 0
           Senao
               Se(salarioBruto > 1900) E (salarioBruto <= 2800) entao
                   iR <- (salarioBruto * (7.5/100)) - 143
               Senao entao
                     iR <- (salarioBruto * (15/100)) - 355
               fimse
           fimse
           salarioLiquido <- (salarioBruto - iNSS - iR)
           Escreval("=== Informações do Trabalhador ===")
           Escreval("Salário Bruto: ","R$",salarioBruto)
           Escreval("Desconto INSS: ","R$",iNSS)
           Escreval("Desconto IR: ","R$",iR)
           Escreval("Salário Líquido: ","R$",salarioLiquido)
           Escreval("==================================")
fimalgoritmo
