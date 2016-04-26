
public class Exe03 {

	public static void main(String[] args) {
		double vetor[] = new double[]{85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0};
		double result = 0;
		for(int i = 0; i < vetor.length; i++){
			result += vetor[i];
		}
		System.out.println("Media da Somatória: "+ result / vetor.length);
		
	}

}
