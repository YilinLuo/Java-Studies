/*Yilin Luo;
 * NetID: yluo21;
 * Homework4 Question1;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		System.out.println("Give me an integer.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		//the following loop takes care of rows
		for (int i=1; i<=num; i++)	{
			//the following loop takes care of columns
			for (int j=1; j<=num; j++)	{
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
         scan.close();
	}
         
}
