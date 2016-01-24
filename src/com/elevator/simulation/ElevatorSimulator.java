/**
 * 
 */
package com.elevator.simulation;

import com.elevator.elevator.Elevator;

/**
 * @author Kevin
 *
 */
public class ElevatorSimulator {

	private static Elevator e1 = new Elevator();
	private static Elevator e2 = new Elevator();
	private static int floors = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		floors = 20;
		e1.setFloorMax(floors);
		e1.setFloorMin(1);
		
		e1.moveUp();
		
		
	}

}
