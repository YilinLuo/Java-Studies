/*Yilin Luo;
 * NetID: yluo21;
 * Homework7;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
public class test {
	public static void main(String[] args) {
		Rectangle shapeOne = new Square("Blue",true,5,5);
		shapeOne.setHeight(10);
		System.out.println(shapeOne);
		
		System.out.println();
		System.out.println();
		
		Ellipse shapeTwo = new Circle("Red",false,7,7);
		shapeTwo.setB(15);
		System.out.println(shapeTwo);
		
		System.out.println();
		System.out.println();
		
		person student = new Student("Bella Tarr", 17, "6304578718", "7038", "NYU", "Computer Science");
		System.out.println(student.toString());
		System.out.println();
		System.out.println(student.greeting());
		
		System.out.println();
		System.out.println();
		
		person student2 = new Student("Wes Anderson", 17, "6304578718", "7038", "NYU", "Studio Arts");
		System.out.println(student2.toString());
		System.out.println();
		System.out.println(student2.greeting());
		
		System.out.println();
		System.out.println();
		
		License s = new License("30625952","30625952",2017,3,8);
		System.out.println(s);
		
		System.out.println();
		System.out.println();
		
		License driver = new driversLicense("37020219", "37020219", 2018,2,27, "Kentucky", "New York City");
		System.out.println(driver);

		System.out.println();
		System.out.println();
		
		driversLicense truck = new TruckDriversLicense("40363925","6426472836482", 2018,1,19,"Mississipi", "Minnesoda", "yellow truck");
		System.out.println(truck);
		
		System.out.println();
		System.out.println();
		
		License fish = new FishingLicense("6483246872","478264732864872", 2017,3,8,"whale");
		System.out.print(fish);
	}
}
