package gui.frame.ex3;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MyTempFrame extends JFrame{
	
	public MyTempFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyTempFrame frame = new MyTempFrame("프레임 만들기");
		
		
	}
}
