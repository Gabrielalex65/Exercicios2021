package application;

import entities.Conta;
import entities.ContaEmpresa;
import entities.Poupanca;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta(1001, "Alex", 1000.0);
		conta.saque(100);
		System.out.println(conta.getSaldo());
		Conta contaPoupanca = new Poupanca(1001, "Alex", 1000.0, 0.01);
		contaPoupanca.saque(100);
		System.out.println(contaPoupanca.getSaldo());
		
		Conta contaEmpresa = new ContaEmpresa(1001, "Alex", 1000.0, 500.00);
		contaEmpresa.saque(200.0);
		System.out.println(contaEmpresa.getSaldo());
	}

}
