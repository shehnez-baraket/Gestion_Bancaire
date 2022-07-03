package Dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoCompteCourant {
	private Statement stat;
	private Connection connexion;
	public DaoCompteCourant() {
		connexion = SingletonConnexion.getConnexion() ;
		try {
			stat = connexion.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

public ResultSet afficherResultat(){
		String query="select * from Compte_courant";
		ResultSet result=null;
		try {
			result = stat.executeQuery(query);
			}
		catch (SQLException e) {
			e.printStackTrace();
		} 
		return result;
	}


public void AjoutCompteCourant(String nomprenom, Double solde ,int CIN , double dm ) {
	
	String sql1=" insert into compte_courant (Nom_prenom , Solde , CIN  ,DecouvertMax )"
			+ " values('"+nomprenom+"','"+solde+"', '"+CIN+"', '"+dm+"');";
	 try {	stat.executeUpdate(sql1);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

public void SupprimerComptecourant(int cin ) {
	String requetesql = "delete from compte_courant where CIN = '"+cin+"'";
	try {
		stat.executeUpdate(requetesql);
	} catch (SQLException e) {
	System.out.println(e);
	}
	
}

public ResultSet rechercher(String nom) {
	String sql ="select * from compte_courant where Nom_prenom='"+nom+"';";
	ResultSet rs = null;
	try { 
		 rs = stat.executeQuery(sql);
		}
	catch (SQLException e) {
		
		e.printStackTrace();
	} 
	return rs;
}

public ResultSet recherchercin(int cin) {
	String sql ="select * from compte_courant where CIN='"+cin+"'";
	ResultSet result=null;
	try {
		result = stat.executeQuery(sql);
		
		}
	catch (SQLException e) {
		
		e.printStackTrace();
	} 
	return result;
}

public void VerserCompteCourant(double Montant, int Cin) {
			String sql = "UPDATE compte_courant SET Solde='"+Montant+"' WHERE CIN = '"+Cin+"';";
			try {
				stat.executeUpdate(sql);			
			} catch (SQLException e) {			
				e.printStackTrace();
			}			
}


public void RetirerCompteCourant(Double Montant, int Cin) {
String sql = "UPDATE compte_courant SET Solde='"+Montant+"' WHERE CIN = '"+Cin+"';";
		try {
			stat.executeUpdate(sql);
			} catch (SQLException e) {
						e.printStackTrace();
			}		 
            }

public void miseajourdecouvert(Double res , int CIN)	{
	String sql = "UPDATE compte_courant SET DecouvertMax ='"+res+"' WHERE CIN = '"+CIN+"';";
	try {
		stat.executeUpdate(sql);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}
		
}