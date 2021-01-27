package entities;

public class Aluno {
	private String nome;
	private double nota[];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNota() {
		return nota;
	}
	public void setNota(double nota[]) {
		this.nota = nota;
	}
	
	public void avaliacao( ) {
		if((this.nota[0] + this.nota[1] + this.nota[2]) >= 60) {
			System.out.print("nota final"+ (this.nota[0] + this.nota[1] + this.nota[2]));
			System.out.print("Passou");
		} else {
			System.out.println("falhou");
			System.out.print("faltou "+ (60 - (this.nota[0] + this.nota[1] + this.nota[2])) + " pontos" );
		}
		
	}
}
