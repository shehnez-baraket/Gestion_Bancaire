package Metier;


public class CompteCourant {

private String NomPrenom;
private Double Solde;
private int CIN;
private Double DecouvertMax;

public CompteCourant(String nomPrenom, Double solde, int cIN ,Double decouvertMax) {
	
	NomPrenom = nomPrenom;
	Solde = solde;
	CIN = cIN;
	DecouvertMax = decouvertMax;
	
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

public Double getDecouvertMax() {
	return DecouvertMax;
}

public void setDecouvertMax(Double decouvertMax) {
	DecouvertMax = decouvertMax;
}
	
	
}
