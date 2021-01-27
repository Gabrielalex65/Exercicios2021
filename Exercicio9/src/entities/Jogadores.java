package entities;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class Jogadores {
	private String nome;
	private String posicao;
	private Date nascimento;
	private String nacionalidade;
	private double altura;
	private double peso;
	
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Jogadores(String nome, String posicao, Date nascimento, String nacionalidade, double altura, double peso) {
		this.nome = nome;
		this.posicao = posicao;
		this.nascimento = nascimento;
		this.nacionalidade = nacionalidade;
		this.altura = altura;
		this.peso = peso;
	}
	public Date calculaIdade (Date nascimento) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    Date date = new Date();
	    String data = dateFormat.format(date);
	    try {
			date = dateFormat.parse(data);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    double diferencaDatas = date.getTime() - nascimento.getTime();
		System.out.println(diferencaDatas);
		return nascimento;
		
	}
	public Date aposentadoria (Date nascimento) {
		return nascimento;
	}
	@Override
	public String toString() {
		return "Jogadores [nome=" + nome + ", posicao=" + posicao + ", nascimento=" + nascimento + ", nacionalidade="
				+ nacionalidade + ", altura=" + altura + ", peso=" + peso + "]";
	}
	

}
