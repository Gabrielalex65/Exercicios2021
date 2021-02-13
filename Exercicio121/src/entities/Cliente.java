package entities;

import java.util.Date;

public class Cliente {
	private String nome;
	private String email;
	private Date dataNascimento;
	
	public Cliente(String nome, String email, Date dataNascimento) {
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", dataNascimento=" + dataNascimento + "]";
	}
	
	
}
