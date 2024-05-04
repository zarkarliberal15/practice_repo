package loop;

import java.util.Scanner;

/*
 * 6. Accept a number from the user and check if it is palindrome number or not
 */
public class Que6 {

	public static boolean isPalindrome(int num) {
		
		int temp = num;
		int sum = 0;
		int rem = 0;
		while(temp!=0) {
			rem = temp%10;
			sum = (sum*10)+ rem;
			temp = temp/10;
		}
		return num == sum;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		sc.close();
		System.out.println("given number is Palindrome:"+Que6.isPalindrome(num));
	}

}
