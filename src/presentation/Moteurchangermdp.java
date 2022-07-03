package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Dao.DaoUtilisateur;
import Metier.Utilisateur;

public class Moteurchangermdp implements ActionListener {

	private ChangerMDP mdp;

	public Moteurchangermdp(ChangerMDP mdp) {

		this.mdp = mdp;
	}



	public ChangerMDP getMdp() {
		return mdp;
	}

	public void setMdp(ChangerMDP mdp) {
		this.mdp = mdp;
	}

	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(mdp.getBtnvalider())) {
			if(mdp.getNP().getText().equals("")|| mdp.getMDP().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Veuillez remplir les champs vides s'il vous plait !","Champs vides" ,JOptionPane.WARNING_MESSAGE);
			}
			else {
			Utilisateur u = new Utilisateur (mdp.getNP().getText(), mdp.getMDP().getText());
			DaoUtilisateur du = new DaoUtilisateur();
			du.ChangerMDP(u);}
		
		                                                 }
	

	}

}
