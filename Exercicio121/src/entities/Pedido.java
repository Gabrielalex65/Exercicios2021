package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	private Date dataPedido;
	private StatusPedido status;
	private Cliente cliente;
	private List<ItemPedido> itens = new ArrayList<>();
	
	public void adicionaItem(ItemPedido item) {
		this.itens.add(item);
	}
	
	public void removeItem(ItemPedido item) {
		itens.remove(item);
	}
	
	public Double total() {
		Double total = 0.00;
		for(ItemPedido c : this.itens) {
			total += c.subTotal();
		}
		return total;
		
	}

	public Pedido(Date dataPedido, StatusPedido status, Cliente cliente) {
		this.dataPedido = dataPedido;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	@Override
	public String toString() {
		return "Pedido [dataPedido=" + dataPedido + ", status=" + status + ", cliente=" + cliente.toString() + ", itens=" + itens
				+ ", total()=" + total() + "]";
	}


	
	
}
