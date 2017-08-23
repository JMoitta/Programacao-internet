package bean.estudante;

import java.io.Serializable;

import javax.inject.Named;

@Named
public class RegistrarBean implements Serializable{

	private String nome = "Joao";
	private String sobrenome = "Moita";
	private double nota1 = 9;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	
	
}
