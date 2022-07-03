package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Dao.DaoUtilisateur;
import Metier.Utilisateur;

public class Moteurcreerutilisateur implements ActionListener {
	private Creerutilisateur nu ;
     

	public Moteurcreerutilisateur(Creerutilisateur nu) {
		this.nu = nu;
	}

	public Creerutilisateur getNu() {
		return nu;
	}

	public void setNu(Creerutilisateur nu) {
		this.nu = nu;
	}
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(nu.getBtnvalider())) {
		    String nomp= nu.getNP().getText();
		    String mdp = nu.getMDP().getText();
		    if(nomp.equals("")|| mdp.equals("")) {
		    	JOptionPane.showMessageDialog(null,"Veuillez remplir les champs s'il vous plait !","Champs vides", JOptionPane.WARNING_MESSAGE);
		    }
		    else {
		    Utilisateur u = new Utilisateur(nomp,mdp);
		    DaoUtilisateur du = new DaoUtilisateur();
		    du.AjoutUtilisateur(u);}
		    
            
	}
	}
}
