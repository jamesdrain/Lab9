/*
 *  Author: James Drain
 *  Date:   2/1/2018
 *  Code:   Stores car info to an array list and prints
 *          using separate Class, Car.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int carsInLot;
		String make;
		String model;
		int year;
		double price;

		System.out.println("Welcome to the Grand Circus Motors admin console!");

		System.out.println("How many cars are you entering? ");
		carsInLot = scnr.nextInt();
		scnr.nextLine();

		ArrayList<Car> carLot = new ArrayList<>();

		for (int i = 0; i < carsInLot; i++) {
			System.out.println("Enter Car #" + (i + 1) + " Make: ");
			make = scnr.nextLine();
			System.out.println("Enter Car #" + (i + 1) + " Model: ");
			model = scnr.nextLine();
			System.out.println("Enter Car #" + (i + 1) + " Year: ");
			year = scnr.nextInt();
			System.out.println("Enter Car #" + (i + 1) + " price: ");
			price = scnr.nextDouble();
			scnr.nextLine();

			Car car = new Car();
			car.setMake(make);
			car.setModel(model);
			car.setYear(year);
			car.setPrice(price);
			
			carLot.add(car);
			
		}
		System.out.println("Current Inventory: ");
		for (int i = 0; i < carLot.size(); i++) {
			System.out.println(carLot.get(i));	
		}
		scnr.close();
	}

}
