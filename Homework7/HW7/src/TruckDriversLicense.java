/*Yilin Luo;
 * NetID: yluo21;
 * Homework7;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
import java.time.LocalDate;

public class TruckDriversLicense extends driversLicense {
    public String truckType;
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public TruckDriversLicense(String License1, String License2,int expirationYear, int expirationMonth, int expirationDay, String state1, String state2, String truckType) {
		super(License1, License2, expirationYear, expirationMonth, expirationDay, state1, state2);
		this.truckType = truckType;
		
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
	@Override
	public String toString() {
		return "The two licenses are equal to each other or not: " + equals() + ". " + "The expiration date is up or not: " + expire() + ". "+ " The truck is " + truckType+ ". ";

	}

}
