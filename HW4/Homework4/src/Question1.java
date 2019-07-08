/*Yilin Luo;
 * NetID: yluo21;
 * Homework4 Question1;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		System.out.println("Enter some numbers and I will suqare them. Enter 0 and I will stop.");
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		
		do {
			System.out.println("The square of "+(int)x+" is "+ (int)(x*x));
			x = scan.nextDouble();
		}while (scan.nextDouble()!= 0);
		
		scan.close();
        
	}

}
