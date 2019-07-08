/*Yilin Luo;
 * NetID: yluo21;
 * Homework7;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
public class Student extends person{
    public String ID;
    public String School;
    public String major; 
    
	public Student(String name, int age, String phoneNum, String ID, String School, String major) {
		super(name, age, phoneNum);
		this.ID = ID;
		this.School = School;
		this.major = major;
	}
	
	@Override
	public String greeting() {
		if(getMajor().equals("Computer Science")) {
			return "Greetings Eearthlings";
		}
		else
			return "Hey";	
	}

	public String getID() {
		return ID;
	}

	public String getSchool() {
		return School;
	}

	public String getMajor() {
		return major;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public void setSchool(String school) {
		School = school;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
