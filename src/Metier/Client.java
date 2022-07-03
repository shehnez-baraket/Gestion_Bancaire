package Metier;

public class Client {
	private String Nom_prenom;
	private String typedecompte;
	private int CIN;
	   
	public Client(String Nom_prenom, int CIN, String typedecompte) {
		Nom_prenom = this.Nom_prenom;
		CIN = this .CIN;
		typedecompte = this.Nom_prenom ;
		
	}
	
	public String getNom_prenom() {
		return Nom_prenom;
	}

	public int getCIN() {
		return CIN;
	}

	public void setNom(String nom) {
		Nom_prenom = getNom_prenom();
	}

	public void setCIN(int cIN) {
		CIN = cIN;
	}

	public String getTypedecompte() {
		return typedecompte;
	}

	public void setTypedecompte(String typedecompte) {
		this.typedecompte = typedecompte;
	}



	}

