/*Yilin Luo;
 * NetID: yluo21;
 * Homework10 Question6;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Question6 extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
  
		int height = getHeight();
		Color[] b = {null, Color.BLUE,Color.BLACK,Color.RED,Color.YELLOW,Color.GREEN,Color.CYAN,Color.PINK, Color.BLACK, Color.BLACK,Color.PINK, Color.BLUE,Color.BLACK};
		int i;
		int radius =10;
		int c = height/2;
		// integer i loops through for getting values from color indices and incrementing to
		//change x,y coordinates. 
		for(i=1;i<13;i++) {
			
			g.setColor(b[i]);	
			g.drawOval(c-radius*i,c-radius*i,radius*2*i,radius*2*i);
		
		}
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		JFrame window = new JFrame("JGraphics");
		Question6 canvas = new Question6();
		window.add(canvas);
		window.setSize(480, 480);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
