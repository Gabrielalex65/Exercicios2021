package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTercerizado;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("Digite a quantiade de funcionarios");
		int quantidade = sc.nextInt();
		for(int index = 0; index < quantidade; index++) {
			System.out.println("O funcionario é terceirizado? s/n");
			char terceirizado = sc.next().charAt(0);
		
			System.out.println("Digite o nome do funcionario");
			sc.nextLine();
			String nome = sc.nextLine();
		
			System.out.println("Digite a quantidade de horas trabalhadas");
			int hora = sc.nextInt();
		
			System.out.print("Digite o valor por hora");
			Double valorPorHora = sc.nextDouble();
		
			if(terceirizado == 's') {
				System.out.println("Valor adicional");
				double valorAdicional = sc.nextDouble();
				list.add(new FuncionarioTercerizado(nome, hora, valorPorHora, valorAdicional));
				
			} else {
				list.add(new Funcionario(nome, hora, valorPorHora));
			}
		}
		for(Funcionario funcionario : list) {
			System.out.println(funcionario.getNome() + " $ " + String.format("%.2f", funcionario.pagamento()));
		}
		sc.close();
	}

}
