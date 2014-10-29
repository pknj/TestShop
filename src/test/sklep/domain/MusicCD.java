package test.sklep.domain;

public class MusicCD extends CD {

	public MusicCD(String name, String desc, double price, int length) {
		super(name, desc, price, length);
	}

	@Override
	public String getType() {
		return "Płyta z muzyką:\t";
	}

}
