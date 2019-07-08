/*Yilin Luo;
 * NetID: yluo21;
 * Homework12;
 * Lab:Mon & Wed 2:00-3:15pm;
 * "I did not copy code from anyone on this homework";
*/
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyApp extends JFrame implements ChangeListener, ItemListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton button_1;
	public JLabel label_1;
	public JButton button_2;
	public JTextField text_1;
	public JSlider SD_1;
	public JCheckBox box_1;
	public JCheckBox box_2;
	int press;
	int press2;
	public MyApp() {
		setTitle("My GUI");
		setSize(500,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		button_1 = new JButton("Button");
		label_1 = new JLabel("Label");
		button_2 = new JButton("Off");
		text_1 = new JTextField( "                "        );
		SD_1 = new JSlider(); 
		box_1 = new JCheckBox();
		box_2 = new JCheckBox();
		
		button_1.addActionListener(new ActionListener() {
            
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("Button Press!");
				press++;
			    label_1.setText("You've pressed the button "+press+" times");
				
			}
			
		});
		
        button_2.addActionListener(new ActionListener() {
            
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				press2++;
				if(press2%2==0) {
					button_2.setText("Off");
				}
				if(press2%2==1){
					button_2.setText("On");
				};				
				
			}
			
		});
        
        text_1.addActionListener(new ActionListener() {
            
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				e.getSource();
				label_1.setText(e.getActionCommand());
			}
			
		});
        
        SD_1.addChangeListener(new ChangeListener() {
        	@Override
        	public void stateChanged(ChangeEvent e) {
        		// TODO Auto-generated method stub
        	label_1.setText("" + SD_1.getValue());
        	}
        });
        
        box_1.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		System.out.println("Box 1 state is changed.");
        		label_1.setText("It is "+ box_1.isSelected() + " that box 1 is checked. ");
        		
        	}
        	
        });
        
        box_2.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		System.out.println("Box 2 state is changed.");
        		label_1.setText("It is "+ box_2.isSelected() + " that box 2 is checked. ");
        		
        	}
        	
        });
        
		add(button_1);
		add(label_1);
		add(button_2);
		add(text_1);
		add(SD_1);
		add(box_1);
		add(box_2);
		
	}
    public static void main(String[] args) {
    	new MyApp().setVisible(true);
    }
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
