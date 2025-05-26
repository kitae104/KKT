package gui.event.ex4;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventFrame {

	private JFrame frame;
	private JLabel lblName;
	private final int STEP = 50;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseEventFrame window = new MouseEventFrame();
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
					window.frame.setFocusable(true);
					window.frame.getContentPane().requestFocus();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MouseEventFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				
			}
		});
		frame.getContentPane().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();
				int keyCode = e.getKeyCode();
				
				System.out.println(keyChar + ", " + keyCode);
				
				if(keyCode == KeyEvent.VK_RIGHT) {
					lblName.setLocation(lblName.getX() + STEP, lblName.getY());
				} else if(keyCode == KeyEvent.VK_LEFT) {
					lblName.setLocation(lblName.getX() - STEP, lblName.getY());
				}
				
			}
		});
		frame.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {				
				lblName.setLocation(e.getPoint());
			}
		});
		frame.setTitle("마우스 이벤트");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblName = new JLabel("홍길동");
		lblName.setBounds(108, 120, 60, 24);
		lblName.setFont(new Font("D2Coding", Font.BOLD, 20));
		frame.getContentPane().add(lblName);
	}
}
