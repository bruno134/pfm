package com.pfm.personalFinancialManager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="tbCartaoCredito")
public class CartaoCredito {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCartaoCredito;
	private String nmCartaoCredito;
	@ManyToOne 
	@JoinColumn(name="idBandeira", nullable=false)
	private Bandeira bandeira;
	
	public CartaoCredito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartaoCredito(Integer idCartaoCredito, String nmCartaoCredito, Bandeira bandeira) {
		super();
		this.idCartaoCredito = idCartaoCredito;
		this.nmCartaoCredito = nmCartaoCredito;
		this.bandeira = bandeira;
	}

	public Integer getIdCartaoCredito() {
		return idCartaoCredito;
	}

	public void setIdCartaoCredito(Integer idCartaoCredito) {
		this.idCartaoCredito = idCartaoCredito;
	}

	public String getNmCartaoCredito() {
		return nmCartaoCredito;
	}

	public void setNmCartaoCredito(String nmCartaoCredito) {
		this.nmCartaoCredito = nmCartaoCredito;
	}

	public String getBandeira() {
		return bandeira.getNmBandeira();
	}

	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bandeira == null) ? 0 : bandeira.hashCode());
		result = prime * result + ((idCartaoCredito == null) ? 0 : idCartaoCredito.hashCode());
		result = prime * result + ((nmCartaoCredito == null) ? 0 : nmCartaoCredito.hashCode());
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
		CartaoCredito other = (CartaoCredito) obj;
		if (bandeira == null) {
			if (other.bandeira != null)
				return false;
		} else if (!bandeira.equals(other.bandeira))
			return false;
		if (idCartaoCredito == null) {
			if (other.idCartaoCredito != null)
				return false;
		} else if (!idCartaoCredito.equals(other.idCartaoCredito))
			return false;
		if (nmCartaoCredito == null) {
			if (other.nmCartaoCredito != null)
				return false;
		} else if (!nmCartaoCredito.equals(other.nmCartaoCredito))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CartaoCredito [" + (idCartaoCredito != null ? "idCartaoCredito=" + idCartaoCredito + ", " : "")
				+ (nmCartaoCredito != null ? "nmCartaoCredito=" + nmCartaoCredito + ", " : "")
				+ (bandeira != null ? "bandeira=" + bandeira : "") + "]";
	}
	
	
	
	
}
