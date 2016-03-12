public class Exe10 {

	public static void main(String[] args) {
		double[] vetor1 = { 1.5, 8.6, 4.9, 10.0 };
		double[] vetor2 = { 2.7, 4.6, 5.5, 8.4 };
		
		double[]  result = somarValoresMesmoIndices(vetor1, vetor2);
		imprimirResultado(result);
	}

	protected static double[] somarValoresMesmoIndices(double[] vetor1, double[] vetor2) {
		double[] total = new double[4];

		for (int i = 0; i < total.length; i++) {
			total[i] = vetor1[i] + vetor2[i];
		}
		return total;
	}
	
	
	protected static void imprimirResultado(double[] total){
		for (int i = 0; i < total.length; i++) {
			System.out.println("Posição: "+ i + " = " + total[i]);
		}
	}

}
