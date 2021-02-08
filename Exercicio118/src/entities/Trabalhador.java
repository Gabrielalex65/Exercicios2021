package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.emuns.NivelTrabalhador;


public class Trabalhador {
	private String nome;
	private NivelTrabalhador nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<HoraContrato> contratos = new ArrayList<>();
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public void adicionaContrato(HoraContrato contrato) {
		this.contratos.add(contrato);
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContratos() {
		return contratos;
	}

	public void removeContrato(HoraContrato contrato) {
		 contratos.remove(contrato);
	}
	
	public Double Salario(Integer ano, Integer mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		
		for (HoraContrato c : contratos) {
			
			cal.setTime(c.getData());
			
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = cal.get(Calendar.MONTH + 1 );
			
			if(ano == c_ano && mes == c_mes) {
			soma += c.valorTotal();
			
			}
			
		}
		return soma;
	}

	public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	public Trabalhador() {

	
	}
}