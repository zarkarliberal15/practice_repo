package loop;

import java.util.Scanner;

/*
 * Q2. Accept a number from the user and find the factorial of the number 
 */
public class Que2 {
	public static int findFactorial(int num) {
		int result=1;
		for(int i=1;i<=num;i++) {
			result *= i; 
		}
		
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number");
		int num = sc.nextInt();
		sc.close();
		System.out.println("Factorial of "+num+" is "+Que2.findFactorial(num));
	}

}
