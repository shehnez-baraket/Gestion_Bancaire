package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;

public class Creerutilisateur extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NP;
	private JButton btnvalider;
	private JPasswordField MDP;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Creerutilisateur frame = new Creerutilisateur();
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
	public Creerutilisateur() {
		setTitle("Créer un nouvel utilisateur");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 396, 278);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		NP = new JTextField();
		NP.setBounds(202, 84, 86, 20);
		contentPane.add(NP);
		NP.setColumns(10);
		
		btnvalider = new JButton("Valider");
		Moteurcreerutilisateur mu = new Moteurcreerutilisateur(this);
		
		btnvalider.addActionListener(mu); 
		btnvalider.setBounds(139, 191, 89, 23);
		contentPane.add(btnvalider);
		
		MDP = new JPasswordField();
		MDP.setBounds(202, 135, 86, 20);
		contentPane.add(MDP);
		
		JLabel lblNewLabel = new JLabel("Créer un nouvel utilisateur");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(101, 11, 187, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("*******************************************************");
		lblNewLabel_3.setBounds(42, 54, 330, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Nom pr\u00E9nom :");
		lblNewLabel_1.setBounds(70, 87, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" Mot de passe :");
		lblNewLabel_2.setBounds(70, 138, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_4 = new JLabel("*******************************************************");
		lblNewLabel_4.setBounds(42, 166, 330, 14);
		contentPane.add(lblNewLabel_4);
	}

	public JTextField getNP() {
		return NP;
	}

	public JTextField getMDP() {
		return MDP;
	}

	public JButton getBtnvalider() {
		return btnvalider;
	}

	public void setNP(JTextField nP) {
		NP = nP;
	}

	public void setMDP(JPasswordField mDP) {
		MDP = mDP;
	}

	public void setBtnvalider(JButton btnvalider) {
		this.btnvalider = btnvalider;
	}
}
