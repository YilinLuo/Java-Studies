/*Yilin Luo;
 * NetID: yluo21;
 * Homework7;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
public class Ellipse extends Shape2D{
    private static final double PI = 0;
	double a;
    double b;
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Ellipse(String color, boolean filled, double a, double b) {
		super(color, filled);
		this.a = a;
		this.b = b;
		
	}

	@Override
	public double getArea() {
		
		return PI*this.a*this.b;
	}
	
	
	public String toString() {
		return "This square is" + color + ", it is " + filled + " that it is filled, "+ " and its area is "+ a + getArea() + ". "
		;
	

}
}
