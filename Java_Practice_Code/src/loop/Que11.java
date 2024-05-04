package loop;

import java.util.Scanner;

/*
 * 11. Accept a number from the user and print the next 5 numbers. 
 */
public class Que11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number");
		int num= sc.nextInt();
		sc.close();
		for(int j=num+1;j<=(num+5);j++)
			System.out.print(j+" ");
	}

}
