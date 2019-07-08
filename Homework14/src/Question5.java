import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Question5 {
	public static Set<String> set;
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Tell me the number of strings you wish to be on the list. ");
    	int numOfStr = scan.nextInt();
    	
    	List<String> str = new ArrayList<>();
    	
    	String n = scan.nextLine();
    	int x =0;
    	do{
    		
    		System.out.println("Add an string to your list");
    		n = scan.nextLine();
    		str.add(n);
    		x++;
    	}while(x<=numOfStr-1);
    	
    	printNonDuplicates(str);
        System.out.println("Give me a name. ");
        String userName = scan.nextLine();
        compare(set,userName);
        
    }
    
	private static void printNonDuplicates(Collection<String> Values) {
		
		// TODO Auto-generated method stub
		set = new HashSet<String>(Values);
		for(String value: set) {
			System.out.println(value);
		}
	}
	public static void compare(Set<String> set, String x) {
		for(String vl: set) {
			boolean equals = vl.equalsIgnoreCase(x);
			if(equals==true) {
				System.out.println("The name is on the list. ");
			}
			
		}
	}

	public Question5() {
		// TODO Auto-generated constructor stub
	}

}
