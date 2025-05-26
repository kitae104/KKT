package gui.frame.ex3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyComponentFrame extends JFrame{
	
	public MyComponentFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
//		setLayout(new FlowLayout());
//		setLayout(new BorderLayout());
//		setLayout(new GridLayout(1,6));
		setLayout(null);
		
		Container c = getContentPane();
		c.setBackground(Color.YELLOW);
		
		JButton btn1= new JButton("버튼1");
		btn1.setSize(100, 50);
		btn1.setLocation(100, 100);
		JButton btn2 = new JButton("버튼2");
		btn2.setBounds(10, 10, 100, 50);
		
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		JButton btn6 = new JButton("버튼6");
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyComponentFrame frame = new MyComponentFrame("컴포넌트");
		
		
	}
}
