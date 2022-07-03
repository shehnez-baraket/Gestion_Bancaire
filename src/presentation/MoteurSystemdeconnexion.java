package presentation;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import Dao.DaoUtilisateur;
import Metier.Utilisateur;

public class MoteurSystemdeconnexion implements ActionListener {
	private SystemeDeConnexion scnx ;

	public MoteurSystemdeconnexion(SystemeDeConnexion scnx) {
	
		this.scnx = scnx;
	}
	public SystemeDeConnexion getScnx() {
		return scnx;
	}
	public void setScnx(SystemeDeConnexion scnx) {
		this.scnx = scnx;
	}
	@SuppressWarnings({ "deprecation" })
	@Override
	public void actionPerformed(ActionEvent arg0) { 
   
     if(arg0.getSource().equals(scnx.getBoutoncnx())) {
    	
			 if(scnx.getNP().getText().equals("")||scnx.getMDP().getText().equals("")) {
				 JOptionPane.showMessageDialog(null, "Veuillez remplir les champs s'il vous plait !", "Champs vides",JOptionPane.WARNING_MESSAGE);
			 }
			 else {
			 Utilisateur u = new Utilisateur (scnx.getNP().getText(), scnx.getMDP().getText());
			 DaoUtilisateur du = new DaoUtilisateur ();
			 du.VerifCnx(u);
		}}
    
 
     if(arg0.getSource().equals(scnx.getBtnquitter())) {
    	 
       if( JOptionPane.showConfirmDialog(null, "Voulez vous vraiment quitter ?", "Quitter le system", JOptionPane.YES_NO_CANCEL_OPTION)==0) 
	   System.exit(0);                   
                                                       }
    
     if(arg0.getSource().equals(scnx.getBtnreinitialiser())) {
    	scnx.getNP().setText("");
    	scnx.getMDP().setText("");
    }
	}
	

}
