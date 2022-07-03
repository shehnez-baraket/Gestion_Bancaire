package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Dao.DaoClient;

public class Moteurajoutsuppressionclient implements ActionListener {
	private ajoutsuppressiondesclients asc;
	

	public ajoutsuppressiondesclients getAsc() {
		return asc;
	}


	public void setAsc(ajoutsuppressiondesclients asc) {
		this.asc = asc;
	}


	public Moteurajoutsuppressionclient(ajoutsuppressiondesclients asc) {
		this.asc = asc;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		if(arg0.getSource().equals(asc.getBtnNewButton())) {
			String np = asc.getTextField().getText();
			String CIN = asc.getTextField_1().getText();
			String type=asc.getComboBox().getSelectedItem().toString();
			if( CIN.equals("")|| type.equals("")) {
				JOptionPane.showMessageDialog(null,"Veuillez remplir les champs s'il vous plait", "Champs vides", JOptionPane.ERROR_MESSAGE);;
			}else {
			int cin = Integer.parseInt(CIN);
			DaoClient dc = new DaoClient();
			ResultSet rs =dc.RechercherClientCin(cin); 
			try {
				if(rs.next()) {
					if(type.equals(rs.getString(2))){
						JOptionPane.showMessageDialog(null,"Le client existe déja "
						+ "avec le meme type de compte!", "Erreur", JOptionPane.ERROR_MESSAGE);
					}
					else{ 
					
						dc.AjoutClient(np, type, cin);
						JOptionPane.showMessageDialog(null,"Client ajouté, Ce client posséde deux comptes maintenant "
								,"Ajout effectué",JOptionPane.INFORMATION_MESSAGE);
						}
					}
					
				else {
							dc.AjoutClient(np, type, cin);
							JOptionPane.showMessageDialog(null,"Client ajouté "
									,"Ajout effectué",JOptionPane.INFORMATION_MESSAGE);
						}
										
			} catch (Exception e) {
				      e.printStackTrace();
		                             }}
	                                                           }
		if(arg0.getSource().equals(asc.getBtnNewButton_1())) {
			
			String CIN = asc.getTextField_1().getText();
			String type=asc.getComboBox().getSelectedItem().toString();
			if(CIN.equals("")|| type.equals("")) {
				JOptionPane.showMessageDialog(null,"Veuillez remplir les champs s'il vous plait", "Champs vides", JOptionPane.ERROR_MESSAGE);;
			}else {
			int cin = Integer.parseInt(CIN);
			DaoClient dc = new DaoClient();
			ResultSet rs =dc.RechercherClientCin(cin);
			try {
				if(rs.next()) {
					String typedecompte = rs.getString(2);
					if (type.equals(typedecompte)) {
						dc.SupprimerClient(cin,type);
						JOptionPane.showMessageDialog(null,"Le client est supprimé", "Suppression effectuée", JOptionPane.INFORMATION_MESSAGE);
                 }
						
				    else {
				    	JOptionPane.showMessageDialog(null,"Le client que vous avez tapez le numéro"
				         + " de CIN posséde un "+typedecompte+" non pas un "+type+" ! ", "Erreur", JOptionPane.WARNING_MESSAGE);
				    }}
				else 
					JOptionPane.showMessageDialog(null, "L'utilisateur qui possede le numéro de cin"
					+ " "+cin+" n'existe pas","Erreur",JOptionPane.ERROR_MESSAGE);	
					 
		        }catch (Exception e) {
				      e.printStackTrace();}
		                             
			
		}}
		
		
		
		
		

                                                  }	
}
