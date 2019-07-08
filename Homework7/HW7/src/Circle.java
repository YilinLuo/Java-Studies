/*Yilin Luo;
 * NetID: yluo21;
 * Homework7;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
public class Circle extends Ellipse {
	public Circle(String color, boolean filled, double a, double b) {
		super(color, filled, a, b);
	}
	
	@Override
	public void setA(double a) {
		this.a = a;
		this.b = a;
	}
	@Override
	public void setB(double b) {
		this.b = b;
		this.a = b;
	}
	@Override
	public double getArea() {
		return Math.PI*(this.a)*(this.b);
	}
    public String toString() {
    	return "This circle has the diameter of " + getArea() + ". ";
    }
}
