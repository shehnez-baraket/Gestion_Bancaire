package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VersementRetrait extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cincompteepargne;
	private JTextField montantcompteepargne;
	private JTextField cinomptecourant;
	private JTextField montantcomptecourant;
	private JButton btnversercomptepargne;
	private JButton btnretirercompteepargne;
    private JButton btnversercomptecourant ;
    private JButton btnretirercomptecourant;
    
    
	public JTextField getCincompteepargne() {
		return cincompteepargne;
	}

	public JTextField getMontantcompteepargne() {
		return montantcompteepargne;
	}

	public JTextField getCinomptecourant() {
		return cinomptecourant;
	}

	public JTextField getMontantcomptecourant() {
		return montantcomptecourant;
	}

	public JButton getBtnversercomptepargne() {
		return btnversercomptepargne;
	}

	public JButton getBtnretirercompteepargne() {
		return btnretirercompteepargne;
	}

	public JButton getBtnversercomptecourant() {
		return btnversercomptecourant;
	}

	public JButton getBtnretirercomptecourant() {
		return btnretirercomptecourant;
	}

	public void setCincompteepargne(JTextField cincompteepargne) {
		this.cincompteepargne = cincompteepargne;
	}

	public void setMontantcompteepargne(JTextField montantcompteepargne) {
		this.montantcompteepargne = montantcompteepargne;
	}

	public void setCinomptecourant(JTextField cinomptecourant) {
		this.cinomptecourant = cinomptecourant;
	}

	public void setMontantcomptecourant(JTextField montantcomptecourant) {
		this.montantcomptecourant = montantcomptecourant;
	}

	public void setBtnversercomptepargne(JButton btnversercomptepargne) {
		this.btnversercomptepargne = btnversercomptepargne;
	}

	public void setBtnretirercompteepargne(JButton btnretirercompteepargne) {
		this.btnretirercompteepargne = btnretirercompteepargne;
	}

	public void setBtnversercomptecourant(JButton btnversercomptecourant) {
		this.btnversercomptecourant = btnversercomptecourant;
	}

	public void setBtnretirercomptecourant(JButton btnretirercomptecourant) {
		this.btnretirercomptecourant = btnretirercomptecourant;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VersementRetrait frame = new VersementRetrait();
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
	public VersementRetrait() {
		setTitle("Versement et Retrait");
		MoteurVersementRetrait Mvr = new MoteurVersementRetrait(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 414, 239);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Comptes courants", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("CIN :");
		lblNewLabel_2.setBounds(63, 33, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		cinomptecourant = new JTextField();
		cinomptecourant.setColumns(10);
		cinomptecourant.setBounds(219, 30, 126, 20);
		panel_1.add(cinomptecourant);
		
		JLabel lblNewLabel_1_1 = new JLabel("Montant à verser ou à retirer :");
		lblNewLabel_1_1.setBounds(33, 91, 180, 14);
		panel_1.add(lblNewLabel_1_1);
		
		montantcomptecourant = new JTextField();
		montantcomptecourant.setColumns(10);
		montantcomptecourant.setBounds(219, 88, 126, 20);
		panel_1.add(montantcomptecourant);
		
		btnversercomptecourant = new JButton("Verser");
		btnversercomptecourant.addActionListener(Mvr); 
		btnversercomptecourant.setBounds(130, 135, 116, 23);
		panel_1.add(btnversercomptecourant);
		
		btnretirercomptecourant = new JButton("Retirer");
		btnretirercomptecourant.addActionListener(Mvr); 
		btnretirercomptecourant.setBounds(130, 177, 116, 23);
		panel_1.add(btnretirercomptecourant);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Comptes d'épargne", null, panel, null);
		panel.setLayout(null);
		
		cincompteepargne = new JTextField();
		cincompteepargne.setBounds(195, 24, 128, 20);
		panel.add(cincompteepargne);
		cincompteepargne.setColumns(10);
		
		montantcompteepargne = new JTextField();
		montantcompteepargne.setBounds(195, 78, 128, 20);
		panel.add(montantcompteepargne);
		montantcompteepargne.setColumns(10);
		
		btnversercomptepargne = new JButton("Verser");
		btnversercomptepargne.addActionListener(Mvr); 
		btnversercomptepargne.setBounds(118, 127, 116, 23);
		panel.add(btnversercomptepargne);
		
		JLabel lblNewLabel = new JLabel("CIN :");
		lblNewLabel.setBounds(62, 27, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Montant à verser ou à retirer :");
		lblNewLabel_1.setBounds(27, 81, 197, 14);
		panel.add(lblNewLabel_1);
		
		btnretirercompteepargne = new JButton("Retirer");
		btnretirercompteepargne.addActionListener(Mvr);
		btnretirercompteepargne.setBounds(118, 164, 116, 23);
		panel.add(btnretirercompteepargne);
	}
}
