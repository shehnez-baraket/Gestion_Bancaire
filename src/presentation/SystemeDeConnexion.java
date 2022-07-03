package presentation;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class SystemeDeConnexion extends JFrame {

	private static final long serialVersionUID = 1L;
		private JTextField NP;
		private JPasswordField MDP;
       private JButton boutoncnx;
       private JButton btnquitter;
       private JButton btnreinitialiser ;

		public JButton getBtnreinitialiser() {
		return btnreinitialiser;
	}

	public void setBtnreinitialiser(JButton btnreinitialiser) {
		this.btnreinitialiser = btnreinitialiser;
	}

		public JButton getBtnquitter() {
		return btnquitter;
	}

	public void setBtnquitter(JButton btnquitter) {
		this.btnquitter = btnquitter;
	}

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

public JButton getBoutoncnx() {
	return boutoncnx;
}

public void setBoutoncnx(JButton boutoncnx) {
	this.boutoncnx = boutoncnx;
}


		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						SystemeDeConnexion frame = new SystemeDeConnexion();
						frame.setVisible(true);
						frame.setLocationRelativeTo(null);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		public 	SystemeDeConnexion() {
			setBackground(Color.LIGHT_GRAY);
			setResizable(false);
			
			setTitle("Login system");
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			setBounds(100, 100, 492, 344);
			getContentPane().setLayout(null);
			
			JPanel pnlCNX = new JPanel();
			pnlCNX.setBackground(Color.LIGHT_GRAY);
			pnlCNX.setBounds(0, 0, 552, 330);
			getContentPane().add(pnlCNX);
			pnlCNX.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Systeme De Connexion");
			lblNewLabel.setForeground(new Color(0, 0, 255));
			lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel.setBounds(162, 39, 171, 14);
			JLabel lblNewLabel_2 = new JLabel("Nom et Prenom : ");
			lblNewLabel_2.setForeground(SystemColor.activeCaption);
			lblNewLabel_2.setFont(new Font("Verdana Pro Semibold", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_2.setBounds(94, 110, 152, 14);
			JLabel lblNewLabel_3 = new JLabel("Mot De Passe :");
			lblNewLabel_3.setForeground(SystemColor.activeCaption);
			lblNewLabel_3.setFont(new Font("Verdana Pro Cond Semibold", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_3.setBounds(94, 175, 104, 14);
			NP = new JTextField();
			NP.setToolTipText("veuillez \u00E9crire votre nom d'utilisateur");
			NP.setBounds(259, 110, 86, 20);
			NP.setColumns(10);
			pnlCNX.add(lblNewLabel);
		    btnreinitialiser = new JButton("Réinitialiser");
		    btnreinitialiser.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
			btnreinitialiser.setBackground(SystemColor.activeCaption);
			btnreinitialiser.setForeground(Color.BLACK);
			btnreinitialiser.setBounds(28, 256, 121, 23);
			boutoncnx = new JButton("Connexion");
			boutoncnx.setForeground(Color.BLACK);
			boutoncnx.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
			boutoncnx.setBackground(SystemColor.activeCaption);
			boutoncnx.setBounds(181, 256, 122, 23);
			btnquitter = new JButton("Quitter");
			btnquitter.setForeground(Color.BLACK);
			btnquitter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
			btnquitter.setBackground(SystemColor.activeCaption);
			btnquitter.setBounds(336, 256, 122, 23);
			MDP = new JPasswordField();
			MDP.setToolTipText("veuillez tapez votre mot de passe");
			MDP.setBounds(259, 175, 86, 20);
			
			pnlCNX.add(lblNewLabel_2);
			pnlCNX.add(lblNewLabel_3);	
			pnlCNX.add(NP);
			pnlCNX.add(btnreinitialiser);
			pnlCNX.add(boutoncnx);
			pnlCNX.add(btnquitter);
			pnlCNX.add(MDP);
			
			JLabel lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon(SystemeDeConnexion.class.getResource("/photos/2-1.jpg")));
			lblNewLabel_1.setBounds(0, 0, 487, 319);
			pnlCNX.add(lblNewLabel_1);
								
			MoteurSystemdeconnexion mscnx = new MoteurSystemdeconnexion(this);
			
			btnreinitialiser.addActionListener(mscnx);
			btnquitter.addActionListener(mscnx);
			boutoncnx.addActionListener(mscnx);
	}
}