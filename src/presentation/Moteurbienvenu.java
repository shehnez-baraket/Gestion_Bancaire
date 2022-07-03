package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Moteurbienvenu implements ActionListener {
    private Interface2_Bienvenu b ;

	public Moteurbienvenu(Interface2_Bienvenu b) {
		this.b = b;
	}
	

	public Interface2_Bienvenu getB() {
		return b;
	}

	public void setB(Interface2_Bienvenu b) {
		this.b = b;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(b.getMntmNewMenuItem())) {
		       ChangerMDP MDP = new ChangerMDP();
				MDP.setVisible(true); 
	   }	
		if(e.getSource().equals(b.getMntmNewMenuItem_1())) {
			Creerutilisateur nu = new Creerutilisateur();
			nu.setVisible(true);
		}	   
       if(e.getSource().equals(b.getMntmNewMenuItem_2())) {
				SupprimerUtilisateur su = new SupprimerUtilisateur();
				su.setVisible(true);
	   }    
       if(e.getSource().equals(b.getBtnNewButton_3())) {
    	   Ajoutetsuppressiondescomptes asc = new  Ajoutetsuppressiondescomptes();
    	   asc.setVisible(true);
       }
       if(e.getSource().equals(b.getBtnNewButton_5())) {
    	   Consultercomptes cc = new Consultercomptes();
    	   cc.setVisible(true);
       }
       if(e.getSource().equals(b.getBtnNewButton_6())) {
    	   VersementRetrait vr = new VersementRetrait();
    	   vr.setVisible(true);
       }
       if(e.getSource().equals(b.getBtnNewButton_3_1())) {
    	   ajoutsuppressiondesclients asc = new ajoutsuppressiondesclients();
    	   asc.setVisible(true);
       }
     if(e.getSource().equals(b.getBtnNewButton_5_1())) {
    	 affichageetrecherchedesclients arc= new  affichageetrecherchedesclients();
    	 arc.setVisible(true);
       }
     if(e.getSource().equals(b.getBtnNewButton_2())) {
    	int i = JOptionPane.showConfirmDialog(null,"Voulez vous vraiment quitter ?", "Sortie du programme",JOptionPane.YES_NO_OPTION);
    	if (i==0) {
    		b.setVisible(false);
    	}
    	
     }
     if(e.getSource().equals(b.getMntmNewMenuItem_3())) {
 		Affichagedesutilisateurs au= new Affichagedesutilisateurs();
 		au.setVisible(true);
 	}
}
}