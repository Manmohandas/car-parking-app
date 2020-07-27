package com.car.parking.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.car.parking.Beans.Car;
import com.car.parking.Beans.CarParking;
import com.car.parking.service.AutomatedCarParking;
import com.car.parking.utils.CarInfo;

public class AutomatedCarParkingImpl implements AutomatedCarParking{
	
	List<CarParking> carParkingList = null;
	
	int nextParkingSlot = 0;
	
	int occupiedSlots = 0;

	@Override
	public void initialiseParkingSlot(int n) {
		carParkingList = new ArrayList<>(n);
		System.out.println("Parking slot initialised with : " + n + " slots");
		
	}

	@Override
	public void park() {
		if(carParkingList == null) {
			System.out.println("There is no parking slots. Please initialize the parking slot first");
		}else {				
				int parkingSlot = getParkingSlot();
				Car car = CarInfo.getCarInfo();
				CarParking carparking = new CarParking();
				carparking.setCar(car);
				carparking.setParkingTime(new Date());
				carparking.setParkingSlot(parkingSlot);
				if(parkingSlot > carParkingList.size()) {
					System.out.println("There is no empty parking Slot .. Please remove one car");
				}else {
					carParkingList.add(parkingSlot - 1, carparking);
					occupiedSlots = occupiedSlots + 1;
					System.out.println("Car " + car.getRegistrationNumber() + " with color " +  car.getColor() + " has been parked at parking slot " + parkingSlot);
			
				}
				}
		
	}
	
	private int getParkingSlot() {
		if(carParkingList.size() == 0) {
			occupiedSlots = occupiedSlots + 1;
			return occupiedSlots;
		}else {
			return occupiedSlots + 1;
		}
		
	}

}
