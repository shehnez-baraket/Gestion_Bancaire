package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DaoCompteEpargne {
	private Statement stat;
	private Connection connexion;
	public DaoCompteEpargne() {
		connexion = SingletonConnexion.getConnexion() ;
		try {
			stat = connexion.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

	public void AjoutComptEpargne(String nomprenom ,int CIN ,double solde , int taux ) {
		
		String sql1=" insert into compte_epargne (Nom_prenom , Solde , CIN  ,Tauxinteret ) values('"+nomprenom+"','"+solde+"', '"+CIN+"', '"+taux+"');";
		 try {	stat.executeUpdate(sql1);
			} catch (SQLException e) {
				e.printStackTrace();
			                         }    
		                                                        }	
	


	public ResultSet recherchercin(int cin) {
		String sql ="select * from compte_epargne where CIN='"+cin+"'";
		ResultSet result=null;
		try {
			result = stat.executeQuery(sql);
			}
		catch (SQLException e) {
			
			e.printStackTrace();
		} 
		return result;
	}
	public ResultSet afficherResultat(){
		String query="select * from Compte_epargne";
		ResultSet result=null;
		try {
			result = stat.executeQuery(query);
			}
		catch (SQLException e) {
			e.printStackTrace();
		} 
		return result;
	}
	public ResultSet afficherResultatRecherche(String nom){
		String query="select * from Compte_epargne WHERE Nom_prenom = '"+nom+"';";
		ResultSet result=null;
		try {
			result = stat.executeQuery(query);
			}
		catch (SQLException e) {
			e.printStackTrace();
		} 
		return result;
	}
	public void SupprimerCompteepargne(int cin) {
		String requetesql = "delete from compte_epargne where CIN = '"+cin+"'";
		try {
			stat.executeUpdate(requetesql);
		} catch (SQLException e) {
		System.out.println(e);
		}
		
	}
	public void VerserCompteEpargne(Double Montant, int Cin) {
		String sql = "UPDATE compte_epargne SET Solde='"+Montant+"' WHERE CIN = '"+Cin+"';";
		try {
			stat.executeUpdate(sql);			
		} catch (SQLException e) {			
			e.printStackTrace();
		}			
}
	
	
	public void RetirerCompteEpargne(Double Montant, int Cin) {
		String sql = "UPDATE compte_epargne SET Solde='"+Montant+"' WHERE CIN = '"+Cin+"';";
		try {
			stat.executeUpdate(sql);
			} catch (SQLException e) {
						e.printStackTrace();
			}		 
            }

}

