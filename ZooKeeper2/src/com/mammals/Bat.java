package com.mammals;

public class Bat extends Mammal{
	public Bat() {
		super.energyLevel = 300;
		
	}
	
	
	public void fly() {
		System.out.println("Flap flap flap flap flap");
		this.setEnergyLevel(this.getEnergyLevel() - 50);
	}
	
	public void eatHumans() {
		this.setEnergyLevel(this.getEnergyLevel() + 25);
	}
	
	public void attackTown() {
		System.out.println("Brazen light, roaring sounds of cracking and screams as the town burns.");
		this.setEnergyLevel(this.getEnergyLevel() - 100);
	}
}
