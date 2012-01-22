package sklep.project;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {

	public String name;
	public AlcType alcType;
	public int releaseYear;
	public int price;
	
	public String alcTypeString;

	public Product(String name, AlcType alcType, int releaseYear, int price) {
		this.name = name;
		this.alcType = alcType;
		this.releaseYear = releaseYear;
		this.price = price;

		this.alcTypeString = alcTypeString;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AlcType getAlcType() {
		return alcType;
	}

	public void setAlcType(AlcType alcType) {
		this.alcType = alcType;
	}

	@Min(1950)
	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Min(0)
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public String getAlcTypeString() {
		return alcTypeString;
	}

	public void setAlcTypeString(String alcTypeString) {
		this.alcTypeString = alcTypeString;
	}

}
