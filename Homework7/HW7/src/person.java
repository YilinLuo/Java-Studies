/*Yilin Luo;
 * NetID: yluo21;
 * Homework7;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
public class person
{
	private String name;
	private int age;
	private String phoneNum;
	
	public person(String name, int age, String phoneNum) {
		this.name = name;
	    this.age = age;
		this.phoneNum = phoneNum;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	
	public String getPhoneNum() {
		return this.phoneNum;
	}
    public void setPhoneNum(String phoneNum) {
    	this.phoneNum = phoneNum;
    }
   

	
    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString(){
    	return String.format("Name is %s. Age is %d. Phone number is %s.", name, age,phoneNum );
          /*I am using a place holder. "%s" is string.*/
    }
	public String greeting() {
		return "Hello! Welcome to our system!";    
	}

		
		

	}


