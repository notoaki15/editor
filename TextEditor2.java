import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ClassED {
	void Frame(){
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		JTextArea area = new JTextArea();
		frame.setContentPane(area);
		area.setBackground(Color.black);
		area.setForeground(Color.green);
		area.setFont(new Font(null, Font.ITALIC,15));
		area.setLineWrap(true);
		frame.setVisible(true);
		
	}
}

class main extends ClassED{
	public static void main(String[]arugs){
		ClassED ed = new ClassED();
		ed.Frame();
	}
}
