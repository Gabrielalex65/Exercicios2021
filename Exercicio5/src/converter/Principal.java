package converter;

import java.util.Locale;
import java.util.Scanner;

import util.ConvertedorCambio;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do dolar");
		double valorDolar = sc.nextDouble();
		System.out.println("Quantos dolares vão ser comprados");
		double compraDolar = sc.nextDouble();
		System.out.println("Valor pago em reais" + ConvertedorCambio.convertedor(valorDolar, compraDolar));
		sc.close();
	}

}
