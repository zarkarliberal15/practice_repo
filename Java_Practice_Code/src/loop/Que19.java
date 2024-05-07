package loop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 19. Accept 10 numbers from the user and print the highest and the 2nd highest number. 
 */
public class Que19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Please enter 10 numbers");
		for(int i=1;i<=10;i++) {
			numbers.add(sc.nextInt());
		}
		sc.close();
		Collections.sort(numbers);
		
		System.out.println("Highest number is "+ numbers.get(9)+" and 2nd highest number is "+numbers.get(8));
	}

}
