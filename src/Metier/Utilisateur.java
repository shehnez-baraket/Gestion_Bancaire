package Metier;
public class Utilisateur {
private String Nom;
private String MDP;

public Utilisateur(String nom, String mDP) {
	Nom = nom;
	MDP = mDP;
}



public void setNom(String nom) {
	Nom = nom;
}

public void setMDP(String mDP) {
	MDP = mDP;
}

public String getNom() {

	return this.Nom;
}


public String getMDP() {
	
	return this.MDP;
}
}