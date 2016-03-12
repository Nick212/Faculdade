
public class Exe04 {

	public static void main(String[] args) {
		int vetor[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + "-"+ (vetor.length - i) +" | ");
		}
	}

}
