package com.bridgelabz;

import java.util.Scanner;

public class LineCamparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Line Camparison Program");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter x co-ordinate of first point: ");
		int x1 = s.nextInt();
		System.out.println("Enter y co-ordinate of first point: ");
		int y1 = s.nextInt();
		System.out.println("Enter x co-ordinate of second point: ");
		int x2 = s.nextInt();
		System.out.println("Enter y co-ordinate of second point: ");
		int y2 = s.nextInt();

		double lenght_of_line = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.printf("Length of end point is : %.2f %n", lenght_of_line);
		
	}

}
