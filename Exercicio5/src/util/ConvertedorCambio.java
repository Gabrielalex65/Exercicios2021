package util;

public class ConvertedorCambio {
	public static double convertedor(double valorDolar, double compraDolar ) {
		
		return (compraDolar * valorDolar) + ((0.06 *compraDolar * valorDolar));
	}
}
