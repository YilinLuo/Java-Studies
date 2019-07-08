/*Yilin Luo;
 * NetID: yluo21;
 * Homework9;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
import my.players.MP3Player;
import my.players.saxophonePlayer;
import my.players.soccerPlayer;

public class testForPlayers {

	public static void main(String[] args) {
		MP3Player MP3 = new MP3Player("all the instrument(recording of all the instruments)","very popular","repatoire is infinite(since MP3 can store many songs)");
        System.out.println(MP3);
        saxophonePlayer sXP = new saxophonePlayer("saxophone","popular in jazz","jazz music");
        System.out.println(sXP);
        soccerPlayer sCP = new soccerPlayer("soccer, sports","very popular","tournaments");
        System.out.println(sCP);
	}

}
