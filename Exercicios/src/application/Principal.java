package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("digite a altura");
		retangulo.altura = sc.nextDouble();
		
		System.out.println("digite a largura");
		retangulo.largura = sc.nextDouble();
		
		System.out.println("area"+ retangulo.area());
		System.out.println("area"+ retangulo.perimetro());
		System.out.println("area"+ retangulo.diagonal());
		sc.close();
	}

}
