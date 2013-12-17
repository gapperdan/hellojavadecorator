package com.gap.hellojavadecorator;

public class Main {

	public static void main(String[] args) {
		
		//Create an instance of just a plain Box
		Parcel parcel = new Box();
		System.out.println(parcel.getDescription());

		//Create an instance of a Box that is Medical, Chemical and Nuclear
		parcel = new Medical(new Chemical(new Nuclear(new Box())));
		System.out.println(parcel.getDescription());
		
		//Create an instance of a Letter that is Chemical and Nuclear
		parcel = new Chemical(new Nuclear(new Letter()));
		System.out.println(parcel.getDescription());
		
		//Create an instance of a Letter that is Medical
		parcel = new Medical(new Letter());
		System.out.println(parcel.getDescription());
	}

}
