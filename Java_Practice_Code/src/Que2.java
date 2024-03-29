import java.util.Scanner;

/*
 * Q2. Accept the marks from the user and print the grade 
 *  a. Marks>=75 grade A 
 *  b. Marks >=55 grade B 
 *  c. Marks >=35 grade C 
 *  d. Else fail 
 */

public class Que2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int marks = sc.nextInt();
		sc.close();
		
		if(marks>=75) {
			System.out.println("Grade A");
		}else if(marks>= 55) {
			System.out.println("Grade B");
		}else if(marks>= 35) {
			System.out.println("Grade C");
		}else {
			System.out.println("Fail!");
		}
		
	}

}
