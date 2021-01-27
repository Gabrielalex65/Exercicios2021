package util;

public class Calculadora {
	public static final double PI = 3.14159;
	
	public static double volume(double raio) {
		// TODO Auto-generated method stub
		return 4.0 * PI *  Math.pow(raio, 3) / 3;
	}
	public static double circunferencia(double raio) {
		// TODO Auto-generated method stub
		return 2.0 * PI * raio;
	}
}
