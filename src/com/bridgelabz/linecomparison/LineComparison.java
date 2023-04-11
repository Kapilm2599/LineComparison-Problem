package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Line Compression Program");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X1 X2 X3 X4");

		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();
		int x4 = sc.nextInt();
		
		System.out.println("Enter the value of Y1 Y2 Y3 Y4");
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		int y3 = sc.nextInt();
		int y4 = sc.nextInt();

		double length1;
		double length2;

		length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of line1: " + length1);
		length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		System.out.println("Length of Line 2: " + length2);

		if (length1 == length2) {
			System.out.println("Both Length are Equal");
		} else {
			System.out.println("Not Equal");
		}

	
	}

}
