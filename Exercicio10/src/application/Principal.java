package application;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] vetor = new String[] {"Maria", "Bob", "Alex"};
		
		for(int indice = 0; indice < vetor.length; indice++) {
			System.out.println(vetor[indice]);
		}
		
		for (String obj : vetor) {
				System.out.println(obj);	
			}
	}

}
