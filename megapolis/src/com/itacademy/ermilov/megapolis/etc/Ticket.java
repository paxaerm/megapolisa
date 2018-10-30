package com.itacademy.ermilov.megapolis.etc;

public class Ticket {
	private String direction;
	private double cost;
	private String date;
	private static int ticketId = 0;
	
	public Ticket(String direction, double cost, String date, int ticketId) {
		ticketId++;
		this.cost = cost;
		this.date = date;
		Ticket.ticketId = ticketId;
		this.direction = direction;
	}
	public String getDirection() {
		return direction;
	}
	public double getCost() {
		return cost;
	}
	public String getDate() {
		return date;
	}
	public static int getTicketId() {
		return ticketId;
	}
}
