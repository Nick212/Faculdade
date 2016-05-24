import java.util.Arrays;

public class StringPilha {
	private String pilha[];
	private int topo = -1;
	private int qtde;

	public StringPilha(int tamanho) {
		pilha = new String[tamanho];
	}

	public StringPilha(String[] vetor) {
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

	public String getTopo() {
		if (estaVazia()) {
			System.out.println("Pilha Vazia!");
			return "";
		}
		return pilha[topo];
	}

	public void empilha(String e) {
		if (estaCheia()) {
			System.out.println("Pilha Cheia!");
		} else {
			topo++;
			pilha[topo] = e;
			qtde++;
		}
	}

	public void empilha(String... i) {
		if (estaCheia()) {
			System.out.println("Pilha Cheia!");
		} else {
			topo++;
			// pilha[topo] = i;
			qtde++;
		}
	}

	public String desempilha() {
		String aux = "";

		if (estaVazia()) {
			System.out.println("Pilha Vazia!");
		} else {
			aux = pilha[topo];
			pilha[topo] = "";
			topo--;
			qtde--;
		}

		return aux;
	}

	public String desempilha(int qtd) {
		String aux = "";
		for (int i = 0; i < qtd; i++) {
			if (estaVazia()) {
				System.out.println("Pilha Vazia");
			} else {
				aux = pilha[topo];
				pilha[topo] = "";
				topo--;
				qtde--;
			}
		}
		return aux;
	}

	public void zerarPilha() {
		for (int i = 0; i < pilha.length; i++) {
			if (estaVazia()) {
				System.out.println("Pilha Vazia");
			} else {
				pilha[topo] = "";
				topo--;
				qtde--;
			}
		}
	}

	public StringPilha transferir(StringPilha pilhaTransferida) {

		pilhaTransferida = new StringPilha(pilha);

		return pilhaTransferida;
	}

	@Override
	public String toString() {
		return Arrays.toString(pilha);
	}
}
