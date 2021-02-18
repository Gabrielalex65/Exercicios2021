package application;

import entities.Conta;
import entities.ContaEmpresa;
import entities.Poupanca;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta x = new Poupanca(1001, "Alex", 1000.0, 0.01);
		Conta y = new ContaEmpresa(1002, "Maria", 1000.0, 5000.0);
		
		x.saque(100);
		y.saque(100);
		System.out.println(x.getSaldo());
		System.out.println(y.getSaldo());
	}

}
