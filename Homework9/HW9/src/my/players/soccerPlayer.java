/*Yilin Luo;
 * NetID: yluo21;
 * Homework9;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
package my.players;

public class soccerPlayer {
	public String instrument;
	public String popularity;
	public String repatoireVariety;
	
	public soccerPlayer(String instrument, String popularity, String repatoireVariety) {
		this.instrument = instrument;
		this.popularity = popularity;
		this.repatoireVariety = repatoireVariety;
	}
	
	public String getInstrument() {
		return instrument;
	}
	public String getPopularity() {
		return popularity;
	}
	public String getRepatoireVariety() {
		return repatoireVariety;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}
	public void setRepatoireVariety(String repatoireVariety) {
		this.repatoireVariety = repatoireVariety;
	}
	
	public String toString() {
		return "The player plays " + instrument +". "+"The player's poularity is "+popularity+". "+"The player has the repatoire of "+repatoireVariety+". ";
	}


}
