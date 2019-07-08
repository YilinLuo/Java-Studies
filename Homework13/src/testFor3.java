import java.awt.Dimension;

import javax.swing.JFrame;

public class testFor3{
	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		Question3 canvas = new Question3();
		jframe.add(canvas);
		Dimension dimension = new Dimension(500,500);
		jframe.getContentPane().setPreferredSize(dimension);
		jframe.pack();
		//jframe.setSize(500,500);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
