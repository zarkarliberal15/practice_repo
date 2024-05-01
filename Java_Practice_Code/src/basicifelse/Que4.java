package basicifelse;

import java.util.Scanner;

/*
 * Q4. Accept a number from the user and check if it is odd or even number
 */
public class Que4 {

	public static boolean isEven(int num) {
		return num%2 == 0;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Kindly enter any number");
		System.out.println(Que4.isEven(s.nextInt())?"Even":"Odd");
		s.close();
	}

}
