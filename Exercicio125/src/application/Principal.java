package application;

import entities.Conta;
import entities.ContaEmpresa;
import entities.Poupanca;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta(1001, "Alex", 0.0);
		ContaEmpresa empresaConta = new ContaEmpresa(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Conta conta1 = empresaConta;
		Conta conta2 = new ContaEmpresa(1003, "Bob", 0.0, 200.00);
		Conta conta3 = new Poupanca(1004, "Anna", 0.0 , 0.01);
		
		
		//DONWCAST
		
		ContaEmpresa conta4 = (ContaEmpresa)conta2;
		//ContaEmpresa conta5 = (ContaEmpresa)conta3;
		
		if(conta3 instanceof ContaEmpresa) {
			ContaEmpresa conta5 = (ContaEmpresa)conta3;
			conta5.emprestimo(200.00);
			System.out.println("Emprestimo");
		}
		
		if(conta3 instanceof Poupanca) {
			Poupanca conta5 = (Poupanca)conta3;
			conta5.atualizarSaldo();
			System.out.println("Corrigido");
		}
	}

}
