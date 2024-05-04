package loop;

import java.util.Scanner;

/*
 * Q10. Go on accepting numbers from the user till the user enters 0 and calculate the sum of these numbers.
 */
public class Que10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter numbers");
		int sum = 0;
		int num;
		while( (num= sc.nextInt()) != 0) {
			sum += num;
		}
		System.out.println("Sum is "+sum);
		sc.close();
	}

}
