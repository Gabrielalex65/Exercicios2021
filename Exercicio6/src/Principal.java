import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de pessoas");
		int quantidadePessoas = sc.nextInt();
		int index = 0;
		double media = 0;
		double[] altura = new double[quantidadePessoas];
		while(quantidadePessoas > index) {
			System.out.println("Digite a altura");
			altura[index] = sc.nextDouble();
			media += altura[index];
			index += 1;
		}
		 System.out.printf("media da galera %.2f%n" + media / quantidadePessoas);
		sc.close();
	}

}
