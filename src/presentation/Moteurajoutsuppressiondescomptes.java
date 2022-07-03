package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Dao.DaoClient;
import Dao.DaoCompteCourant;
import Dao.DaoCompteEpargne;

public class Moteurajoutsuppressiondescomptes implements ActionListener {
    private Ajoutetsuppressiondescomptes asc;
    

	public Ajoutetsuppressiondescomptes getAsc() {
		return asc;
	}

	public void setAsc(Ajoutetsuppressiondescomptes asc) {
		this.asc = asc;
	}

	public Moteurajoutsuppressiondescomptes(Ajoutetsuppressiondescomptes asc) {
		super();
		this.asc = asc;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(asc.getBtnNewButton())) {
			String CIN = asc.getTextField().getText();
			String d = asc.getTextField_1().getText();
			String nomprenom = asc.getTextField_3().getText();
			String solde= asc.getTextField_4().getText();
			if(CIN.equals("")||d.equals("")|| nomprenom.equals("")|| solde .equals("")){
				JOptionPane.showMessageDialog(null, "Veuillez remlpir les champs s'il vous plait!", "Champs vides", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
			Double s = Double.parseDouble(solde);
			Double dm = Double.parseDouble(d);
			int cin = Integer.parseInt(CIN);
			
			DaoClient dc = new DaoClient();
			ResultSet rs=dc.RechercherClientCin(cin);
			try {
				if(rs.next()) {
					DaoCompteCourant dcc = new DaoCompteCourant();
					ResultSet rs1 = dcc.recherchercin(cin);
					if(rs1.next()) {
						JOptionPane.showMessageDialog(null,"L'utilisateur dispose d'un compte courant déja !"
						, "Erreur", JOptionPane.ERROR_MESSAGE);						
					               }
					else {
						String np = rs.getString(1);
					    dcc.AjoutCompteCourant(np,s, cin, dm);
					    JOptionPane.showConfirmDialog(null, "Compte courant crée"
					    , "Succés", JOptionPane.PLAIN_MESSAGE);
					
				         }}
				else  JOptionPane.showMessageDialog(null, "Veuillez créer un client puis l'associer à un compte !", "Client introuvable dans la base de donnée", JOptionPane.ERROR_MESSAGE);
			
			} catch (SQLException e1) {
               System.out.println(e1);
			}asc.getTextField().setText("");
			asc.getTextField_1().setText("");
			asc.getTextField_3().setText("");
			asc.getTextField_4().setText("0");}}
	      
		
		
		
		if(e.getSource().equals(asc.getBtnNewButton_1())) {
			String CIN1 = asc.getTextField().getText();
			if(CIN1.equals("")){
				JOptionPane.showMessageDialog(null, "Veuillez remlpir le champ CIN s'il vous plait!", "Champ vide", JOptionPane.INFORMATION_MESSAGE);
			                  }
			else {
			
			int cin1 = Integer.parseInt(CIN1);
			DaoClient dc = new DaoClient();
			ResultSet rs=dc.RechercherClientCin(cin1);
			try {
				if(rs.next()) {
					DaoCompteCourant dcc = new DaoCompteCourant();
					ResultSet rs1=dcc.recherchercin(cin1);
					if(rs1.next()) {
						dcc.SupprimerComptecourant(cin1);
						JOptionPane.showMessageDialog(null,"Le compte est bien supprimé !", "Suppression", JOptionPane.INFORMATION_MESSAGE);
					               }
					else {
					
					JOptionPane.showConfirmDialog(null, "Compte inéxistant déja", "Erreur", JOptionPane.ERROR_MESSAGE);
				         }     }
				else JOptionPane.showMessageDialog(null, "Vous devez supprimer un utilisateur qui existe déja ", "Client introuvable dans la base de donnée", JOptionPane.ERROR_MESSAGE);
				
			   } catch (SQLException e1) {
               System.out.println(e1);
			                             }
			asc.getTextField().setText("");
			asc.getTextField_1().setText("");
			asc.getTextField_3().setText("");
			asc.getTextField_4().setText("0");
			  }
		                                              }
			
			                                             
		if(e.getSource().equals(asc.getBtnNewButton_3())) {
			String CIN = asc.getTextField_2().getText();
			
			if(CIN.equals("")) {
				JOptionPane.showMessageDialog(null, "Veuillez remlpir le champ CIN s'il vous plait!", "Champ vide", JOptionPane.INFORMATION_MESSAGE);	
			}
			else {
				int cin = Integer.parseInt(CIN);
				
				DaoClient dc = new DaoClient();
				ResultSet rs=dc.RechercherClientCin(cin);
				try {
						if(rs.next()) {
							DaoCompteEpargne dce = new DaoCompteEpargne();
							ResultSet rs1=dce.recherchercin(cin);
							if(rs1.next()) {
								dce.SupprimerCompteepargne(cin);
								JOptionPane.showMessageDialog(null,"Le compte est bien supprimé !", "Suppression", JOptionPane.INFORMATION_MESSAGE);	
								
							               }
							else {
							
							JOptionPane.showConfirmDialog(null, "Compte inéxistant déja", "Erreur", JOptionPane.ERROR_MESSAGE);
							
						}}
						else JOptionPane.showMessageDialog(null, "Vous devez supprimer un utilisateur qui existe déja ", "Client introuvable dans la base de donnée", JOptionPane.ERROR_MESSAGE);
					
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}asc.getTextField_2().setText("");
					asc.getTextField_5().setText("");
					asc.getTextField_6().setText("0");
					asc.getComboBox().setSelectedIndex(0);

			
			
			
		}}
		
		if(e.getSource().equals(asc.getBtnNewButton_2())) {
			String CIN = asc.getTextField_2().getText();
			String np = asc.getTextField_5().getText();
			String solde = asc.getTextField_6().getText();		
			int TI = asc.getComboBox().getSelectedIndex();
			if(CIN.equals("")|| np.equals("")|| solde.equals("")) {
				JOptionPane.showMessageDialog(null, "Veuillez remlpir les champs s'il vous plait!", "Champs vides", JOptionPane.INFORMATION_MESSAGE);	
			}
			else {
				int cin = Integer.parseInt(CIN);
				Double s = Double.parseDouble(solde);
				DaoClient dc = new DaoClient();
				ResultSet rs=dc.RechercherClientCin(cin);
			try {
				if(rs.next()) {
					DaoCompteEpargne dce = new DaoCompteEpargne();
					ResultSet rs1=dce.recherchercin(cin);
					if(rs1.next()) {
						JOptionPane.showMessageDialog(null,"L'utilisateur dispose d'un compte d'épargne déja !", "Erreur", JOptionPane.ERROR_MESSAGE);
					}
					
						else {
							dce.AjoutComptEpargne(np,cin, s,TI);
						    JOptionPane.showConfirmDialog(null, "Compte épargne crée"
						    , "Succés", JOptionPane.PLAIN_MESSAGE);
						
					         }}
					
				else JOptionPane.showMessageDialog(null, "Veuillez créer un client puis l'associer à un compte !", "Client introuvable dans la base de donnée", JOptionPane.ERROR_MESSAGE);
				
			} catch (SQLException e1) {
				
               System.out.println(e1);
			}
			asc.getTextField_2().setText("");
			asc.getTextField_5().setText("");
			asc.getTextField_6().setText("0");
			}}
	}
}