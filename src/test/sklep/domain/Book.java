package test.sklep.domain;

public class Book extends Product {

	private String ISBN;
	
	public Book(String name, String desc, double price, String newISBN) {
		super(name, desc, price);
		
		ISBN = newISBN;
	}

	public String getType() {
		return "Książka:\t\t";
	}
	
	public String getISBN() {
		return ISBN;
	}
}
