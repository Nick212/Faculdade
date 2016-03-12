
public class Exe02 {

	public static void main(String[] args) {
		int vetor[] = new int[]{5,1,8,4,9,16,28,40,80,10};
		int result = 0;
		for (int i = 0; i < vetor.length; i++) {
			result += vetor[i]; 
		}
		System.out.println("Soma dos Valores do Vetor: " + result);
		
	}
}
