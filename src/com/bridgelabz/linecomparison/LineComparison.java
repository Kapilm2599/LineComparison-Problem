package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
	
	static double length1, length2, length;
	static int x1, x2, y1, y2;

	public void coordinates() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value X1 X2 Y1 Y2");
		
		int x1 = scanner.nextInt();    
		int x2 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int y2 = scanner.nextInt();

		length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	public void getLenght() {
		coordinates();
		length1 = length;
		System.out.println("Enter Value For second Line: ");
		coordinates();
		length2 = length;
		System.out.println("Length of Line1: " + length1);
		System.out.println("Length of Line2: " + length2);
	}

	public void compareLines() {
		// value = lenOfLineFirst.compareTo(lenOfLineSecond);
		if (length1 == length2)    
			System.out.println("Both lines are Equal.");
		else if (length1 > length2)
			System.out.println("Line1 is greater than Line2.");
		else
			System.out.println("Line1 is smaller than Line2.");
		

	}

}
