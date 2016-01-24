/**
 * 
 */
package com.elevator.elevator;

import java.util.ArrayList;
import com.elevator.button.*;

/**
 * @author Kevin
 *
 */
public class Elevator {
	
	private int floorMax = 0;
	private int floorMin = 1;
	private int currentFloor = 0;
	private Door door = new Door();
	private String report;
	private ArrayList<ElevatorButton> buttons = new ArrayList<ElevatorButton>();
	
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
	
	public String moveUp() {
		getFloorMax();	
		String upReport = elevatorReport("I am moving up.");
		return upReport;
	}
	
	public String moveDown() {
		getFloorMin();
		String downReport = elevatorReport("I am moving down.");
		return downReport;
	}
	
	public String elevatorReport(String report) {				
		this.report = report;
		
		return report;
	}
	

}
