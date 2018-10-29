package br.com.bitelowear.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Modelo {

	@Id
	private Integer codigo;
	private String descricao; //Skinny, Cigarrete, Boyfriend,Pantalona
	
	
	

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
