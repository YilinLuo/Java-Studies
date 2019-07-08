/*Yilin Luo;
 * NetID: yluo21;
 * Homework4 Question1;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		System.out.println("Give me a number.");
		Scanner scan = new Scanner(System.in);
		double num = scan.nextInt();
		double i;
		i = 0;
		double count;
		for (count=1;count<=num ;count++) {
			double num2 = count;
			if ((num2%2) != 0) {
	/*I am resetting num2 to the fraction form.
	*/		
				num2 = 1/num2;

			}
			else {num2 = (0-(1/num2));}
			i = i + num2;
			
		}
        System.out.println(i);
        scan.close();
	}

}
