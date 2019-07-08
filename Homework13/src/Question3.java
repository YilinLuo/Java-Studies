/*Yilin Luo;
 * NetID: yluo21;
 * Homework13;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Question3 extends JPanel implements ActionListener{
    public static double theta=0;
    public static double x ;
	public static double y ;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Question3() {
		// TODO Auto-generated constructor stub
		t.start();
	}

	int recSize = 10;
    Timer t = new Timer(10,this);
    
	public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	g.fillRect((int)x+getWidth()/2, (int)y+getHeight()/2, recSize, recSize);

    	g.drawOval(getWidth()/2-20, getHeight()/2-20, 40, 40);
    }
    
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
		// TODO Auto-generated method stub
	
		theta+=0.02;
		x = 20*Math.cos(theta);
		y=  20*Math.sin(theta);
		
		repaint();
		
		if(theta>6.28&&theta<=6.3) {
			t.stop();
		}

	}
}

	


