package Dao;

import java.sql.Connection;

import java.sql.DriverManager;


public class SingletonConnexion {
	public static Connection connexion;

	
		public SingletonConnexion() {
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionbanquebd","root","");
				System.out.println("connexion établie");
			}
			catch(Exception e) {
				System.out.println("Connexion non établie" +e);
			}
		}

		public static Connection getConnexion() {
			if (connexion == null) {
				new SingletonConnexion();}
			return connexion;
		}


}