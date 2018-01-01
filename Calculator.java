import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

class Calculator{
	public static void main(String[] args) {
		CwinMain wm = new CwinMain();
	}
}

class CwinMain extends JFrame{
	JButton button1 = new JButton("确定");
	
	JLabel label1 = new JLabel("+");
	JLabel label2 = new JLabel("=");
	static JTextField text1 = new JTextField(10);
	static JTextField text2 = new JTextField(10);
	static JTextField text3 = new JTextField(10);
	
	Dog dog = new Dog();
	public CwinMain() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		setBounds(100, 100, 500, 550);
		//button1.set
		add(text1);
		add(label1);
		add(text2);
		add(label2);
		add(text3);
		add(button1);
		setVisible(true);
		button1.addActionListener(dog);
		
	}
}

class Dog implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String texta = CwinMain.text1.getText();
		String textb = CwinMain.text2.getText();
		double fA = Double.valueOf(CwinMain.text1.getText().toString());
		double fB = Double.valueOf(CwinMain.text2.getText().toString());
		double sum = fA+fB;
		String textc = Double.toString(sum);
		CwinMain.text3.setText(textc);
		
	}
	
}
