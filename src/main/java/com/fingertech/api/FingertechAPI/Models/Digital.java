package com.fingertech.api.FingertechAPI.Models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fingerTechAndroidAPI")
public class Digital implements Serializable {
	
	@Id	
	@GeneratedValue( strategy = GenerationType.AUTO)
	
	private int id;	
	
	private String primeiradigital;
	
	private String segundadigital;	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrimeiradigital() {
		return primeiradigital;
	}

	public void setPrimeiradigital(String primeiradigital) {
		this.primeiradigital = primeiradigital;
	}

	public String getSegundadigital() {
		return segundadigital;
	}

	public void setSegundadigital(String segundadigital) {
		this.segundadigital = segundadigital;
	}

	@Override
	public String toString() {
		return "Digital [id=" + id + ", primeiradigital=" + primeiradigital + ", segundadigital=" + segundadigital
				+ "]";
	}
	
	
	
	

}
