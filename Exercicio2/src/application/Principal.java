package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite o nome");
		funcionario.setNome(sc.nextLine());
		
		System.out.println("Digite o salario bruto");
		funcionario.setSalarioBruto(sc.nextDouble());
		
		System.out.println("Digite a taxa");
		funcionario.setTaxa(sc.nextDouble());
		
		System.out.println(funcionario.toString());
		System.out.println("Digite a porcentagem do aumento do salario");
		funcionario.aumentoSalario(sc.nextDouble());
		sc.close();
	}

}
