package loop;

import java.util.Scanner;

public class Que12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		sc.close();
		for(int i=num+1;i<=(num+num);i++) {
			System.out.print(i+" ");
		}
	}
}
