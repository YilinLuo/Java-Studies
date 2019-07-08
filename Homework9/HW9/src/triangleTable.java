/*Yilin Luo;
 * NetID: yluo21;
 * Homework9;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
import java.util.Scanner;
public class triangleTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me an integer. ");
		int value = scan.nextInt();
		int[] array = new int[value+1];
		int a =0;
		int k;
		//nested for loop to define rows then columns, but this time in irregular shapes.
		for(a=0;a<array.length;a++) {
			
			array[a]=a;
			System.out.println("");
		
			for(k=array[a];k>=0;k--) {
				
	            System.out.print(" "+k+" ");
			}
			scan.close();
	}
}
}