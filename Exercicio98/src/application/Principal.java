package application;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random geradorRandom = new Random();
		System.out.println("Digite o tamanho da matriz");
		int tamanhoMatriz = sc.nextInt();
		int negativo = 0;
		int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];
		int[] vetor = new int[matriz.length];
		int indiceVetor = 0;
		
		for(int indice = 0; indice < matriz.length; indice++) {
			for(int indice1 = 0; indice1 < matriz.length; indice1++) {
				
				matriz[indice][indice1] = geradorRandom.nextInt();
				
				if(matriz[indice][indice1] < 0) {
					negativo++;
				}
				
				if(indice == indice1) {
					vetor[indiceVetor] = matriz[indice][indice1];
					indiceVetor++;
				}
			}
			
		}
		
		System.out.println("negativos" + negativo);
		
		for(int indice = 0; indice < indiceVetor; indice ++) {
			System.out.println("diagonal principal "+ vetor[indice]);
		}
	     for(int i=0;i<tamanhoMatriz;i++){ 
	      for(int j=0;j<tamanhoMatriz;j++)
	      { 
	        System.out.print(matriz[i][j]+"\t");
	     }
	       System.out.println("");
	 } 
		sc.close();
	}

}
