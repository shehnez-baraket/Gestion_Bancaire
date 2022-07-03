package Dao;

import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Metier.Utilisateur;
import presentation.Interface2_Bienvenu;


public class DaoUtilisateur {
	private Statement stat;
	private Connection connexion;
	public DaoUtilisateur() {
		
		connexion = SingletonConnexion.getConnexion();
		try {
			stat = connexion.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
		
	
	public void AjoutUtilisateur(Utilisateur u ) {
		String requetesql = "insert into utilisateur (Nom,Mot_De_Passe) "
				+ "values('"+u.getNom()+"', '"+u.getMDP()+"')";
		try {
			stat.executeUpdate(requetesql);
			JOptionPane.showMessageDialog(null,"Ajout effectué","Succé", JOptionPane.OK_OPTION);
		} catch (Exception e) {
		System.out.println(e);
		}
		
	}
	public void SupprimerUtilisateur(Utilisateur u ) {
		String requetesql = "delete from utilisateur where '"+u.getNom()+"'= Nom and '"+u.getMDP()+"'= Mot_de_passe";
		try {
			stat.executeUpdate(requetesql);
			JOptionPane.showMessageDialog(null, "Utilisateur supprimé", "Succés", JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e) {
		System.out.println(e);
		JOptionPane.showMessageDialog(null, "Utilisateur inexistant dans la base de données", "Echec",JOptionPane.ERROR_MESSAGE);
		}
		
		
	}
	 
public void VerifCnx(Utilisateur u) {
    String sql = "SELECT * From utilisateur WHERE Mot_de_passe = '"+u.getMDP()+"' AND Nom = '"+u.getNom()+"';";
    try {
    	
		ResultSet rs = stat.executeQuery(sql);
		if(rs.next()) {
			Interface2_Bienvenu b = new Interface2_Bienvenu();
			b.setVisible(true);
		}
		else {
			JOptionPane.showMessageDialog(null,"veuillez vérifiez les données saisies", "Erreur", JOptionPane.WARNING_MESSAGE);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
    
    
}
public void ChangerMDP(Utilisateur u) {

	try {
		    String sql = "UPDATE utilisateur set Mot_de_passe='"+u.getMDP()+"' WHERE Nom='"+u.getNom()+"';";
			int rs = stat.executeUpdate(sql);
			if(rs==0) {
				JOptionPane.showMessageDialog(null, "Utilisateur inexistant dans la base de donnée","Erreur", JOptionPane.ERROR_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "Changement du mot de passe effectué", "Succés", JOptionPane.INFORMATION_MESSAGE);
			}

	} catch (SQLException e) {
		System.out.println("erreur" + e);
	}
	
}
public boolean verifexistanceutilisateur(Utilisateur u ) {
	boolean verif=false;
	String sql = "SELECT * FROM utilisateur WHERE Nom = '"+u.getNom()+"' AND Mot_de_passe = '"+u.getMDP()+"'; ";
		
		try {
			ResultSet rs = stat.executeQuery(sql);
			if(rs.next()) {
				verif= true ;
			              }
		    } catch (SQLException e) {           }	
		
	return verif ;
}
public ResultSet rechercher(String nom) {
	String sql ="select Nom from utilisateur where Nom='"+nom+"';";
	ResultSet rs = null;
	try { 
		 rs = stat.executeQuery(sql);
		}
	catch (SQLException e) {
		
		e.printStackTrace();
	} 
	return rs;
}
public ResultSet afficherResultat(){
	String query="select Nom from utilisateur";
	ResultSet result=null;
	try {
		result = stat.executeQuery(query);
		}
	catch (SQLException e) {
		e.printStackTrace();
	} 
	return result;
}

}
	
	