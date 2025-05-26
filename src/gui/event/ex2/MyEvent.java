package gui.event.ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyEvent {

	private JFrame frmMyevent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyEvent window = new MyEvent();
					window.frmMyevent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyEvent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyevent = new JFrame();
		frmMyevent.setTitle("MyEvent");
		frmMyevent.setBounds(100, 100, 450, 300);
		frmMyevent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyevent.getContentPane().setLayout(null);
		
		JButton btnNew = new JButton("New");
		btnNew.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNew.setBackground(Color.YELLOW);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNew.setBackground(Color.PINK);
			}
		});
		btnNew.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				System.out.println("111");
			}
		});
		btnNew.setFont(new Font("D2Coding", Font.BOLD, 16));
		btnNew.setBounds(49, 40, 131, 48);
		frmMyevent.getContentPane().add(btnNew);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("D2Coding", Font.BOLD, 16));
		btnExit.setBounds(241, 40, 131, 48);
		frmMyevent.getContentPane().add(btnExit);
	}
}
