/*Yilin Luo;
 * NetID: yluo21;
 * Homework7;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random; 
public class License {
    public String License1;
    public String License2;
	public String expirationDate;
	public int expirationYear;
	public int expirationMonth;
	public int expirationDay;
	
	
	public int getExpirationYear() {
		return expirationYear;
	}

	public int getExpirationMonth() {
		return expirationMonth;
	}

	public int getExpirationDay() {
		return expirationDay;
	}

	public void setExpirationYear(int expirationYear) {
		this.expirationYear = expirationYear;
	}

	public void setExpirationMonth(int expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	public void setExpirationDay(int expirationDay) {
		this.expirationDay = expirationDay;
	}

	public String getLicense1() {
		return License1;
	}

	public String getLicense2() {
		return License2;
	}

	public void setLicense1(String license1) {
		License1 = license1;
	}

	public void setLicense2(String license2) {
		License2 = license2;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public License(String License1, String License2,int expirationYear, int expirationMonth, int expirationDay) {
		this.License1 = License1;
		this.License2 = License2;
		this.expirationYear = expirationYear;
		this.expirationMonth = expirationMonth;
		this.expirationDay = expirationDay;
	}
	
	public String equals() {
		boolean s = (License1).equalsIgnoreCase(License2);
		if (s == true) {
			return "True";
		}
		else
			return "The two licenses are not equal";
	}
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
	public String toString() {
		return "The two licenses are equal to each other or not: " + equals() + ". " + "The expiration date is up or not: " + expire();
	}
}
