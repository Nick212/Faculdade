
public class Main {

	public static void main(String[] args) {

		int[] vetor = {1,2,3,4,5};
		
		Pilha p = new Pilha(vetor);
		
		Pilha x = new Pilha(5);
		
		Pilha i = new Pilha(5);
		
		i = p.transferir(x);
		
		
	}

}
