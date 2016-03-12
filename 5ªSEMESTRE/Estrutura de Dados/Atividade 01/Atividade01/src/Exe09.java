import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {
		int vetor[] = new int[9];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um N�mero: ");
			int valueRead = sc.nextInt();
			vetor[i] = valueRead;
		}
		System.out.println("Validar Existencia na Lista: ");
		int valueRead = sc.nextInt();

		int count = countExistInsideList(valueRead, vetor);
		if (count > 0)
			System.out.println("O N�mero Digitado tem " + count
					+ " vezes na lista ");
		else
			System.out.println("O N�mero Digitado " + valueRead
					+ " n�o contempla na Lista ");
	}

	protected static int countExistInsideList(int valueRead, int[] vetor) {
		int count = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == valueRead)
				count++;
		}
		return count;
	}

}
