package swingDemo;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AddGui {



public static void main(String[] args) {

	
	Addition obj = new Addition();
	
	

	}//End of Main Method 
}//End class ADDGui
class Addition extends JFrame implements ActionListener{
	
	
	JTextField t1, t2;
	JButton b;
	JLabel l;
	
	public Addition() {
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		b = new JButton("OK");
		l = new JLabel("Result");
		
		add(t1);
		add(t2);
		add(b);
		add(l);
		
		b.addActionListener(this);
		
		setVisible(true);
		setSize(300,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(3);
	}
	
	
public void actionPerformed(ActionEvent ae) {
	
	int num1 =Integer.parseInt(t1.getText());
	int num2 =Integer.parseInt(t2.getText());
	
	int value = num1 + num2;
	l.setText(value + "");
}
	
	
}//End of Addition Class
