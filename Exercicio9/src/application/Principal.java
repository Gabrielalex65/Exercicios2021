package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Jogadores;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Jogadores[] jogador = new Jogadores[11];
		Scanner sc = new Scanner(System.in);
		for(int index = 0; index < 11; index++) {
			
		System.out.println("Digite o nome do jogador");
		String nome = sc.nextLine();
		
		System.out.println("Digite a posicao do jogador");
		String posicao = sc.nextLine();
		
		
		System.out.println("Digite a nacionalidade do jogador");
		String nacionalidade = sc.nextLine();
		
		System.out.println("Digite a altura do jogador");
		double altura = sc.nextDouble();
		
		System.out.println("Digite o peso do jogador");
		double peso = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite a data de nascimento do jogador");
		String dataRecebida = sc.nextLine();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date nascimento = df.parse(dataRecebida);
			 jogador[index] = new Jogadores(nome, posicao, nascimento, nacionalidade, altura, peso);
			 jogador[index].calculaIdade(jogador[index].getNascimento());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		sc.close();
	}

}
