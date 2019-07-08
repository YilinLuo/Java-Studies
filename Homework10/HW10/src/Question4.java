/*Yilin Luo;
 * NetID: yluo21;
 * Homework10 Question4;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Question4 extends JPanel{
	
    public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		int a=width/15;
		int b=height/15;
		int i;
		
		for(i=0;i<15;i++) {
			g.drawLine(0, b*i, a*i, height);
		}
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		JFrame window = new JFrame("JGraphics");
		Question4 canvas = new Question4();
		window.add(canvas);
		window.setSize(480, 480);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		
	}
	

}
