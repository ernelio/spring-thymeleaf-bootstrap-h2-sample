package com.festa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Convidado implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue
	private Long ID;
	private String NOME;
	private Integer QTDACOMPANHANTES;
	

	//Getters and Setters
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getNOME() {
		return NOME;
	}
	public void setNOME(String nOME) {
		NOME = nOME;
	}
	public Integer getQTDACOMPANHANTES() {
		return QTDACOMPANHANTES;
	}
	public void setQTDACOMPANHANTES(Integer qTDACOMPANHANTES) {
		QTDACOMPANHANTES = qTDACOMPANHANTES;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}