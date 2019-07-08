/*Yilin Luo;
 * NetID: yluo21;
 * Homework10 Question3;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Question3 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		JFrame window = new JFrame("JGraphics");
		Question3 canvas = new Question3();
		window.add(canvas);
		window.setSize(480, 480);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		
	}
	
    public void paintComponent(java.awt.Graphics g) {
		
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		int corX = width/15;
		int corY = height/15;
		for(int i=0;i<15;i++) {
			//drawing lines from four corners that correspond to different terminal points of
			//defining a line.
				g.drawLine(0, 0, corX*i, height-corY*i);
				g.drawLine(width, 0, height-corX*i, height-corY*i);
			    g.drawLine(width, height,corX*i , height-corY*i);
			    g.drawLine(0, height, height-corX*i, height-corY*i);
		}

	
	


}
    }
