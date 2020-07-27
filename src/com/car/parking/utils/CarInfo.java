package com.car.parking.utils;

import java.util.Scanner;

import com.car.parking.Beans.Car;

public class CarInfo {
	
	public static Car getCarInfo() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please eneter car registration Number and color separated by space");
		String input = sc.nextLine();
	    String args[] = input.split(" ");
	    String registrationNumber = args[0];
	    String color = args[1];
	    Car car = new Car(registrationNumber, color);
	    return car;
	}

}
