package rightWay;

public class Triangulo {
	public double a, b, c;
	
	public double calcula() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	public void maior(Double x, Double y) {
		if (x > y) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
	}
}
