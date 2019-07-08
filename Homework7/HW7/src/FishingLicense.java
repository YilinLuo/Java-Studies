/*Yilin Luo;
 * NetID: yluo21;
 * Homework7;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
public class FishingLicense extends License{
    public String type;
 
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public FishingLicense(String License1, String License2,int expirationYear, int expirationMonth, int expirationDay, String type) {
		super(License1, License2, expirationYear,expirationMonth,expirationDay);
		this.type = type; 
	}
	@Override
	public String toString() {
		return "The two licenses are equal to each other or not: " + equals() + ". " + "The expiration date is up or not: " + expire()+". "+ "The permitted fish type is "+type +". ";
}
}
