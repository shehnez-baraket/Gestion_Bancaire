package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoClient {
	private Statement stat;
	private Connection connexion;
	public DaoClient() {
		connexion = SingletonConnexion.getConnexion() ;
		try {
			stat = connexion.createStatement();
		} catch (SQLException e) {
			System.out.println("echec de connexion");
		}
		
	}
	public void AjoutClient(String nomp, String type , int cin) {
		
		String requetesql ="INSERT INTO `client` (`Nom_prenom`, `Compte`, `CIN`) VALUES ('"+nomp+"', '"+type+"','"+ cin+"');";
		try {
			stat.executeUpdate(requetesql);
		} catch (Exception e) {
		System.out.println(e);
		}
		
	}
	public void SupprimerClient(int cin, String type  ) {
		String requetesql = "delete from client where CIN = '"+cin+"' and Compte = '"+type+"';";
		try {
			stat.executeUpdate(requetesql);
		} catch (SQLException e) {
		System.out.println(e);
		}
		
	}

public ResultSet RechercherClientCin(int CIN) {
	String sql = "SELECT * FROM client where CIN ='"+CIN+"';";
	ResultSet result = null;
	try {
		 result = stat.executeQuery(sql);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return result;	
}
	public boolean Verifexistanceclient(int CIN ) {
		boolean bol = false ;
		String sql = "SELECT * FROM client WHERE CIN = '"+CIN+"';";
		 try {
	        	ResultSet rs = stat.executeQuery(sql);
				if(rs.next()) 
					bol = true;
			} catch (SQLException e) {
				e.printStackTrace();}
		return bol; }
	
	
	
	public ResultSet afficherResultat(){
		String query="select * from Client";
		ResultSet result=null;
		try {
			result = stat.executeQuery(query);
			}
		catch (SQLException e) {
			e.printStackTrace();
		} 
		return result;
	}
	public ResultSet rechercher(String nom) {
		String sql ="select * from client where Nom_prenom='"+nom+"';";
		ResultSet rs = null;
		try { 
			 rs = stat.executeQuery(sql);
			}
		catch (SQLException e) {
			
			e.printStackTrace();
		} 
		return rs;
	}

}