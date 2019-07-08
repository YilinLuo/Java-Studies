/*Yilin Luo;
 * NetID: yluo21;
 * Homework4 Question1;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Give me three integers, seperated by space.");	
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		do {
			for (int i=num1; i <= num2; i+=num3) {
				System.out.print(i + " ");	
				}
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			num3 = scan.nextInt();
	}while((num1!=0)&&(num2!=0)&&(num3!=0));
	    scan.close();
	}
}
