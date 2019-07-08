/*Yilin Luo;
 * NetID: yluo21;
 * Homework8;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		//Object[] objectArray = new Object[size];
		System.out.println("Please enter a size for your integer array: ");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] intArray = new int[size];
		
		//stillEx1
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Please input element @ index = " + i);
			intArray [i] = scan.nextInt();
		}
		
		printArray(intArray);
		midArray(intArray);
		minimunArray(intArray);
		addToArray(intArray);
		copyArray(intArray);
		addingArray(intArray);
	
		scan.close();
	}
	public static void printArray(int[] array)
	{   System.out.print("The array is: ");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		}
	public static void midArray(int[] array) {
		if((array.length%2)==0) {
			//This is for the consideration to the scenario that the number of indices is even-
			//for which case, I choose to use the largest integer that is smaller or equal to
			//half of the array length, then that number would be the index I choose.
			System.out.println("The middle index is " + Math.floorDiv(array.length, 2));
			System.out.print("The value of the middle index is " +array[Math.floorDiv(array.length, 2)]);
		}
		else if((array.length%2)!=0) {
			//This is for the consideration to the scenario that the number of indices is odd-
			//for which case, I choose to use the smallest integer that is greater than or equal to
			//half of the array length, then that number would be the index I choose.
			System.out.println("The middle index is " + (int)Math.ceil(array.length/ 2));
			System.out.println("The value of the middle index is " +array[(int) Math.ceil(array.length/ 2)]);
		}
	}
	public static void minimunArray(int[] array) {
		int i;
		int min;
		double inf = Double.POSITIVE_INFINITY;
		for(i=0;i<array.length;i++) {
			if(array[i]<inf) {
				min = array[i];
				if(array[i]>array[i++]) {
					min = array[i++];
			}
				else if(array[i]<array[i++]) {
					min = array[i];
				}
			System.out.println("The minimun is "+min);
		}
		}
	}

	public static void addToArray(int[] array) {
		System.out.print("Give me an integer. ");
		Scanner scan2 = new Scanner(System.in);
		int input = scan2.nextInt();
		int i;
		System.out.print("The added string is: ");
		for(i=0;i<array.length;i++) {
			array[i]=array[i]+input;
			System.out.print(array[i]+" ");
		}
		System.out.println();
		scan2.close();
	}
	
	public static void copyArray(int[] intArray) {
		int k;
		int[] newArray = intArray;
		for (k=0;k<intArray.length;k++) {
			newArray[k] = intArray[k];
		}
		System.out.println("The first element in copied array is " + newArray[0]+". "+"The last element of the copied array is "+newArray[intArray.length-1]);
	}

	
	public static void addingArray(int[] intArray) {
		int j;
		int[] newArrayY = new int[intArray.length];
		String y= "The original is: ";
		System.out.print(y);
		for (j=0;j<intArray.length;j++) {
			newArrayY[j]=intArray[j];
			System.out.print(newArrayY[j]+" ");
			}
		System.out.println();
		String z = "The new one is: ";
		System.out.print(z);
		for (j=0;j<intArray.length;j++) {
			intArray[j]= newArrayY[j]+intArray[j];
			
			System.out.print(intArray[j]+" ");
		
			
}
		}
}
	
