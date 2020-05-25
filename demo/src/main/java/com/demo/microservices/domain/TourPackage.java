package com.demo.microservices.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class TourPackage {
	@Column
	private String code;
	@Column
	private String name;
	public TourPackage(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	
	
}
