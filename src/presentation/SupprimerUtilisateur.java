package presentation;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class SupprimerUtilisateur extends JFrame {

	private JPanel contentPane;
	private JTextField NP;
	private JPasswordField passwordField;
	private JButton btnNewButton;

	public JTextField getNP() {
		return NP;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setNP(JTextField nP) {
		NP = nP;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
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
					SupprimerUtilisateur frame = new SupprimerUtilisateur();
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
	public SupprimerUtilisateur() {
		setTitle("Supprimer un utilisateur ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 380, 268);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Supprimer un utilisateur");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(87, 11, 188, 35);
		contentPane.add(lblNewLabel);
		
		NP = new JTextField();
		NP.setBounds(194, 79, 106, 20);
		contentPane.add(NP);
		NP.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nom pr\u00E9nom :");
		lblNewLabel_1.setBounds(87, 82, 97, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mot de passe :");
		lblNewLabel_2.setBounds(87, 129, 97, 14);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton = new JButton("Supprimer");
		Moteursupprimerutilisateur sup = new Moteursupprimerutilisateur(this);
		btnNewButton.addActionListener(sup); 
	
		btnNewButton.setBounds(128, 195, 106, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("***************************************************");
		lblNewLabel_3.setBounds(48, 57, 306, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("***************************************************");
		lblNewLabel_3_1.setBounds(48, 170, 306, 14);
		contentPane.add(lblNewLabel_3_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(194, 126, 106, 20);
		contentPane.add(passwordField);
	}
	}

