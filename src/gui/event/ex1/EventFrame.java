package gui.event.ex1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventFrame extends JFrame implements ActionListener, MouseListener{
	
	private JButton btn;

	public EventFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		btn = new JButton("버튼");
		btn.addActionListener(this);
		btn.addMouseListener(this);
		add(btn);
		
		setLayout(new FlowLayout());
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		EventFrame frame = new EventFrame("이벤트 이해하기");
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		if(btn.getText().equals("버튼")) {
			btn.setText("Button");			
		} else {
			btn.setText("버튼");
		}
		

		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		btn.setBackground(Color.YELLOW);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		btn.setBackground(Color.RED);
	}
}
