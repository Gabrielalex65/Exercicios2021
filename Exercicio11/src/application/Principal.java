package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionarios> list = new ArrayList<>();
		
		System.out.println("Digite a quantidade de funcionarios que seram adicionados");
		int quantidadeFuncionario = sc.nextInt();
		
		for(int indice = 0; indice < quantidadeFuncionario; indice ++) {
			System.out.println("Digite o id do Funcionario");
			sc.nextLine();
			String id = sc.nextLine();
		
			System.out.println("Digite o nome do Funcionario");
			String nome = sc.nextLine();
		
			System.out.println("Digite o salario do Funcionario");
			double salario = sc.nextDouble();
			
			Funcionarios funcionario = new Funcionarios(id, nome, salario);
			
			list.add(funcionario);
			
		}
		sc.nextLine();
		
		System.out.println("digite o id do funcionario que tera o salario aumentado");
		String idSalarioAumento = sc.nextLine();
		
		for(int indice = 0; indice < list.size(); indice++) {
			if(list.get(indice).getId().compareTo(idSalarioAumento) == 0 ) {
				
				System.out.println("digite a porcentagem");
				double porcentagem = sc.nextDouble();
				
				System.out.println("Novo salario " + list.get(indice).aumento(porcentagem ));
			} else {
				System.out.println("Id inexistente");
			}
		}
		sc.close();
	}

}
