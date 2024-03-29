import java.util.Scanner;

/*
 * Q3. Accept a number from the user - if it is divisible by 3 print “three” , 
 * if it is divisible by 7 print 
 * “seven” and if it is divisible by both 3 & 7, print “three -seven” 
 */

public class Que3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	sc.close();
	if(num%3==0 && num%7==0)
		System.out.println("three -seven");
	else if(num%3==0)
		System.out.println("three");
	else if(num%7 == 0)
		System.out.println("seven");
	else
		System.out.println("invalid number");
		
	}

}
