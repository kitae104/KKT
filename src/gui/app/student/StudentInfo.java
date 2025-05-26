package gui.app.student;

import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentInfo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfSearch;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentInfo frame = new StudentInfo();
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
	public StudentInfo() {
		setTitle("학생 정보 검색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cbSelect = new JComboBox();
		cbSelect.setFont(new Font("굴림", Font.BOLD, 18));
		cbSelect.setModel(new DefaultComboBoxModel(new String[] {"id", "name", "code", "dept", "grade", "score"}));
		cbSelect.setBounds(12, 10, 87, 29);
		contentPane.add(cbSelect);
		
		tfSearch = new JTextField();
		tfSearch.setFont(new Font("굴림", Font.BOLD, 18));
		tfSearch.setBounds(111, 12, 168, 25);
		contentPane.add(tfSearch);
		tfSearch.setColumns(10);
		
		JButton btnSearch = new JButton("검색");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectItem = cbSelect.getSelectedItem().toString();
				String searchText = tfSearch.getText();
				
				String sql = "SELECT * FROM member "
						+ "WHERE " + selectItem + " LIKE '%" + searchText + "%' "
						+ "ORDER BY id";
				
				loadTableData(sql);
				
			}
		});
		btnSearch.setFont(new Font("굴림", Font.BOLD, 18));
		btnSearch.setBounds(291, 11, 79, 26);
		contentPane.add(btnSearch);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 49, 358, 309);
		contentPane.add(scrollPane);
		
		model = new DefaultTableModel();
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
		table.setRowSorter(sorter);
		
		
		String sql = "SELECT * FROM member ORDER BY id";
		loadTableData(sql);
	}

	private void loadTableData(String sql) {		
		
		try {
			String[] colNames = {"id", "name", "code", "dept", "grade", "score"};
			model.setColumnIdentifiers(colNames);
			model.setRowCount(0);
			
			ResultSet rs = DB.executeQuery(sql);
			
			while(rs.next()) {
				Object[] rowData = {
						rs.getInt("id"),
						rs.getString("name"),
						rs.getString("code"),
						rs.getString("dept"),
						rs.getInt("grade"),
						rs.getDouble("score")						
				};
				model.addRow(rowData);
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "데이터 로딩중 오류 발생", "에러", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
	}
}








