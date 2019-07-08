/*Yilin Luo;
 * NetID: yluo21;
 * Homework10 LineCanvas;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LineCanvas extends JPanel {

	/**
	 * 
	 */
	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		
		g.setColor(Color.RED);
		g.drawLine(0, 0, width, 0);
		g.drawLine(0, 0, 0, height);
		g.drawLine(0, height-1, width, height-1);
		g.drawLine(width-1, 0, width-1, height);
		
		g.setColor(Color.BLUE);
		g.drawLine(width/2, 0, width/2, height);
		g.drawLine(0, height/2, width, height/2);
		
		g.setColor(Color.GREEN);
		g.drawLine(0, 0, width, height);
		g.drawLine(0, height, width, 0);
		
	}
	
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		JFrame window = new JFrame("JGraphics");
		LineCanvas canvas = new LineCanvas();
		window.add(canvas);
		window.setSize(480, 480);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		
	}

}
