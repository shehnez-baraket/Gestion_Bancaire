package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Dao.DaoUtilisateur;
import Metier.Utilisateur;

public class Moteursupprimerutilisateur implements ActionListener {
   private SupprimerUtilisateur su ;

public Moteursupprimerutilisateur(SupprimerUtilisateur su) {

	this.su = su;
}


	public SupprimerUtilisateur getSu() {
	return su;
}


public void setSu(SupprimerUtilisateur su) {
	this.su = su;
}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(su.getBtnNewButton())) {
			String nomp = su.getNP().getText();
			@SuppressWarnings("deprecation")
			String mdp = su.getPasswordField().getText();
			Utilisateur u = new Utilisateur(nomp,mdp);
			DaoUtilisateur du = new DaoUtilisateur();
			    if(nomp.equals("")|| mdp.equals("")) {
			 	JOptionPane.showMessageDialog(null,"Veuillez remplir les champs s'il vous plait!", "Champs vides ", JOptionPane.WARNING_MESSAGE);
			                                      
			    }
			    else {
			         if(du.verifexistanceutilisateur(u)) {
			           du.SupprimerUtilisateur(u);
			                                             }
			         else {
				 JOptionPane.showMessageDialog(null, "Utilisateur inexistant dans la base de données", "Erreur", JOptionPane.ERROR_MESSAGE);
				
		}}}
	}

}
