package entities;

public class ContaEmpresa extends Conta{
	private Double emprestimoLimite;
	
	public ContaEmpresa() {
		
	}

	public ContaEmpresa(Integer numero, String titular, Double saldo, Double emprestimoLimite) {
		super(numero, titular, saldo);
		this.emprestimoLimite = emprestimoLimite;
	}

	public Double getEmprestimoLimite() {
		return emprestimoLimite;
	}

	public void setEmprestimoLimite(Double emprestimoLimite) {
		this.emprestimoLimite = emprestimoLimite;
	}
	
	public void emprestimo(double valor) {
		if(valor <= emprestimoLimite) {
			deposito(valor);
		}
	}
}
