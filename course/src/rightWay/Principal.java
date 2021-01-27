package rightWay;



import java.util.Locale;
import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangulo x, y ;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Enter the measures of triangle X: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		Double areaX = x.calcula();
		Double areaY = y.calcula();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		x.maior(areaX, areaY);
		
		sc.close();
	}

}
