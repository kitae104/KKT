package gui.app.student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfDept;
	private JTextField tfCode;
	private JTextField tfGrade;
	private JTextField tfScore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentForm frame = new StudentForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentForm() {
		setTitle("학생 정보 등록폼");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 337, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(30, 28, 57, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("학과");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1.setBounds(30, 74, 57, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("학번");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_2.setBounds(30, 125, 57, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("학년");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_3.setBounds(30, 174, 57, 24);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("학점");
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_4.setBounds(30, 221, 57, 24);
		contentPane.add(lblNewLabel_4);
		
		JButton btnInsert = new JButton("학생 정보 등록");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String insertSQL = "INSERT INTO member(name, dept, code, grade, score) " +
			                       "VALUES (?, ?, ?, ?, ?)";
				int result = DB.executeUpdate(insertSQL,
						tfName.getText(),
						tfDept.getText(),
						tfCode.getText(),
						Integer.parseInt(tfGrade.getText()),
						Double.parseDouble(tfScore.getText()));
				
				if(result > 0) {
					JOptionPane.showMessageDialog(null, "데이터 입력 성공");
					tfName.setText("");
					tfDept.setText("");
					tfCode.setText("");
					tfGrade.setText("");
					tfScore.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "데이터 입력 실패");
				}
			}
		});
		btnInsert.setFont(new Font("굴림", Font.BOLD, 16));
		btnInsert.setBounds(65, 281, 181, 58);
		contentPane.add(btnInsert);
		
		tfName = new JTextField();
		tfName.setBounds(99, 24, 175, 36);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfDept = new JTextField();
		tfDept.setColumns(10);
		tfDept.setBounds(99, 74, 175, 36);
		contentPane.add(tfDept);
		
		tfCode = new JTextField();
		tfCode.setColumns(10);
		tfCode.setBounds(99, 120, 175, 36);
		contentPane.add(tfCode);
		
		tfGrade = new JTextField();
		tfGrade.setColumns(10);
		tfGrade.setBounds(99, 166, 175, 36);
		contentPane.add(tfGrade);
		
		tfScore = new JTextField();
		tfScore.setColumns(10);
		tfScore.setBounds(99, 217, 175, 36);
		contentPane.add(tfScore);
	}
}
