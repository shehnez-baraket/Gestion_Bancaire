package presentation;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class Interface2_Bienvenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton_2;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_3_1 ;
	private JButton btnNewButton_5_1;
	private JButton btnNewButton_3 ;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_2;
	private JLabel lblNewLabel_2;

	public JButton getBtnNewButton_2() {
		return btnNewButton_2;
	}



	public JButton getBtnNewButton_5() {
		return btnNewButton_5;
	}

	public JButton getBtnNewButton_6() {
		return btnNewButton_6;
	}

	public JButton getBtnNewButton_3_1() {
		return btnNewButton_3_1;
	}
	public JButton getBtnNewButton_5_1() {
		return btnNewButton_5_1;
	}

	public JButton getBtnNewButton_3() {
		return btnNewButton_3;
	}

	public void setBtnNewButton_2(JButton btnNewButton_2) {
		this.btnNewButton_2 = btnNewButton_2;
	}

	public void setBtnNewButton_5(JButton btnNewButton_5) {
		this.btnNewButton_5 = btnNewButton_5;
	}

	public void setBtnNewButton_6(JButton btnNewButton_6) {
		this.btnNewButton_6 = btnNewButton_6;
	}

	public void setBtnNewButton_3_1(JButton btnNewButton_3_1) {
		this.btnNewButton_3_1 = btnNewButton_3_1;
	}



	public void setBtnNewButton_5_1(JButton btnNewButton_5_1) {
		this.btnNewButton_5_1 = btnNewButton_5_1;
	}

	public void setBtnNewButton_3(JButton btnNewButton_3) {
		this.btnNewButton_3 = btnNewButton_3;
	}

	public JMenuItem getMntmNewMenuItem() {
		return mntmNewMenuItem;
	}

	public JMenuItem getMntmNewMenuItem_1() {
		return mntmNewMenuItem_1;
	}

	public JMenuItem getMntmNewMenuItem_2() {
		return mntmNewMenuItem_2;
	}


	public void setMntmNewMenuItem(JMenuItem mntmNewMenuItem) {
		this.mntmNewMenuItem = mntmNewMenuItem;
	}
	public void setMntmNewMenuItem_1(JMenuItem mntmNewMenuItem_1) {
		this.mntmNewMenuItem_1 = mntmNewMenuItem_1;
	}
	public void setMntmNewMenuItem_2(JMenuItem mntmNewMenuItem_2) {
		this.mntmNewMenuItem_2 = mntmNewMenuItem_2;
	}

	public JMenuItem getMntmNewMenuItem_3() {
		return mntmNewMenuItem_3;
	}
	public void setMntmNewMenuItem_3(JMenuItem mntmNewMenuItem_3) {
		this.mntmNewMenuItem_3 = mntmNewMenuItem_3;
	}



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface2_Bienvenu frame = new Interface2_Bienvenu();
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
	public Interface2_Bienvenu() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	
		setResizable(false);
		setTitle("Accueil");
		setBounds(100, 100, 674, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 668, 343);
		contentPane.add(panel);
		panel.setLayout(null);
		Moteurbienvenu mb = new Moteurbienvenu(this);
		
		btnNewButton_2 = new JButton("Quitter");
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 17));
		
		btnNewButton_2.addActionListener(mb); 
		btnNewButton_2.setBounds(286, 280, 104, 23);
		panel.add(btnNewButton_2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 68, 21);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Options");
		mnNewMenu.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("changer le mot de passe");
		
		mntmNewMenuItem.addActionListener(mb);
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("creer un nouvel utilisateur");
		mntmNewMenuItem_1.addActionListener(mb) ;

		mnNewMenu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("supprimer un utilisateur");
		mntmNewMenuItem_2.addActionListener(mb);
		mnNewMenu.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_3 = new JMenuItem("liste des utilisateurs");
	
		mntmNewMenuItem_3.addActionListener(mb) ;

		mnNewMenu.add(mntmNewMenuItem_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(10, 64, 283, 188);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		btnNewButton_3 = new JButton("Ajout / suppression d'un compte");
		
		btnNewButton_3.addActionListener(mb) ;
		btnNewButton_3.setBackground(Color.GRAY);
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_3.setBounds(35, 82, 223, 23);
		panel_1.add(btnNewButton_3);
		
		btnNewButton_5 = new JButton("Consultation et recherche");
		btnNewButton_5.addActionListener(mb); 
		btnNewButton_5.setBackground(Color.GRAY);
		btnNewButton_5.setFont(new Font("Dialog", Font.BOLD, 13));
		btnNewButton_5.setBounds(38, 33, 202, 23);
		panel_1.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("effectuez versement ou retrait");
		btnNewButton_6.addActionListener(mb) ;
		btnNewButton_6.setBackground(Color.GRAY);
		btnNewButton_6.setFont(new Font("Dialog", Font.BOLD, 13));
		btnNewButton_6.setBounds(10, 126, 263, 23);
		panel_1.add(btnNewButton_6);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(SystemColor.inactiveCaption);
		panel_1_1.setBounds(375, 64, 283, 186);
		panel.add(panel_1_1);
		
		btnNewButton_3_1 = new JButton("Ajout / suppression d'un client");
		btnNewButton_3_1.addActionListener(mb); 
		btnNewButton_3_1.setBackground(Color.GRAY);
		btnNewButton_3_1.setFont(new Font("Dialog", Font.BOLD, 13));
		btnNewButton_3_1.setBounds(22, 108, 235, 23);
		btnNewButton_3_1.addActionListener(mb);
		panel_1_1.add(btnNewButton_3_1);
		
		btnNewButton_5_1 = new JButton("Consultation et recherche");
		btnNewButton_5_1.addActionListener(mb); 
		btnNewButton_5_1.setBackground(Color.GRAY);
		btnNewButton_5_1.setFont(new Font("Dialog", Font.BOLD, 13));
		btnNewButton_5_1.setBounds(31, 41, 202, 23);
		panel_1_1.add(btnNewButton_5_1);
		
		JLabel lblNewLabel = new JLabel("Gestion des Comptes");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(23, 32, 222, 40);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gestion Des Clients");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(409, 27, 222, 40);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Interface2_Bienvenu.class.getResource("/photos/img.png")));
		lblNewLabel_2.setBounds(10, 27, 648, 282);
		panel.add(lblNewLabel_2);
	}
}
