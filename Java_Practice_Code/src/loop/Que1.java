package loop;

import java.util.Scanner;

/*
 * Q1. Accept 10 numbers from the user and calculate their sum. (Do not use array) 
 */
public class Que1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 10 numbers");
		int sum = 0;
		for(int i=0;i<10;i++) {
			sum += sc.nextInt();
		}
		System.out.println("Sum of 10 numbers is: "+sum);
		sc.close();
		

	}

}
