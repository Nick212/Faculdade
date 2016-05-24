import java.util.Arrays;

public class CharPilha {
	private char pilha[];
	private int topo = -1;
	private int qtde;

	public CharPilha(int tamanho) {
		pilha = new char[tamanho];
	}

	public CharPilha(char[] vetor) {
		pilha = vetor;		
		qtde = vetor.length;
		topo = vetor.length - 1;
	}

	public int getQtde() {
		return qtde;
	}

	public boolean estaVazia() {
		return (qtde == 0);
	}

	public boolean estaCheia() {
		return (qtde == pilha.length);
	}

	public int getTopo() {
		if (estaVazia()) {
			System.out.println("Pilha Vazia!");
			return 0;
		}
		return pilha[topo];
	}

	public void empilha(char e) {
		if (estaCheia()) {
			System.out.println("Pilha Cheia!");
		} else {
			topo++;
			pilha[topo] = e;
			qtde++;
		}
	}

	public void empilha(char... i) {
		if (estaCheia()) {
			System.out.println("Pilha Cheia!");
		} else {
			topo++;
			//pilha[topo] = i;
			qtde++;
		}
	}

	public int desempilha() {
		int aux = 0;

		if (estaVazia()) {
			System.out.println("Pilha Vazia!");
		} else {
			aux = pilha[topo];
			pilha[topo] = 0;
			topo--;
			qtde--;
		}

		return aux;
	}

	public int desempilha(int qtd) {
		int aux = 0;
		for (int i = 0; i < qtd; i++) {
			if (estaVazia()) {
				System.out.println("Pilha Vazia");
			} else {
				aux = pilha[topo];
				pilha[topo] = 0;
				topo--;
				qtde--;
			}
		}
		return aux;
	}
	
	public void zerarPilha(){
		int aux = 0;
		for (int i = 0; i < pilha.length; i++) {
			if (estaVazia()) {
				System.out.println("Pilha Vazia");
			} else {
				aux = pilha[topo];
				pilha[topo] = 0;
				topo--;
				qtde--;
			}
		}
	}
	
	public CharPilha  transferir(CharPilha pilhaTransferida){
		
		pilhaTransferida = new CharPilha(pilha);
		
		return pilhaTransferida;
	}

	@Override
	public String toString() {
		return Arrays.toString(pilha);
	}
}
