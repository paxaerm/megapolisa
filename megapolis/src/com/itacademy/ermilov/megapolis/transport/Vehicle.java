package com.itacademy.ermilov.megapolis.transport;

public abstract class Vehicle extends Transport {
	private String mark;
	private Engine engine;
	private String colour;
	private int passengers;
	
	public Vehicle(String mark, Engine engine, String colour) {
		super();
		this.mark = mark;
		this.engine = engine;
		this.colour = colour;
	}
	
	

	public Vehicle(String mark, Engine engine) {
		super();
		this.mark = mark;
		this.engine = engine;
	}



	public Vehicle(String mark) {
		super();
		this.mark = mark;
	}
	
	

	public Vehicle() {
		super();
	}

	public void upgrade(Engine engine,String colour ){
		
		if (engine.getVolume() > this.engine.getVolume()){
			this.engine = engine;
		}
		if (!colour.equals("white")){
			this.colour = colour;
		}
		
	}



	public String getMark() {
		return mark;
	}



	public void setMark(String mark) {
		this.mark = mark;
	}



	public Engine getEngine() {
		return engine;
	}



	public void setEngine(Engine engine) {
		this.engine = engine;
	}



	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}



	public int getCargo() {
		return cargo;
	}



	public void setCargo(int cargo) {
		this.cargo = cargo;
	}



	public int getPassengers() {
		return passengers;
	}



	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

}
