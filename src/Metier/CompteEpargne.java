package Metier;

public class CompteEpargne {
private String NomPrenom;
private Double Solde;
private int CIN;
private int TauxInteret;

public CompteEpargne(String nomPrenom, Double solde, int cIN, int tauxInteret) {
	
	NomPrenom = nomPrenom;
	Solde = solde;
	CIN = cIN;
	TauxInteret = tauxInteret;
}
       
public int getTauxInteret() {
	return TauxInteret;
}

public void setTauxInteret(int tauxInteret) {
	TauxInteret = tauxInteret;
}


public String getNomPrenom() {
	return NomPrenom;
}


public Double getSolde() {
	return Solde;
}


public int getCIN() {
	return CIN;
}


public void setNomPrenom(String nomPrenom) {
	NomPrenom = nomPrenom;
}


public void setSolde(Double solde) {
	Solde = solde;
}


public void setCIN(int cIN) {
	CIN = cIN;
}


}

