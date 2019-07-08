/*Yilin Luo;
 * NetID: yluo21;
 * Homework7;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
public class Rectangle extends Shape2D {
    double height;
    double width;
	public Rectangle(String color, boolean filled, double height, double width) {
		super(color, filled);
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		
		return ((this.height)*(this.width));
	}
	
	public String toString() {
		return "This square is" + color + ", it is " + filled + " that it is filled, "+ " and its dimensions are "+ getArea()+ ". "
		;
	}

}
