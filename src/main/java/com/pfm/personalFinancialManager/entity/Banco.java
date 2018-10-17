package com.pfm.personalFinancialManager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tbBanco")

public class Banco {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idBanco;
	private String nmBanco;
	
	
	public Banco(){
		super();
	}
	
	public Banco(Integer idBanco, String nmBanco) {
		super();
		this.idBanco = idBanco;
		this.nmBanco = nmBanco;
	}
	
	
	public Integer getIdBanco() {
		return idBanco;
	}
	public void setIdBanco(Integer idBanco) {
		this.idBanco = idBanco;
	}
	public String getNmBanco() {
		return nmBanco;
	}
	public void setNmBanco(String nmBanco) {
		this.nmBanco = nmBanco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idBanco == null) ? 0 : idBanco.hashCode());
		result = prime * result + ((nmBanco == null) ? 0 : nmBanco.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banco other = (Banco) obj;
		if (idBanco == null) {
			if (other.idBanco != null)
				return false;
		} else if (!idBanco.equals(other.idBanco))
			return false;
		if (nmBanco == null) {
			if (other.nmBanco != null)
				return false;
		} else if (!nmBanco.equals(other.nmBanco))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Banco [" + (idBanco != null ? "idBanco=" + idBanco + ", " : "")
				+ (nmBanco != null ? "nmBanco=" + nmBanco : "") + "]";
	}
}
