import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Question4 extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    Timer t = new Timer(5000,this);
    Random rand = new Random(); 
    public JTextField number;
    public static int z=100;
    
    //Sorry, I just thought it would be fun having the lines change colors.
    Color[] colorForRec = {null, Color.BLUE,Color.BLACK,Color.RED,Color.YELLOW,Color.GREEN,Color.CYAN,Color.PINK, Color.BLACK, Color.BLACK,Color.PINK, Color.BLUE,Color.BLACK};
    
    public void paintComponent(Graphics g) {
    	
    	super.paintComponent(g);
    	
    	for(int y= 0; y<z;y++) {
    		g.setColor(colorForRec[rand.nextInt(10)]);
    		g.drawLine(rand.nextInt(500),rand.nextInt(500), rand.nextInt(500), rand.nextInt(500));

        }
    	    }
	public Question4() {
		// TODO Auto-generated constructor stub
		t.start();
		number = new JTextField(10);
		
        number.addActionListener(new ActionListener() {
            
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//try{
				String f = number.getText();
				int o = Integer.parseInt(f);
				//}catch(error){}
				z=o;
				
			}
			
		});
		add(number);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}

}
