import java.util.Scanner;

/**
 * 05) Criar um programa que leia pelo teclado um vetor de inteiros de 20
 * posi��es, separe os elementos pares e �mpares em dois vetores, e exiba-os.
 */
public class Exe05 {

	public static void main(String[] args) {

		int vPar[] = new int[10];
		int vImpar[] = new int[10];
		int numberRead;
		int countVPar = 0;
		int countVImpar = 0;
		
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 20; i++) {

			System.out.println("Digite um  n�mero: ");
			numberRead = sc.nextInt();
			if (numberRead % 2 == 0) {
				vPar[countVPar] = numberRead;
				countVPar++;
			} else {
				vImpar[countVImpar] = numberRead;
				countVImpar++;
			}
		}
		for (int i = 0; i < vImpar.length; i++) 
			System.out.println("Vetor Impar: " + vImpar[i]);			
		
		for (int i = 0; i < vImpar.length; i++)
			System.out.println("Vetor Par: " + vPar[i]);			
		
	}

}
