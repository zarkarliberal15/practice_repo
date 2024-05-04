package loop;

import java.util.Scanner;

/*
 * Q3. Accept 10 numbers from the user and count how many are positive, negative or zero.
 */
public class Que3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int positive =0, negative =0, zero = 0;
		System.out.println("Please enter any 10 numbers");
		for(int i=0;i<10;i++ ) {
			int num = sc.nextInt();
			if(num==0) {
				zero++;
			}else if(num >0) {
				positive++;
			}else {
				negative++;
			}
		}
		System.out.println("Zero: "+zero+"\nPositive: "+positive+"\nNegative: "+negative);

	}

}
