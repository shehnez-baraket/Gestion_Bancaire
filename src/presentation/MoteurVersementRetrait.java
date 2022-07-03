package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Dao.DaoCompteCourant;
import Dao.DaoCompteEpargne;


public class MoteurVersementRetrait implements ActionListener {
   private VersementRetrait vr ;
   
	public VersementRetrait getVr() {
	return vr;
}

public void setVr(VersementRetrait vr) {
	this.vr = vr;
}

	/**
 * @param vr
 */
public MoteurVersementRetrait(VersementRetrait vr) {
	this.vr = vr;
}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vr.getBtnversercomptecourant())) {	
			
			
			if((vr.getMontantcomptecourant().getText().equals("") || vr.getCinomptecourant().getText().equals(""))) {
				JOptionPane.showMessageDialog(null, "Veuillez remplir les champs s'il vous plait !", "Champs vides", JOptionPane.ERROR_MESSAGE);
			}	
			else {

			Double m = Double.parseDouble(vr.getMontantcomptecourant().getText());
			int CIN = Integer.parseInt(vr.getCinomptecourant().getText());
			DaoCompteCourant dcc = new 	DaoCompteCourant();
			try {
				ResultSet rs = dcc.recherchercin(CIN);
				if (rs.next()) {	
					Double mt =rs.getDouble(3);
					Double somme = mt+m;
				    dcc.VerserCompteCourant(somme, CIN);
				    JOptionPane.showMessageDialog(null,"Le montant : '"+m+"' est bien versé","Versement réussi", JOptionPane.INFORMATION_MESSAGE);
                               }
				else {
					JOptionPane.showMessageDialog(null, "Le compte ayant ce numéro de cin est inexistant", "Erreur", JOptionPane.ERROR_MESSAGE);
					
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}}}
		
		
		if(e.getSource().equals(vr.getBtnretirercomptecourant())) {
			if (vr.getMontantcomptecourant().getText().contentEquals("")|| vr.getCinomptecourant().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Veuillez remplir les champs s'il vous plait !", "Champs vides", JOptionPane.ERROR_MESSAGE);
			}
			else {
			Double m = Double.parseDouble(vr.getMontantcomptecourant().getText());
			int CIN = Integer.parseInt(vr.getCinomptecourant().getText());
			DaoCompteCourant dcc = new 	DaoCompteCourant();
			ResultSet rs = dcc.recherchercin(CIN);
			try {
				if (rs.next()) {	
					Double mt =rs.getDouble(3);
					Double somme = mt-m;
					if(somme<0) {
						Double res= rs.getInt(5)-(Math.abs(somme));
						if(res>0) {
							 dcc.RetirerCompteCourant(0.0, CIN);
							 dcc.miseajourdecouvert(res, CIN);
							 JOptionPane.showMessageDialog(null, "Le montant "+m+" est retiré (on a utilisé une partie du découvert)",
									 "Retrait réussi", JOptionPane.INFORMATION_MESSAGE);
							      }
						else {
							JOptionPane.showMessageDialog(null,"Le solde est le découvert ne peuvent pas "
									+ "couvrir le montant demandé","Erreur",JOptionPane.ERROR_MESSAGE);
						    }}
					else {
						dcc.RetirerCompteCourant(somme, CIN);
						JOptionPane.showMessageDialog(null, "Le montant "+m+" est retiré",
								"Retrait réussi", JOptionPane.INFORMATION_MESSAGE);
                        }}
				else {
					JOptionPane.showMessageDialog(null,"Le numéro de cin est inéxistant",
							"Erreur", JOptionPane.ERROR_MESSAGE);
					}        
			} catch (Exception e1) {
				e1.printStackTrace();
			} 
			
		}}
		
		
		
		
      if(e.getSource().equals(vr.getBtnversercomptepargne())) {
    	  if(vr.getMontantcompteepargne().getText().equals("")|| vr.getCincompteepargne().getText().equals("")) {
    		  JOptionPane.showMessageDialog(null, "Veuillez remplir les champs s'il vous plait !", "Champs vides", JOptionPane.ERROR_MESSAGE);
    	               }
    	  else {
  			Double m = Double.parseDouble(vr.getMontantcompteepargne().getText());
  			int CIN = Integer.parseInt(vr.getCincompteepargne().getText());
  			DaoCompteEpargne dce = new 	DaoCompteEpargne();
  			try {
  				ResultSet rs = dce.recherchercin(CIN);
  				if (rs.next()) {	
  					Double mt =rs.getDouble(3);
  					Double somme = mt+m;
  				    dce.VerserCompteEpargne(somme, CIN);
  				    JOptionPane.showMessageDialog(null,"Le montant : '"+m+"' est bien versé","Versement réussi", JOptionPane.INFORMATION_MESSAGE);
                                 }
  				else {
  					JOptionPane.showMessageDialog(null, "Le compte ayant ce numéro de cin est inexistant", "Erreur", JOptionPane.ERROR_MESSAGE);
  					
  				}
  			} catch (SQLException e1) {
  				e1.printStackTrace();
  			}}}
      
      
      if(e.getSource().equals(vr.getBtnretirercompteepargne())){

		if (vr.getMontantcompteepargne().getText().equals("")|| vr.getCincompteepargne().getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Veuillez remplir les champs s'il vous plait !", "Champs vides", JOptionPane.ERROR_MESSAGE);
		}
		else {
		Double m = Double.parseDouble(vr.getMontantcompteepargne().getText());
		int CIN = Integer.parseInt(vr.getCincompteepargne().getText());
		DaoCompteEpargne dce = new 	DaoCompteEpargne();
		ResultSet rs = dce.recherchercin(CIN);
		try {
			if (rs.next()) {	
				Double mt =rs.getDouble(3);
				Double somme = mt-m;
				if(somme<0) {
					Double res= rs.getInt(5)-(Math.abs(somme));
					if(res>0) {
						 dce.RetirerCompteEpargne(0.0, CIN);
						 JOptionPane.showMessageDialog(null, "Le montant "+m+" est retiré (on a utilisé une partie du découvert)",
								 "Retrait réussi", JOptionPane.INFORMATION_MESSAGE);
						      }
					else {
						JOptionPane.showMessageDialog(null,"Le solde est le découvert ne peuvent pas "
								+ "couvrir le montant demandé","Erreur",JOptionPane.ERROR_MESSAGE);
					    }}
				else {
					dce.RetirerCompteEpargne(somme, CIN);
					JOptionPane.showMessageDialog(null, "Le montant "+m+" est retiré",
							"Retrait réussi", JOptionPane.INFORMATION_MESSAGE);
                    }}
			else {
				JOptionPane.showMessageDialog(null,"Le numéro de cin est inéxistant",
						"Erreur", JOptionPane.ERROR_MESSAGE);
				}        
		} catch (Exception e1) {
			e1.printStackTrace();
		} 
		
	}}

}
}
