package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double media = 0;
		System.out.println("Digite a quantidade de produtos");
		int quantidadeProdutos = sc.nextInt();
		Produtos[] produto = new Produtos[quantidadeProdutos];
		for(int index = 0; index < produto.length; index ++) {
			
			sc.nextLine();
			String nome = sc.nextLine();
			
			double preco = sc.nextDouble();
			produto[index] = new Produtos(nome, preco);
			
			media += preco;
		}
		System.out.println("media de preço dos produtos" + media / produto.length);
		sc.close();
	}

}
