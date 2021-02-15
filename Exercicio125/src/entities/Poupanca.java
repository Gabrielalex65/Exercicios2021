package entities;

public class Poupanca extends Conta{
	private Double correcaoTaxa;

	public Poupanca() {
		super();
	}

	public Poupanca(Integer numero, String titular, Double saldo, Double correcaoTaxa) {
		super(numero, titular, saldo);
		this.correcaoTaxa = correcaoTaxa;
	}

	public Double getCorrecaoTaxa() {
		return correcaoTaxa;
	}

	public void setCorrecaoTaxa(Double correcaoTaxa) {
		this.correcaoTaxa = correcaoTaxa;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * correcaoTaxa;
	}
}
