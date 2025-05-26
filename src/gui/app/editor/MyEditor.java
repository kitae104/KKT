package gui.app.editor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

import gui.components.ex1.ChatForm;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import java.awt.Font;

public class MyEditor extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuItem mItemChat;
	private RSyntaxTextArea taEditor;

	
	
	public RSyntaxTextArea getTaEditor() {
		return taEditor;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyEditor frame = new MyEditor();
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
	public MyEditor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 573);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mItemNew = new JMenuItem("New");
		mItemNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newFunc();
			}
		});
		mnNewMenu.add(mItemNew);
		
		JMenuItem mItemOpen = new JMenuItem("Open");
		mItemOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFunc();
			}
		});
		mnNewMenu.add(mItemOpen);
		
		JMenuItem mItemSave = new JMenuItem("Save");
		mItemSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveFunc();
			}
		});
		mnNewMenu.add(mItemSave);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mItemExit = new JMenuItem("Exit");
		mItemExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exitFunc();		
			}
		});
		mnNewMenu.add(mItemExit);
		
		JMenu mnNewMenu_1 = new JMenu("Options");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Fonts");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Colors");
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_3 = new JMenu("Apps");
		menuBar.add(mnNewMenu_3);
		
		mItemChat = new JMenuItem("My Chat");
		mItemChat.addActionListener(this);
//		mItemChat.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
		mnNewMenu_3.add(mItemChat);
		
		JMenu mnNewMenu_2 = new JMenu("Help");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Info");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "My Editor\nProgram by 김기태", 
						"프로그램 정보", JOptionPane.ERROR_MESSAGE);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_6);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		taEditor = new RSyntaxTextArea();
		taEditor.setFont(new Font("D2Coding", Font.PLAIN, 16));
		taEditor.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
		taEditor.setCodeFoldingEnabled(true);
		
		RTextScrollPane sp = new RTextScrollPane(taEditor);
		
		contentPane.add(sp);
		
		JToolBar toolBar = new JToolBar();
		sp.setColumnHeaderView(toolBar);
		
		JButton btnNew = new JButton("");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newFunc();
			}
		});
		btnNew.setIcon(new ImageIcon("D:\\Java_WS_Cban\\KKT\\images\\new.png"));
		toolBar.add(btnNew);
		
		JButton btnOpen = new JButton("");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFunc();
			}
		});
		btnOpen.setIcon(new ImageIcon("D:\\Java_WS_Cban\\KKT\\images\\open.png"));
		toolBar.add(btnOpen);
		
		JButton btnSave = new JButton("");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveFunc();
			}
		});
		btnSave.setIcon(new ImageIcon("D:\\Java_WS_Cban\\KKT\\images\\save.png"));
		toolBar.add(btnSave);
		
		JButton btnExit = new JButton("");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exitFunc();
			}
		});
		btnExit.setIcon(new ImageIcon("D:\\Java_WS_Cban\\KKT\\images\\exit.png"));
		toolBar.add(btnExit);
	}

	private void newFunc() {
		int res = JOptionPane.showConfirmDialog(this, "새 파일을 만들까요?", "새 파일", 
				JOptionPane.YES_NO_OPTION);
		if(res == JOptionPane.YES_OPTION) {
			taEditor.setText("");
		}
	}
	
	private void saveFunc() {
		JFileChooser fc = new JFileChooser();
		File curDir = new File("C:/Temp");
		fc.setCurrentDirectory(curDir);
		
		fc.addChoosableFileFilter(new FileNameExtensionFilter("Java", "java"));
		fc.addChoosableFileFilter(new FileNameExtensionFilter("TEXT", "txt"));
		fc.setAcceptAllFileFilterUsed(true);
		
		
		fc.showSaveDialog(this);
		File selectedFile = fc.getSelectedFile();
		BufferedWriter bw = null;
		String line = null;
		try {
			bw = new BufferedWriter(new FileWriter(selectedFile));
			String str = taEditor.getText();
			bw.write(str);
		} catch (FileNotFoundException e) {
			System.err.println("111 : ");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("222 : ");
			e.printStackTrace();
		} catch (Exception e) {
			
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private void openFunc() {
		JFileChooser fc = new JFileChooser();
		File curDir = new File("C:/Temp");
		fc.setCurrentDirectory(curDir);
		
		fc.addChoosableFileFilter(new FileNameExtensionFilter("Java", "java"));
		fc.addChoosableFileFilter(new FileNameExtensionFilter("TEXT", "txt"));
		fc.setAcceptAllFileFilterUsed(true);
		
		
		fc.showOpenDialog(this);
		File selectedFile = fc.getSelectedFile();
		BufferedReader br = null;
		String line = null;
		try {
			br = new BufferedReader(new FileReader(selectedFile));
			while((line = br.readLine()) != null) {
				taEditor.append(line + "\n");
			}
		} catch (FileNotFoundException e) {
			System.err.println("111 : ");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("222 : ");
			e.printStackTrace();
		} catch (Exception e) {
			
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	private void exitFunc() {
		int res = JOptionPane.showConfirmDialog(this, 
				"정말 나갈까요?",
				"나가기",
				JOptionPane.YES_NO_OPTION
			);
		if(res == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mItemChat) {
			ChatForm chat = new ChatForm("홍길동 채팅", this);
			chat.getFrame().setVisible(true);
			chat.getTfInput().setText("홍길동");
			this.setVisible(false);
		}
		
	}
}












