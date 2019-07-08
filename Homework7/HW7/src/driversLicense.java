/*Yilin Luo;
 * NetID: yluo21;
 * Homework7;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class driversLicense extends License {
	public String state1;
	public String state2;
	public String getState1() {
		return state1;
	}

	public String getState2() {
		return state2;
	}

	public void setState1(String state1) {
		this.state1 = state1;
	}

	public void setState2(String state2) {
		this.state2 = state2;
	}

	public driversLicense(String License1, String License2,int expirationYear, int expirationMonth, int expirationDay, String state1, String state2) {
		super(License1,License2, expirationYear, expirationMonth, expirationDay);
		this.state1 = state1; 
		this.state2 = state2;
	}

	@Override
	public String equals() {
		boolean s = (License1).equalsIgnoreCase(License2);
		boolean state = (state1).equalsIgnoreCase(state2);
		if ((s == true)&&(state ==true)) {
			return "True";
		}
		else
			return "The two licenses are not equal";
	}
	@Override
	public String expire() {
		LocalDate today = LocalDate.now();
		LocalDate expirationDate = LocalDate.of(expirationYear, expirationMonth, expirationDay);
		boolean e = (today).isAfter(expirationDate);
		if(e == true) {
			return "True";
			
		}
		else 
			return "Not expired";
			
	}

}
