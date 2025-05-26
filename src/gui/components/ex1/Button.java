package gui.components.ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;

public class Button {

	private JFrame frame;
	private JLabel lblResult;
	private int sum;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Button window = new Button();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Button() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		sum = 0;
		frame = new JFrame();
		frame.setTitle("다양한 컴포넌트");
		frame.setBounds(100, 100, 444, 615);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("다양한 컴포넌트 다루기");
		lblNewLabel.setFont(new Font("D2Coding", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JButton btnExit = new JButton("버튼");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setIcon(new ImageIcon("images/normalIcon.gif"));
		btnExit.setRolloverIcon(new ImageIcon("images/rolloverIcon.gif"));
		btnExit.setPressedIcon(new ImageIcon("images/pressedIcon.gif"));
		btnExit.setBounds(248, 490, 168, 42);
		panel_1.add(btnExit);
		
		JLabel lblNewLabel_1 = new JLabel("사과 100원, 배 500원, 체리 2000원");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1.setBounds(71, 21, 280, 26);
		panel_1.add(lblNewLabel_1);
		
		JCheckBox ckApple = new JCheckBox("사과");
		ckApple.addItemListener(new ItemListener() {			
			public void itemStateChanged(ItemEvent e) {
				int i = e.getStateChange();
				if(i == 1) {
					sum += 100;
				} else {
					sum -= 100;
				}
				lblResult.setText("현재 " + sum + "원 입니다.");
			}
		});
		ckApple.setBounds(71, 69, 56, 23);
		ckApple.setBorderPainted(true);
		panel_1.add(ckApple);
		
		JCheckBox ckPear = new JCheckBox("배");
		ckPear.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				int i = e.getStateChange();
				if(i == ItemEvent.SELECTED) {
					sum += 500;
				} else {
					sum -= 500;
				}
				lblResult.setText("현재 " + sum + "원 입니다.");
			}
		});
		ckPear.setBounds(177, 69, 56, 23);
		ckPear.setBorderPainted(true);
		panel_1.add(ckPear);
		
		JCheckBox ckCherry = new JCheckBox("체리");
		ckCherry.setBounds(264, 69, 56, 23);
		ckCherry.setBorderPainted(true);
		panel_1.add(ckCherry);
		
		lblResult = new JLabel("현재 0원 입니다.");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setFont(new Font("굴림", Font.BOLD, 16));
		lblResult.setBounds(71, 114, 280, 26);
		panel_1.add(lblResult);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("남자");
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					lblResult.setText("남자 선택");
				}
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(112, 157, 56, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("여자");
		rdbtnNewRadioButton_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					lblResult.setText("여자 선택");
				}
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(219, 157, 56, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		textField = new JTextField();
		textField.setBounds(52, 226, 223, 42);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("추가");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(288, 225, 97, 42);
		panel_1.add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(52, 305, 1, 1);
		panel_1.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(71, 305, 1, 1);
		panel_1.add(list_1);
		
		JList list_2 = new JList();
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_2.setBounds(26, 305, 146, 162);
		panel_1.add(list_2);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.setBounds(184, 323, 48, 42);
		panel_1.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(264, 302, 136, 23);
		panel_1.add(comboBox);
	}
}
