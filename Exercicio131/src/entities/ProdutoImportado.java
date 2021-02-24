package entities;

public class ProdutoImportado extends Produto{


	public ProdutoImportado(String nome, Double preco, Double taxaProduto) {
		super(nome, preco);
		this.taxaProduto = taxaProduto;
	}

	private Double taxaProduto;
	
	public Double valorTotal() {
		return (this.taxaProduto * this.preco) + this.preco;
		
	}
	
	@Override
	public String etiqueta() {
		return nome + preco;
		
	}
}
