package loop;

import java.util.Scanner;

/*
 * Q16. Accept a number and a single digit from the user. Then check the number of occurrences of that digit 
in the number
 */
public class Que16 {

	public static int countDigit(int num, int digit) {
		int count =0;
		int temp = num;
		int rev = 0;
		while(temp!=0) {
			rev = temp%10;
			if(digit == rev)
				count++;
			
			temp /=10;
			
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = sc.nextInt();
		System.out.println("Please enter any digit");
		int digit = sc.nextInt();
		sc.close();
		
		System.out.println("Count: "+Que16.countDigit(num, digit));
		
		
	}

}
