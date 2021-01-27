package entities;

public class Funcionario {
	private String nome;
	private double salarioBruto; 
	private double taxa;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public double salarioLiquido( ) {
		this.salarioBruto -= taxa; 
		return this.salarioBruto;
	}
	public void aumentoSalario(double porcentagem) {
		porcentagem =+ porcentagem * 0.01;
		System.out.println("informação atualizada:"+this.nome+"$ "+(this.salarioBruto+(this.salarioBruto*porcentagem)));
	}
	
	public String toString() {
		return "Nome: "+this.nome+"Salario liquido "+(this.salarioBruto-this.taxa);
		
	}
}
