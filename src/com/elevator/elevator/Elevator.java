/**
 * 
 */
package com.elevator.elevator;

/**
 * @author Kevin
 *
 */
public class Elevator {
	
	int floorMax = 0;
	int floorMin = 0;
	int currentFloor = 0;
	Door door = new Door();
	private String report;
	
	public Elevator() {
		
	}

	public int getFloorMax() {
		return floorMax;
	}

	public void setFloorMax(int floorMax) {
		this.floorMax = floorMax;
	}

	public int getFloorMin() {
		return floorMin;
	}

	public void setFloorMin(int floorMin) {
		this.floorMin = floorMin;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	
	public void moveUp() {
		elevatorReport("I am moving up.");
		
	}
	
	public void moveDown() {
		elevatorReport("I am moving down.");
	}
	
	public String elevatorReport(String report) {				
		this.report = report;
		return report;
	}
	

}
