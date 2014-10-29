package test.sklep.domain;

public class MovieCD extends CD {
	private Sound sound;

	public MovieCD(String name, String desc, double price, int length,
			Sound sound) {
		super(name, desc, price, length);
		this.sound = sound;
	}

	public Sound getSound() {
		return sound;
	}

	public String getType() {
		return "Płyta z filmem:\t";
	}
}
