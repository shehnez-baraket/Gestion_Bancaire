package presentation;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;

import Dao.DaoUtilisateur;
import net.proteanit.sql.DbUtils;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Cursor;
import javax.swing.ListSelectionModel;
import java.awt.ComponentOrientation;
import java.util.Locale;
import javax.swing.ImageIcon;
import java.awt.Font;


public class Affichagedesutilisateurs extends JFrame {

	private static final long serialVersionUID = -1168398300844663819L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}

	public void setBtnNewButton_1(JButton btnNewButton_1) {
		this.btnNewButton_1 = btnNewButton_1;
	}
	public JTextField getTextField() {
		return textField;
	}

	public JTable getTable() {
		return table;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public void setTable(JTable table) {
		this.table = table;
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Affichagedesutilisateurs frame = new Affichagedesutilisateurs();
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
	public Affichagedesutilisateurs() {
		
		setTitle("Affichage des utilisateurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 413, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Le nom à  chercher : ");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(10, 33, 144, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(154, 31, 144, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
	    btnNewButton = new JButton("Rechercher");
	    Moteurafficherutilisateur mau = new Moteurafficherutilisateur(this);
	    btnNewButton.addActionListener(mau); 
		btnNewButton.setBounds(284, 82, 103, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Actualiser");
		btnNewButton_1.addActionListener(mau); 
		btnNewButton_1.setBounds(284, 130, 103, 23);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setLocale(new Locale("ar", "TN"));
		scrollPane.setEnabled(false);
		
		scrollPane.setBorder(UIManager.getBorder("InternalFrame.border"));
		scrollPane.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		scrollPane.setViewportBorder(new TitledBorder(UIManager.getBorder("CheckBoxMenuItem.border"), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 205)));
		scrollPane.setBounds(0, 79, 144, 171);
		contentPane.add(scrollPane);
		
		table = new JTable();
		
		
		table.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		table.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		table.setCellSelectionEnabled(true);
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setGridColor(Color.LIGHT_GRAY);
		table.setForeground(Color.BLACK);
		table.setBounds(new Rectangle(5, 5, 5, 5));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setBorder(UIManager.getBorder("Button.border"));
		table.setColumnSelectionAllowed(true);
		table.setSurrendersFocusOnKeystroke(true);
		table.setModel(DbUtils.resultSetToTableModel(new DaoUtilisateur().afficherResultat()));
		DefaultTableCellRenderer custom = new DefaultTableCellRenderer(); 
		custom.setHorizontalAlignment(JLabel.CENTER); 
		for (int i=0 ; i < table.getColumnCount() ; i++) 
		table.getColumnModel().getColumn(i).setCellRenderer(custom);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Affichagedesutilisateurs.class.getResource("/photos/agent.jpg")));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_1);
	}
}
