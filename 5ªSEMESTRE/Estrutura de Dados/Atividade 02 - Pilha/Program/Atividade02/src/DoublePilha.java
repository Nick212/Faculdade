import java.util.Arrays;

public class DoublePilha {
	private double pilha[];
	private int topo = -1;
	private int qtde;

	public DoublePilha(int tamanho) {
		pilha = new double[tamanho];
	}

	public DoublePilha(double[] vetor) {
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

	public double getTopo() {
		if (estaVazia()) {
			System.out.println("Pilha Vazia!");
			return 0;
		}
		return pilha[topo];
	}

	public void empilha(double e) {
		if (estaCheia()) {
			System.out.println("Pilha Cheia!");
		} else {
			topo++;
			pilha[topo] = e;
			qtde++;
		}
	}

	public void empilha(double... i) {
		if (estaCheia()) {
			System.out.println("Pilha Cheia!");
		} else {
			topo++;
			//pilha[topo] = i;
			qtde++;
		}
	}

	public double desempilha() {
		double aux = 0;

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

	public double desempilha(int qtd) {
		double aux = 0;
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
		double aux = 0;
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
	
	public DoublePilha  transferir(DoublePilha pilhaTransferida){
		
		pilhaTransferida = new DoublePilha(pilha);
		
		return pilhaTransferida;
	}

	@Override
	public String toString() {
		return Arrays.toString(pilha);
	}
}
