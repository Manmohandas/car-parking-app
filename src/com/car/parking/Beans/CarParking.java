package com.car.parking.Beans;

import java.util.Date;

public class CarParking {
	
	private int parkingSlot;
	
	private Date parkingTime;
	
	private Car car;

	public int getParkingSlot() {
		return parkingSlot;
	}

	public void setParkingSlot(int parkingSlot) {
		this.parkingSlot = parkingSlot;
	}

	public Date getParkingTime() {
		return parkingTime;
	}

	public void setParkingTime(Date parkingTime) {
		this.parkingTime = parkingTime;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
