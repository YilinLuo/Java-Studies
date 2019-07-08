/*Yilin Luo;
 * NetID: yluo21;
 * Homework9;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
import computerUserAccounts.accounts;
public class testForAccounts {

	public static void main(String[] args) {
		accounts cUser = new accounts("Wes Anderson","30625952");
		System.out.println(cUser);
		bankAccounts.accounts bUser = new bankAccounts.accounts("Paul Thomas Anderson","50625926");
		System.out.println(bUser);

	}

}
