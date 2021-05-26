package Entities;

public class Book {
	int id;
	String titre,Nom_Auteur,categorie,date_edition;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getNom_Auteur() {
		return Nom_Auteur;
	}
	public void setNom_Auteur(String nom_Auteur) {
		Nom_Auteur = nom_Auteur;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getDate_edition() {
		return date_edition;
	}
	public void setDate_edition(String date_edition) {
		this.date_edition = date_edition;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", titre=" + titre + ", Nom_Auteur=" + Nom_Auteur + ", categorie=" + categorie
				+ ", date_edition=" + date_edition + "]";
	}
	

}
