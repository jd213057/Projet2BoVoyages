package bovoyages.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;



@Entity
@Table(name ="voyageurs")
public class Voyageurs implements Serializable {

@Id	
@GeneratedValue (strategy =GenerationType.IDENTITY)
@Column(name="pk_voyageur")
private int id;
@Enumerated(EnumType.STRING)
@Column(name="civilite")	
private String civilite;
@Enumerated(EnumType.STRING)
@Column(name="nom")
private String nom;
@Enumerated(EnumType.STRING)
@Column(name="prenom")
private String prenom;
@Enumerated(EnumType.STRING)
@Column(name="date_naissance")
private Date date_de_naissance;




public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCivilite() {
	return civilite;
}
public void setCivilite(String civilite) {
	this.civilite = civilite;
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
public Date getDate_de_naissance() {
	return date_de_naissance;
}
public void setDate_de_naissance(Date date_de_naissance) {
	this.date_de_naissance = date_de_naissance;
}
public Voyageurs(String civilite, String nom, String prenom) {
	super();
	this.civilite = civilite;
	this.nom = nom;
	this.prenom = prenom;
}
public Voyageurs(int id, String civilite, String nom, String prenom, Date date_de_naissance) {
	super();
	this.id = id;
	this.civilite = civilite;
	this.nom = nom;
	this.prenom = prenom;
	this.date_de_naissance = date_de_naissance;
}	

public Voyageurs() {
	
}
@Override
public String toString() {
	return "Voyageurs [id=" + id + ", civilite=" + civilite + ", nom=" + nom + ", prenom=" + prenom
			+ ", date_de_naissance=" + date_de_naissance + "]";
}



}
