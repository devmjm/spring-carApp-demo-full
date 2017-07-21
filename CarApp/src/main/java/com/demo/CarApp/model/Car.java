package com.daimler.CarApp.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Car {
	
	@Id
	@NotNull
	public int Vin;
	
	@NotNull
	public UUID Driver;

}
