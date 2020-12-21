package com.mammals;

public class Gorilla extends Mammal{
	public void throwSomething() {
		System.out.println("The gorilla has thrown something!");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
	}
	
	public void climb() {
		System.out.println("The gorilla has climbed a tree! His energy level has decreased by 10.");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
	}
	
	public void eatBanana() {
		System.out.println("The gorilla has eaten a banana and promptly fallen asleep due to immense satisfaction. His energy level has also increased by 10.");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}
}
