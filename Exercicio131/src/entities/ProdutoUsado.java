package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{


	private Date dataManufaturacao;

	public ProdutoUsado(String nome, Double preco, Date dataManufaturacao) {
		super(nome, preco);
		this.dataManufaturacao = dataManufaturacao;
	}

	public Date getDataManufaturacao() {
		return dataManufaturacao;
	}
	@Override
	public String etiqueta() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return nome + preco + " "+sdf.format(dataManufaturacao);
		
	}

}
