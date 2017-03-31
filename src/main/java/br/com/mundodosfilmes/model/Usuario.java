package br.com.mundodosfilmes.model;

import javax.persistence.Entity;

@Entity
public class Usuario extends GenericoModelo {

	private static final long serialVersionUID = -4601803537471756780L;
	
	private String nome;
	private Integer idade;
	private String cidade;
	private Sexo sexo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
}
