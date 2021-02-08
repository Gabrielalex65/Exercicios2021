package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HoraContrato;
import entities.Trabalhador;
import entities.emuns.NivelTrabalhador;


public class Principal {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Trabalhador trabalhador;
		Departamento departamento;
		
		System.out.println("Digite o nome do departamento");
		String nomeDepartamento = sc.nextLine();
		
		System.out.println("Digite o nome do trabalhador");
		String nome = sc.nextLine();
		
		System.out.println("Digite o nivel do trabalhador");
		String nivelTrabalhadorString = sc.nextLine();
		
		NivelTrabalhador nivelTrabalhador = NivelTrabalhador.valueOf(nivelTrabalhadorString);
		System.out.println("Digite o salario base do trabalhador");
		Double salarioBase = sc.nextDouble();
		
		System.out.println("Digite o numero de contratos");
		int contratos = sc.nextInt();
		
		departamento = new Departamento(nomeDepartamento);
		 trabalhador = new Trabalhador(nome, nivelTrabalhador, salarioBase, departamento); 
		 
		for(int i = 0; i <= contratos; i++) {
			
			System.out.println("Digite o #" + i + "contrato");
			Date dataContrato =  sdf.parse(sc.nextLine());
			
			System.out.println("Digite o valor por hora");
			double valorPorHora = sc.nextDouble();
			
			System.out.print("Duração");
			int hora = sc.nextInt();
			
			HoraContrato contrato = new HoraContrato(dataContrato, valorPorHora, hora);
			trabalhador.adicionaContrato(contrato);
		}
		sc.close();
	}

}
	