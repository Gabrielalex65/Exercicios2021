package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero da conta");
		String numeroConta = sc.nextLine();
		System.out.println("Nome do usuario");
		String nome = sc.nextLine();
		Conta conta = new Conta(numeroConta, nome);
		System.out.println("Vai fazer um deposito inicial (s/n)");
		String deposito = sc.nextLine();
		if(deposito.charAt(0) == 's') {
			System.out.println("Digite o valor a depositar");
			double valor = sc.nextDouble();
			conta.deposito(valor);
		} 
		System.out.println(conta.toString());
		
		System.out.println("Digite o valor a depositar");
		double valor = sc.nextDouble();
		conta.deposito(valor);
		
		System.out.println(conta.toString());
		
		System.out.println("Digite o valor a depositar");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println(conta.toString());
		
		sc.close();
	}

}
