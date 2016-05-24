
public class TestFila {

	public static void main(String[] args) {

		Fila f = new Fila(5);
		
		/**Implementado a partir do ToString*/
		System.out.println(f);
		
		
		/**ENFILEIRAR*/
		f.enfileirar(1);
		System.out.println(f);
		
		f.enfileirar(2);
		System.out.println(f);
		
		f.enfileirar(3);
		System.out.println(f);
		
		f.enfileirar(4);
		System.out.println(f);
		
		f.enfileirar(5);
		System.out.println(f);
		
		f.enfileirar(5);
		System.out.println(f);
		
		/**DESENFILEIRAR*/
		f.desenfileirar();
		System.out.println(f);
		
		f.desenfileirar();
		System.out.println(f);
		
		f.desenfileirar();
		System.out.println(f);
		
		f.desenfileirar();
		System.out.println(f);
		
		
		f.desenfileirar();
		System.out.println(f);
		
		f.desenfileirar();
		
		/**Inicializa com o Vetor*/
		int[] v = new int[]{5,8,7,6};
		Fila fVetor = new Fila(v);
		
		System.out.println(fVetor);
		fVetor.enfileirar(5);
		
		fVetor.desenfileirar();
		System.out.println(fVetor);
		
		fVetor.desenfileirar();
		System.out.println(fVetor);
		
		fVetor.desenfileirar();
		System.out.println(fVetor);
	
		fVetor.desenfileirar();
		System.out.println(fVetor);
		
		fVetor.desenfileirar();
		System.out.println(fVetor);
		
	}

}
