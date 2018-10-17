package com.pfm.personalFinancialManager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tbBandeira")
public class Bandeira {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idBandeira;
	private String nmBandeira;
	
	
	
	public Bandeira() {
		super();
	}



	public Bandeira(Integer idBandeira, String nmBandeira) {
		super();
		this.idBandeira = idBandeira;
		this.nmBandeira = nmBandeira;
	}



	public Integer getIdBandeira() {
		return idBandeira;
	}



	public void setIdBandeira(Integer idBandeira) {
		this.idBandeira = idBandeira;
	}



	public String getNmBandeira() {
		return nmBandeira;
	}



	public void setNmBandeira(String nmBandeira) {
		this.nmBandeira = nmBandeira;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idBandeira == null) ? 0 : idBandeira.hashCode());
		result = prime * result + ((nmBandeira == null) ? 0 : nmBandeira.hashCode());
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
		Bandeira other = (Bandeira) obj;
		if (idBandeira == null) {
			if (other.idBandeira != null)
				return false;
		} else if (!idBandeira.equals(other.idBandeira))
			return false;
		if (nmBandeira == null) {
			if (other.nmBandeira != null)
				return false;
		} else if (!nmBandeira.equals(other.nmBandeira))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Bandeira [" + (idBandeira != null ? "idBandeira=" + idBandeira + ", " : "")
				+ (nmBandeira != null ? "nmBandeira=" + nmBandeira : "") + "]";
	}
	
	

}
