package presentation;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

import Dao.DaoClient;
import net.proteanit.sql.DbUtils;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.SystemColor;
import javax.swing.ScrollPaneConstants;

public class affichageetrecherchedesclients extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public void setBtnNewButton_1(JButton btnNewButton_1) {
		this.btnNewButton_1 = btnNewButton_1;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					affichageetrecherchedesclients frame = new affichageetrecherchedesclients();
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
	public affichageetrecherchedesclients() {
		setTitle("Consultation des clients");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 509, 362);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tapez le nom du client :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 28, 132, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(185, 25, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Rechercher");
		Moteurafficherclient mas = new  Moteurafficherclient(this);
     	btnNewButton.addActionListener(mas); 
		btnNewButton.setBounds(363, 11, 120, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 77, 473, 235);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(DbUtils.resultSetToTableModel(new DaoClient().afficherResultat()));
		DefaultTableCellRenderer custom1 = new DefaultTableCellRenderer(); 
		custom1.setHorizontalAlignment(JLabel.CENTER); 
		for (int i=0 ; i < table.getColumnCount() ; i++) 
			table.getColumnModel().getColumn(i).setCellRenderer(custom1);

		scrollPane.setViewportView(table);
		
		btnNewButton_1 = new JButton("Actualiser");
		btnNewButton_1.addActionListener(mas); 
		btnNewButton_1.setBounds(363, 43, 120, 23);
		contentPane.add(btnNewButton_1);
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
}
