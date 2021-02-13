package entities;

public class ItemPedido {
	private Integer quantidade;
	private Double preco;
	private Produto produto;
	
	public ItemPedido(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}
	public Double subTotal(){
		
		return preco * quantidade;
		
	}
	@Override
	public String toString() {
		return "ItemPedido [quantidade=" + quantidade + ", preco=" + preco + ", produto=" + produto + "]";
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public Produto getProduto() {
		return produto;
	}
	
	
}
