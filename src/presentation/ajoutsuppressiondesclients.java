package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;


public class ajoutsuppressiondesclients extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3;

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getComboBox() {
		return comboBox;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	@SuppressWarnings("rawtypes")
	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}

	public void setBtnNewButton_1(JButton btnNewButton_1) {
		this.btnNewButton_1 = btnNewButton_1;
	}


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ajoutsuppressiondesclients frame = new ajoutsuppressiondesclients();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ajoutsuppressiondesclients() {
		setTitle("Ajout / Suppression d'un client");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom prénom :");
		lblNewLabel.setBounds(55, 49, 98, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CIN :");
		lblNewLabel_1.setBounds(55, 94, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Type de compte :");
		lblNewLabel_2.setBounds(55, 142, 98, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(192, 46, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(193, 91, 139, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Compte courant", "Compte epargne"}));
		comboBox.setBounds(192, 139, 140, 20);
		contentPane.add(comboBox);
		Moteurajoutsuppressionclient mascc = new Moteurajoutsuppressionclient(this);
		btnNewButton = new JButton("Ajouter");
		btnNewButton.addActionListener(mascc); 
		btnNewButton.setBounds(75, 172, 115, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Supprimer");
		btnNewButton_1.addActionListener(mascc); 
		btnNewButton_1.setBounds(75, 227, 115, 23);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_3 = new JLabel("Vous pouvez laisser ce champ vide");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(190, 66, 396, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("lors de la suppression");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(192, 77, 154, 14);
		contentPane.add(lblNewLabel_4);
		
	}
}
