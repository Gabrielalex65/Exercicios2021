package entities;

public class Funcionarios {
	private String id;
	private String nome;
	private double salario;
	
	public Funcionarios(String id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public String getId() {
		return id;
	}
	public double aumento(double porcentagem) {
		this.salario += (this.salario * porcentagem * 0.01);
		return this.salario;
		
	}
	@Override
	public String toString() {
		return "Funcionarios [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	
}
