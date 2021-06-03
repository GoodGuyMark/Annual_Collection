package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "Annual")
@Table(name = "Annual")
@XmlRootElement
public class Annual {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String publisher;
	private String years_owned;
	private String years_unpublished;
	private String years_missing;
	private String image;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getYears_owned() {
		return years_owned;
	}
	public void setYears_owned(String years_owned) {
		this.years_owned = years_owned;
	}
	public String getYears_unpublished() {
		return years_unpublished;
	}
	public void setYears_unpublished(String years_unpublished) {
		this.years_unpublished = years_unpublished;
	}
	public String getYears_missing() {
		return years_missing;
	}
	public void setYears_missing(String years_missing) {
		this.years_missing = years_missing;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}
