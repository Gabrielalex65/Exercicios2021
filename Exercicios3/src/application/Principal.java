package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		double[] nota = new double[3];
		System.out.println("Digite o nome do aluno");
		aluno.setNome(sc.nextLine());
		
		System.out.println("Digite a nota do primeiro trimestre");
		nota[0] = sc.nextDouble();
		
		System.out.println("Digite a nota do segundo trimestre");
		nota[1] = sc.nextDouble();
		
		System.out.println("Digite a nota do terceiro trimestre");
		nota[2] = sc.nextDouble();
		aluno.setNota(nota);
		aluno.avaliacao();
		sc.close();
	}

}
