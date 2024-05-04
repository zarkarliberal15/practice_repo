package loop;
/*
 * Q5. Accept a number from the user and reverse it.
 */

import java.util.Scanner;

public class Que5 {

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
			sum = (sum*10)+ rem;
			temp = temp/10;
		}
		System.out.println("reverse of given number("+num+") is "+sum);

	}

}
