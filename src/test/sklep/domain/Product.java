package test.sklep.domain;

public abstract class Product {
	private String name;
	
	private String desc;
	
	private double price;
	
	public Product(String name, String desc, double price) {
		this.name = name;
		this.desc = desc;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.getType() + " " + name.toUpperCase() + ", " + desc + " za " + price + " PLN";
	}
	
	public abstract String getType();

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
