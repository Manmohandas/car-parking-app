package com.car.parking.main.app;

import java.util.Scanner;

import com.car.parking.serviceImpl.AutomatedCarParkingImpl;

public class CarParkingMainClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AutomatedCarParkingImpl automatedCarParking = new AutomatedCarParkingImpl();
		while(true) {
			System.out.println("select operation from below list");

			System.out.println("1) craete parking slot");
			System.out.println("2) park");
			System.out.println("3) exit");
			int operation = sc.nextInt();
			
			switch(operation) {
			case 1:
                System.out.println("enter total no of parking slots");
                int totaParkingSlots = sc.nextInt();  
                automatedCarParking.initialiseParkingSlot(totaParkingSlots);
                break;
            case 2:
            	automatedCarParking.park();
                break;
            case 3:
            	break;
            default:
                System.out.println("command not found");
			  
		}
	}

  }
}
