package com.mammals;

public class Mammal {
	protected int energyLevel = 100;
	
	
	
	public int showEnergyLevel() {
		System.out.println("Energy level :" + this.getEnergyLevel());
		return this.getEnergyLevel();
	}



	public int getEnergyLevel() {
		return energyLevel;
	}



	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
