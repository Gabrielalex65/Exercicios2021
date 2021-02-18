package entities;

public class FuncionarioTercerizado extends Funcionario {
	private Double valorAdicional;
	
	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	public FuncionarioTercerizado() {
		super();
	}

	public FuncionarioTercerizado(String nome, Integer hora, Double valorPorHora, Double valorAdicional) {
		super(nome, hora, valorPorHora);
		this.valorAdicional = valorAdicional;
	}

@Override
public Double pagamento() {
	return hora * super.pagamento() + valorAdicional * 1.1;
	
}
	
}
