package presentation;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ajoutetsuppressiondescomptes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField dm;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1 ;
	private JButton btnNewButton_2 ;
	private JButton btnNewButton_3;	
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox ;


	public JTextField getTextField_5() {
		return textField_5;
	}

	public JTextField getTextField_6() {
		return textField_6;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}
	@SuppressWarnings("rawtypes")
	public void setComboBox( JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public JButton getBtnNewButton_2() {
		return btnNewButton_2;
	}

	public JButton getBtnNewButton_3() {
		return btnNewButton_3;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}

	public void setBtnNewButton_1(JButton btnNewButton_1) {
		this.btnNewButton_1 = btnNewButton_1;
	}

	public void setBtnNewButton_2(JButton btnNewButton_2) {
		this.btnNewButton_2 = btnNewButton_2;
	}

	public void setBtnNewButton_3(JButton btnNewButton_3) {
		this.btnNewButton_3 = btnNewButton_3;
	}
	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_1() {
		return dm;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public void setTextField_1(JTextField textField_1) {
		this.dm = textField_1;
	}

	public JTextField getDm() {
		return dm;
	}

	public void setDm(JTextField dm) {
		this.dm = dm;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ajoutetsuppressiondescomptes frame = new Ajoutetsuppressiondescomptes();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Ajoutetsuppressiondescomptes() {
		setTitle("Ajout/Suppression des comptes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 492, 321);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 456, 260);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Comptes courants", null, panel, null);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(167, 45, 96, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CIN :");
		lblNewLabel.setBounds(31, 48, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Découvert maximal :");
		lblNewLabel_1.setBounds(31, 83, 130, 14);
		panel.add(lblNewLabel_1);
		
		dm = new JTextField();
		dm.setBounds(167, 80, 96, 20);
		panel.add(dm);
		dm.setColumns(10);
		Moteurajoutsuppressiondescomptes Mas = new Moteurajoutsuppressiondescomptes(this);
		btnNewButton = new JButton("Ajouter");
		btnNewButton.addActionListener(Mas);
		btnNewButton.setBounds(42, 164, 96, 23);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Supprimer");
		
		btnNewButton_1.addActionListener(Mas);
		btnNewButton_1.setBounds(42, 198, 96, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Nom pr\u00E9nom :");
		lblNewLabel_5.setBounds(31, 11, 86, 14);
		panel.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(167, 8, 98, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Solde d'ouverture :");
		lblNewLabel_6.setBounds(31, 125, 111, 14);
		panel.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setBounds(167, 122, 96, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Vous pouvez laisser ce champ vide");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setBackground(Color.WHITE);
		lblNewLabel_7.setBounds(167, 142, 223, 20);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Vous pouvez saisir le num\u00E9ro de CIN uniquement");
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setBounds(148, 202, 293, 14);
		panel.add(lblNewLabel_8);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Comptes d'épargne", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("CIN :");
		lblNewLabel_2.setBounds(27, 44, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(168, 44, 96, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Taux d'interet :");
		lblNewLabel_3.setBounds(27, 81, 96, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("%");
		lblNewLabel_4.setBounds(274, 81, 18, 14);
		panel_1.add(lblNewLabel_4);
		
		btnNewButton_2 = new JButton("Ajouter");
		btnNewButton_2.setBounds(39, 167, 96, 23);
		panel_1.add(btnNewButton_2);
		btnNewButton_2.addActionListener(Mas);
		
		btnNewButton_3 = new JButton("Supprimer");
		btnNewButton_3.addActionListener(Mas); 
		btnNewButton_3.setBounds(39, 198, 96, 23);
		panel_1.add(btnNewButton_3);
		
		JLabel lblNewLabel_5_1 = new JLabel("Nom pr\u00E9nom :");
		lblNewLabel_5_1.setBounds(27, 11, 86, 14);
		panel_1.add(lblNewLabel_5_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(168, 8, 98, 20);
		panel_1.add(textField_5);
		
		JLabel lblNewLabel_6_1 = new JLabel("Solde d'ouverture :");
		lblNewLabel_6_1.setBounds(27, 128, 111, 14);
		panel_1.add(lblNewLabel_6_1);
		
		textField_6 = new JTextField();
		textField_6.setText("0");
		textField_6.setColumns(10);
		textField_6.setBounds(168, 125, 96, 20);
		panel_1.add(textField_6);
		
		JLabel lblNewLabel_7_1 = new JLabel("Vous pouvez laisser ce champ vide");
		lblNewLabel_7_1.setForeground(Color.RED);
		lblNewLabel_7_1.setBackground(Color.WHITE);
		lblNewLabel_7_1.setBounds(168, 148, 223, 20);
		panel_1.add(lblNewLabel_7_1);
		
		comboBox = new JComboBox();
		comboBox.setModel((ComboBoxModel) new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox.setBounds(168, 78, 96, 20);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_8_1 = new JLabel("Vous pouvez saisir le num\u00E9ro de CIN uniquement");
		lblNewLabel_8_1.setForeground(Color.RED);
		lblNewLabel_8_1.setBackground(Color.WHITE);
		lblNewLabel_8_1.setBounds(145, 202, 293, 14);
		panel_1.add(lblNewLabel_8_1);
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}
}
