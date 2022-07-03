package presentation;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Dao.DaoCompteCourant;
import Dao.DaoCompteEpargne;
import net.proteanit.sql.DbUtils;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.table.DefaultTableCellRenderer;


public class Consultercomptes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2289992251730470090L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JButton btnNewButton_4 ;
	private JButton btnNewButton_4_1;
	private final JButton btnNewButton = new JButton("Actualiser");
	private JTable table_1;

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public JButton getBtnNewButton_4() {
		return btnNewButton_4;
	}

	public JButton getBtnNewButton_4_1() {
		return btnNewButton_4_1;
	}

	public void setBtnNewButton_4(JButton btnNewButton_4) {
		this.btnNewButton_4 = btnNewButton_4;
	}

	public void setBtnNewButton_4_1(JButton btnNewButton_4_1) {
		this.btnNewButton_4_1 = btnNewButton_4_1;
	}

	public JTable getTable() {
		return table;
	}

	public JTable getTable_1() {
		return table_1;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public void setTable_1(JTable table_1) {
		this.table_1 = table_1;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultercomptes frame = new Consultercomptes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Consultercomptes() {
		
		setTitle("Consulter les comptes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 494, 366);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setForeground(Color.GRAY);
		tabbedPane.setBounds(10, 11, 443, 261);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Comptes courants", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Tapez le nom cherché :");
		lblNewLabel_6.setBounds(10, 11, 143, 14);
		panel.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setColumns(8);
		textField.setBounds(158, 8, 132, 20);
		panel.add(textField);
		MoteurConsulterComptes mcc = new MoteurConsulterComptes(this);
	     btnNewButton_4 = new JButton("Rechercher");
		btnNewButton_4.addActionListener(mcc); 
		btnNewButton_4.setBounds(300, 7, 113, 23);
		panel.add(btnNewButton_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(10, 46, 418, 187);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(DbUtils.resultSetToTableModel(new DaoCompteCourant().afficherResultat()));
		DefaultTableCellRenderer custom = new DefaultTableCellRenderer(); 
		  custom.setHorizontalAlignment(JLabel.CENTER); 
		  for (int i=0 ; i < table.getColumnCount() ; i++) 
		   table.getColumnModel().getColumn(i).setCellRenderer(custom);
		
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Comptes d'épargne", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6_1 = new JLabel("Tapez le nom cherché :");
		lblNewLabel_6_1.setBounds(21, 11, 142, 14);
		panel_1.add(lblNewLabel_6_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(8);
		textField_1.setBounds(161, 8, 132, 20);
		panel_1.add(textField_1);
		
		btnNewButton_4_1 = new JButton("Rechercher");
		
		btnNewButton_4_1.setBounds(301, 7, 113, 23);
		panel_1.add(btnNewButton_4_1);
		btnNewButton_4_1.addActionListener(mcc); 
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 36, 418, 187);
		panel_1.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(DbUtils.resultSetToTableModel(new DaoCompteEpargne().afficherResultat()));
		DefaultTableCellRenderer custom1 = new DefaultTableCellRenderer(); 
		  custom1.setHorizontalAlignment(JLabel.CENTER); 
		  for (int i=0 ; i < table_1.getColumnCount() ; i++) 
			   table_1.getColumnModel().getColumn(i).setCellRenderer(custom1);
		  
		btnNewButton.setBounds(181, 283, 106, 33);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(mcc); 
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(new Color(0, 0, 128));
		
			   
			  
			 
	}
}
