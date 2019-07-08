/*Yilin Luo;
 * NetID: yluo21;
 * Homework10 Question2;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class question2 extends JPanel {
	/**
	 * 
	 */
	
	public static void main(String[] args) {
		JFrame window = new JFrame("JGraphics");
		question2 canvas = new question2();
		window.add(canvas);
		window.setSize(480, 480);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		
	}

	public void paintComponent(java.awt.Graphics g) {
		
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		//I am scaling the width and height by 15.
		int corX = width/15;
		int corY = height/15;
		for(int i=0;i<15;i++) {
			    //this draws a line starting (0,0) corresponding to the changing locations that
			//define each line. 
				g.drawLine(0, 0, corX*i, height-corY*i);
			
		}
		
	}

	
	

}
