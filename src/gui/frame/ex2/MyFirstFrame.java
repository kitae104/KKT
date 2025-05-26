package gui.frame.ex2;

import javax.swing.JFrame;

public class MyFirstFrame {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("내 프레임");
		f.setSize(300, 300);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

}
