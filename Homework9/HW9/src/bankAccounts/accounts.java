/*Yilin Luo;
 * NetID: yluo21;
 * Homework9;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
package bankAccounts;

public class accounts {
	
	    public accounts(String userName, String userID) {
		    this.userID = userID;
		    this.userName = userName;
	}

		public String userID;
		public String userName;
		
		public String getUserID() {
			return userID;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserID(String userID) {
			this.userID = userID;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		
		
		public String toString() {
			return "The bank user name is "+userName+". "+"The user ID is "+userID+".";
		}
		

	

}



