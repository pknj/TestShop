package test.sklep.domain;

public abstract class CD extends Product {

	private int length;
	//konstruktor podstawowy (4 arg)
	public CD(String name, String desc, double price, int length) {
		super(name, desc, price);

		this.length = length;
	}
	// konstruktor 3 arg, który domyœlnie okreœla length = 60
	public CD(String name, String desc, double price) {
		this(name, desc, price, 60);
	}

	public int getLength() {
		return length;
	}
	
	
}
