package loop;

import java.util.Scanner;

/*
 * 15. Accept a number from the user and print the Fibonacci series till that number. 
 */
public class Que15 {

	public static void fibonacciSeries(int num) {
		int a= 0;
		int b= 1;
		int c;
		if(num==0) {
			System.out.println(0);
			return;	
		}
		System.out.print(a+" "+b+" ");
		for(int i=2;i<=num;i++) {
			c = a+b;
			a = b;
			b = c;
			System.out.print(c+" ");
		}
	}
	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		sc.close();
		Que15.fibonacciSeries(num);

	}

}
