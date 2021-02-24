package entities;

public class Produto {
	protected String nome;
	protected Double preco;
	
	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public String etiqueta() {
		return nome + preco;
		
	}

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
}
