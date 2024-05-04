package loop;

import java.util.Scanner;

/*
 * 14. Accept start and end range from the user and print all odd numbers between them
 */
public class Que14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter start number");
		int start = sc.nextInt();
		System.out.println("Please enter end number");
		int end = sc.nextInt();
		sc.close();
		for(int i=start;i<=end;i++) {
			if(i%2!=0)
			   System.out.print(i+" ");
		}
	}

}
