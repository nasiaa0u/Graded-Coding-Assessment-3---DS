package com.nasir.service;

import java.util.PriorityQueue;
import com.nasir.drive.*;

public class Service {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void printConstructionFloor(int[] floors, int noOfFloors) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());
		int[] tempArray = new int[noOfFloors];
		int max = noOfFloors;
		for (int i = 0; i < noOfFloors; i++) {
			System.out.println("The Floor Size on Day" + (i + 1));
			tempArray[i] = floors[i];
			queue.add(tempArray[i]);
			while (!queue.isEmpty() && queue.peek() == max) {
				System.out.println(queue.poll() + " ");
				max--;
			}
			System.out.println();
		}

	}
}
