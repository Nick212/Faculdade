import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {

		exercicio05();
	}

	/**
	 * 05) Criar um programa que leia pelo teclado um vetor de inteiros de 20
	 * posi��es, separe os elementos pares e �mpares em dois vetores, e
	 * exiba-os.
	 */
	public static boolean exercicio05() {

		try {
			int[] listNumber = new int[20];

			for (int i = 0; i < listNumber.length; i++) {
				showMessage("Digite um N�mero:");
				int numberDigited = readKeyBoard();
				listNumber[i] = numberDigited;
			}

			orderByListByParOrImpar(listNumber);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private static void orderByListByParOrImpar(int[] listNumber) {
		int[] listPar = {};
		int[] listImpar = {};
		int lastFilaPar = 0;
		int lastFilaImpar = 0;
		
		for (int i = 0; i < listNumber.length; i++) {
			if(listNumber[i] % 2 == 0){				
				listPar[lastFilaPar] = listNumber[i];
				lastFilaPar++;
			}
			listImpar[lastFilaImpar] = listNumber[i];
			lastFilaImpar++;
		}
		
		printList(listPar, 1);
		printList(listImpar, 2);
	}

	private static void printList(int[] listNumberOderned, int typeOrdered) {
		if(typeOrdered <= 1)
			System.out.println("N�meros Pares: " + listNumberOderned);
		else
			System.out.println("N�meros Impares: " + listNumberOderned);
	}

	private static int readKeyBoard() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private static void showMessage(String msg) {
		System.out.println(msg);
	}

}
