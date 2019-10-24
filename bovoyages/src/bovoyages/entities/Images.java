package bovoyages.entities;



import java.io.Serializable;
import javax.persistence.*;

public class Images implements Serializable {
	
	
	
@Enumerated(EnumType.STRING)
@Column(name="prenom")	
private String images;
@ManyToOne
private Destinations destination;


public String getImages() {
	return images;
}
public void setImages(String images) {
	this.images = images;
}
public Destinations getDestination() {
	return destination;
}
public void setDestination(Destinations destination) {
	this.destination = destination;
}
public Images(String images) {
	super();
	this.images = images;
}
public Images(String images, Destinations destination) {
	super();
	this.images = images;
	this.destination = destination;
}
public Images() {
	
}

@Override
public String toString() {
	return "Images [images=" + images + ", destination=" + destination + "]";
}



}
