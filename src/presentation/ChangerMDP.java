package presentation;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;



public class ChangerMDP extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NP;
	private JPasswordField MDP;
	private JButton btnvalider;
	public JTextField getNP() {
		return NP;
	}

	public JPasswordField getMDP() {
		return MDP;
	}

	public void setNP(JTextField nP) {
		NP = nP;
	}

	public void setMDP(JPasswordField mDP) {
		MDP = mDP;
	}


	public JButton getBtnvalider() {
		return btnvalider;
	}

	public void setBtnvalider(JButton btnvalider) {
		this.btnvalider = btnvalider;
	}

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangerMDP  frame = new ChangerMDP ();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public ChangerMDP() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		setResizable(false);
		setTitle("Modification du mot de passe");
		setBounds(100, 100, 415, 257);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Moteurchangermdp Mmdp = new Moteurchangermdp(this);
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 409, 228);		
		panel_2.setLayout(null);		
		JPanel pnlMDP = new JPanel();
		pnlMDP.setBounds(131, 14, 1, 1);
	    pnlMDP.setLayout(null);
		JLabel lblNewLabel_1 = new JLabel("Modifier Le Mot De Passe ");
		lblNewLabel_1.setBounds(114, 16, 193, 19);
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD | Font.ITALIC, 18));
		JLabel lblNewLabel_2 = new JLabel(" Nom et prénom :");
		lblNewLabel_2.setBounds(69, 71, 100, 14);
		NP = new JTextField();
		NP.setBounds(237, 68, 86, 20);
		NP.setColumns(10);
		JLabel lblNewLabel_3 = new JLabel("Nouveau le mot de passe :");
		lblNewLabel_3.setBounds(69, 118, 165, 14);
		btnvalider = new JButton("Valider");
		btnvalider.setBounds(166, 176, 89, 23);
		JLabel lblNewLabel_4 = new JLabel("******************************************************");
		lblNewLabel_4.setBounds(63, 46, 336, 14);
		MDP = new JPasswordField();
		MDP.setBounds(237, 115, 86, 20);		
		
		
		panel_2.add(pnlMDP);
		contentPane.add(panel_2);
		panel_2.add(lblNewLabel_1);
        panel_2.add(lblNewLabel_2);
		panel_2.add(NP);
     	panel_2.add(lblNewLabel_3);
		panel_2.add(btnvalider);
		panel_2.add(lblNewLabel_4);
		panel_2.add(MDP);
		
		JLabel lblNewLabel_4_2 = new JLabel("******************************************************");
		lblNewLabel_4_2.setBounds(63, 148, 336, 14);
		panel_2.add(lblNewLabel_4_2);
		

		
		btnvalider.addActionListener(Mmdp);

	}
}
