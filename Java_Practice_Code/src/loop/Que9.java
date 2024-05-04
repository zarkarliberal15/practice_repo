package loop;

import java.util.Scanner;

/*
 * Q9. Accept a number from the user and check if it is an Armstrong number or not ?
 *  Example: 153 
 *  1 cube =1 
 *  5 cube =125 
 *  3 cube = 27 
 *  sum of the cubes is (1+27+125=153)
 */
public class Que9 {
	
	public static int calculateNumberOfDigit(int num) {
		int temp = num;
		int count = 0;
		while(temp!=0) {
			count++;
			temp = temp/10;
		}
		return count;
	}
	
	public static int calculatePowerOfDigit(int n, int power) {
		int result = 1;
		for(int i=1;i<=power;i++) {
			result *= n;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number");
		int num =sc.nextInt();
		sc.close();
		int power = Que9.calculateNumberOfDigit(num);
		int rem = 0;
		int temp = num;
		int result = 0;
		while(temp!=0) {
			rem = temp%10;
			result += Que9.calculatePowerOfDigit(rem, power);
			temp /=10;
		}
		System.out.println(num == result? "amstrong number":"Not a amstrong number");
		
	}

}
