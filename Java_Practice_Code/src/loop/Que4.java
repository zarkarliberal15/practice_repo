package loop;

import java.util.Scanner;

/*
 * Q4. Accept a number from the user and calculate the sum of digits
 */
public class Que4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		sc.close();
		int temp = num;
		int sum = 0;
		int rem = 0;
		while(temp!=0) {
			rem = temp%10;
			sum +=rem;
			temp = temp/10;
		}
		System.out.println("Sum of digits of given number("+num+") is "+sum);
	}

}
