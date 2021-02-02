package application;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		
		System.out.println("Digite a quantidade de linhas");
		int linhas = sc.nextInt();
		
		System.out.println("Digite a quantidade de colunas");
		int colunas = sc.nextInt();
		
		int[][] matriz = new int[linhas][colunas];
		for(int indice = 0; indice < linhas; indice++) {
			for(int indice1 = 0; indice1 < colunas; indice1++) {
				matriz[indice][indice1] = gerador.nextInt(10);
			}
		}
		
		for(int indice = 0; indice < linhas; indice++) {
			for(int indice1 = 0; indice1 < colunas; indice1++) {
				System.out.print(" "+ matriz[indice][indice1]);
			}
			System.out.println(" ");
		}
		System.out.println("Digite o numero procurado");
		int numeroProcurado = sc.nextInt();
		for(int indice = 0; indice < linhas; indice++) {
			for(int indice1 = 0; indice1 < colunas; indice1++) {
					if(matriz[indice][indice1] == numeroProcurado) {
						System.out.println("indice("+indice+","+indice1+")"+"numero encontrado é "+matriz[indice][indice1]+ " ");
						if(indice1 > 0 ) {
							
							System.out.println("Anterior "+ matriz[indice][indice1 - 1]);

					} 
						
					if(indice > 0 ) {
							System.out.println("Superior "+ matriz[indice - 1][indice1]);

					}
					
					if(indice1 < matriz[indice].length - 1 ) {
						
						System.out.println("Proximo "+matriz[indice][indice1 + 1]);


				}
					
					if(indice < matriz.length - 1 ) {
						
						System.out.println("Inferior "+ matriz[indice + 1][indice1]);

				}
					
			}
		}
		

		sc.close();
	}

}
	}
