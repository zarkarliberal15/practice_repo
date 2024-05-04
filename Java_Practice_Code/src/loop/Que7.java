package loop;

import java.util.Scanner;

/*
 * 7. Accept a number from the user and print a table for that number
 */
public class Que7 {

	public static void main(String[] args) {
		System.out.println("Please enter any number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println("--------- Table of "+num+" ---------");
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
		System.out.println("-------------------------------");
	}

}
