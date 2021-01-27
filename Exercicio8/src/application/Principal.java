package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a aquantidade de estudantes");
		int quantidadeEstudantes = sc.nextInt();
		
		Aluguel[] aluguel = new Aluguel[10];
		
		for(int index = 0; index < quantidadeEstudantes; index ++) {
			sc.nextLine();
			String nome = sc.nextLine();
			String email = sc.nextLine();
			int quarto = sc.nextInt();
			if(quarto < 10 && quarto > 0) {
				aluguel[index] = new Aluguel(nome, email, quarto);
			} else {
				System.out.println("Digite um valor valido de quarto");
				index -= 1;
			}
		}
		
	
		sc.close();
	}

}
