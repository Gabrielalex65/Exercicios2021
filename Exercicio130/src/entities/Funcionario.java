package entities;

public class Funcionario {
	private String nome;
	protected Integer hora;
	private Double valorPorHora;


	public Funcionario() {
		super();
	}
	public Funcionario(String nome, Integer hora, Double valorPorHora) {
		super();
		this.nome = nome;
		this.hora = hora;
		this.valorPorHora = valorPorHora;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getHora() {
		return hora;
	}
	public void setHora(Integer hora) {
		this.hora = hora;
	}
	public Double getValorPorHora() {
		return valorPorHora;
	}
	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	public Double pagamento() {
		return valorPorHora * hora;
		
	}
	
}
