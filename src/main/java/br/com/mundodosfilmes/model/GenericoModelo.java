package br.com.mundodosfilmes.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@SuppressWarnings("serial")
@MappedSuperclass
public class GenericoModelo implements Serializable{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long codigo;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	

}
