package com.collections.sort;

public class Car implements Comparable<Car> {
	
    String company;
	String model;
	int priceinrupees;
	
	
	public Car(String company,String model,int priceinrupees ) {
		
		this.company = company;
		this.model = model;
		this.priceinrupees = priceinrupees;
		
	}


	@Override
	public int compareTo(Car car) {
		
		if(this.priceinrupees > car.priceinrupees ) {
			
			return 1;
		}
		
		else if (this.priceinrupees < car.priceinrupees) {
			return -1;
		}
		return 0;
	}


	@Override
	public String toString() {
		return "Kaar [company=" + company + ", model=" + model + ", priceinrupees=" + priceinrupees + "]";
	}


}
