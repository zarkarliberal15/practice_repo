package basicifelse;

import java.util.Scanner;

/*
 * 5. Accept a number from the user check if it is odd or even number (Do not use % operator) 
 */
public class Que5 {
	public static int isEven(int num) {
		return (num & 1) ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly enter any number");
		if(isEven(sc.nextInt())==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		sc.close();

	}

}
