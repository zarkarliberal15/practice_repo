package loop;
/*
 * Q8. Accept a number from the user check if it is special number or not?
 * Example: 145 
 * 1! =1 
 * 4!=1*2*3*4
 * 5!=1*2*3*4*5 
 * sum of the factorials is (1+24+120=145) 
 */

import java.util.Scanner;

public class Que8 {

	public static int factorial(int num) {
		int result =1;
		for(int i=1;i<=num;i++) {
			result *=i; 
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter any number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int rem = 0;
		int temp = num;
		int sum = 0;
		while(temp!=0) {
			rem = temp%10;
			sum += Que8.factorial(rem);
			temp = temp/10;
		}
		
		System.out.println((sum==num)?"Special number":"Not a special number"); 
		
	}

}
