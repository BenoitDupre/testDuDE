package cours.bean;

public class Eleve {
	private String nom;
	private String prenom;
	private String adresse;
	private String nele;
	
	public Eleve() {
		;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNele() {
		return nele;
	}
	public void setNele(String nele) {
		this.nele = nele;
	}

	@Override
	public String toString() {
		return "Eleve [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", nele=" + nele + "]";
	}
	
	

}
