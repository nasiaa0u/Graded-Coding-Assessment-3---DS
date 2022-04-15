package com.nasir.drive;

import java.util.Scanner;

import com.nasir.service.Service;

public class Driver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan1= new Scanner(System.in);
		System.out.println("Enter the No of floors in the Buidling ");
		int noOfFloors= scan1.nextInt();
		
		int[]floors= new int[noOfFloors];
		
		for (int i=0; i<noOfFloors;i++)
		
		{
			System.out.println("Enter the size of the floor that is manfactured on Day"+(i+1));
			floors[i]= scan1.nextInt();
		}	
		
		Service service= new Service();
		service.printConstructionFloor(floors,noOfFloors);
	}
	

}

