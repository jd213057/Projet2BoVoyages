package bovoyages.entities;

import java.io.Serializable;


import javax.persistence.*;


@Entity
@Table(name ="clients")
public class Clients implements Serializable {
	
	

@Id	
@GeneratedValue (strategy =GenerationType.IDENTITY)
@Column(name="pk_client")
private int id;	
	
@Enumerated(EnumType.STRING)
@Column(name="nom")
private String nom;


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public Clients(int id, String nom) {
	super();
	this.id = id;
	this.nom = nom;
}

public Clients(String nom) {
	super();
	this.nom = nom;
}

public Clients() {
	
}

@Override
public String toString() {
	return "Clients [id=" + id + ", nom=" + nom + "]";
}



}
