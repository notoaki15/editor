import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TE extends JFrame{
	
	public static void main(String[]args){
		
		JTextArea area = new JTextArea();
		area.setBackground(Color.black);
		area.setForeground(Color.green);
		area.setLineWrap(true);
		
		
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		frame.setBackground(Color.BLACK);
		frame.setContentPane(area);
		frame.setVisible(true);
		
	}

}
