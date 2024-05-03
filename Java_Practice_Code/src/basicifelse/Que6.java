package basicifelse;

import java.util.Scanner;

/*
 * Q6. Accept principal amount, rate of interest and years of investment then find the simple interest
 */
public class Que6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p, y;
		double rio, si;
		System.out.println("Please enter the principal amount");
		p = sc.nextInt();
		System.out.println("Please enter the years");
		y = sc.nextInt();
		System.out.println("Please enter rate of interest(in %)");
		rio = sc.nextDouble();
		System.out.println("Simple interest is: "+(p*(rio/100)*y));
		

	}

}
