package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Line Compression Program");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X1 X2 Y1 Y2");

		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();

		double length;

		length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of line: " + length);

	
	}

}
