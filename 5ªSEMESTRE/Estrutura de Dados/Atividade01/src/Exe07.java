import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {

		int vetor[] = new int[9];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um Número: ");
			int valueRead = sc.nextInt();
			if (valueRead % 2 == 0) {
				vetor[i] = valueRead ;
			}
		}
		System.out.println("Soma Total do Vetor VALORES PARES: "
				+ somarValoresVetor(vetor));
	}

	protected static int somarValoresVetor(int[] vetor) {
		int total = 0;
		for (int i = 0; i < vetor.length; i++)
			total += vetor[i];

		return total;
	}
}
