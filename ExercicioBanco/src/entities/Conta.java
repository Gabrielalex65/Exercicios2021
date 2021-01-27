package entities;

public class Conta {
	private String numeroConta;
	private  String nome;
	private double saldo;
	
	public double deposito(double valor) {
		this.saldo += valor;
		return valor;
		
	}
	public double saque(double saque) {
		this.saldo -= saque + 5;
		return saque;
		
	}
	public Conta() {
		
	}
	public Conta(String numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}


	public String getNumeroConta() {
		return numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", nome=" + nome + ", saldo=" + saldo + "]";
	}
	
}
