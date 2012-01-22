package sklep.project;

import java.util.*;

import javax.validation.constraints.Size;

public class Person {

	String name;
	List<Product> listOfProducts = new ArrayList<Product>();
	Date dateOfBirth = new Date();

	public Person(String name) {
		this.name = name;
		this.listOfProducts = new ArrayList<Product>();
		this.dateOfBirth = dateOfBirth;
	}
	
	@Size(min = 1)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getListOfProducts() {
		return listOfProducts;
	}

	public void setListOfGame(List<Product> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	


}
