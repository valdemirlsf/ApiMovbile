package com.ifpe.mobile.models;

import java.time.LocalDate;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection = "Ocorrencias")
public class Ocorrencia {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String _id;
	
	
	private String NATUREZA;
	
	
	private String MUNICIPIO;
	
	private int ANO;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String DATA;

	public Ocorrencia(String _id, String NATUREZA, String MUNICIPIO,int ANO, String DATA) {
		super();
		this._id = _id;
		this.NATUREZA = NATUREZA;
		this.MUNICIPIO = MUNICIPIO;
		this.ANO = ANO;
		this.DATA = DATA;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getNATUREZA() {
		return this.NATUREZA;
	}

	public void setNATUREZA(String nATUREZA) {
		this.NATUREZA = nATUREZA;
	}

	public String getMUNICIPIO() {
		return this.MUNICIPIO;
	}

	public void setMUNICIPIO(String mUNICIPIO) {
		this.MUNICIPIO = mUNICIPIO;
	}

	public String getDATA() {
		return this.DATA;
	}

	public void setDATA(String dATA) {
		this.DATA = dATA;
	}

	public int getANO() {
		return ANO;
	}

	public void setANO(int aNO) {
		ANO = aNO;
	}
	
	
	
}
