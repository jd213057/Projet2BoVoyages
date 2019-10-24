package bovoyages.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="commerciaux")
public class Commerciaux {
	
@Id	
@GeneratedValue (strategy =GenerationType.IDENTITY)
@Column(name="pk_commercial")
private int id;
@Enumerated(EnumType.STRING)
@Column(name="username")
private String username;
@Enumerated(EnumType.STRING)
@Column(name="password")



private String password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Commerciaux(int id, String username, String password) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
}
public Commerciaux(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
	
public Commerciaux() {
	
}
@Override
public String toString() {
	return "Commerciaux [id=" + id + ", username=" + username + ", password=" + password + "]";
}


}
