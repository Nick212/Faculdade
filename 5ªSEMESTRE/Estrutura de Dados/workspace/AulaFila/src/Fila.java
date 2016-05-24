import java.util.Arrays;

public class Fila {
	private int fila[];
	private int qtde;
	private int inicio;
	private int fim;

	/**
	 * Construtor da Classe Fila Inicializa a minha fila com tamanho como
	 * parâmetro
	 */
	public Fila(int tamanho) {
		//Variáveis de Instâncias
		fila = new int[tamanho];
		fim = -1;
	}
	
	/**Inicializa com Vetor*/
	public Fila(int[]vetor){
		fila = vetor;
		qtde = vetor.length;
		fim = vetor.length - 1;
	}

	/** Quantidade de Elemento na Fila */
	public int getQtde() {
		return qtde;
	}

	/** Retorna sempre o primeiro da Fila */
	public int getElemento() {
		return fila[inicio];
	}

	public boolean estaVazia() {
		return (qtde == 0);
	}

	public boolean estaCheia() {
		return (qtde == fila.length);
	}

	public void enfileirar(int e) {

		if (estaCheia()) {
			System.out.println("Fila está Cheia");
		} else {
			fim++;
			fila[fim] = e;
			qtde++;
		}

	}

	public int desenfileirar() {
		int aux = 0;
		
		if(estaVazia()){
			System.out.println("Fila está Vazia");
		}else{
			aux = fila[inicio];
					
			realocarElementosFila();
		}		
		return aux;				
	}
	
	
	private void realocarElementosFila(){
		
		for (int i = 0; i < fim; i++) {
			fila[i] = fila[i + 1];	
		}
		fila[fim] = 0;
		fim--;
		qtde--;


	}

	@Override
	public String toString() {
		return Arrays.toString(fila);
	}
	

}