package test.sklep.service;

import java.util.ArrayList;
import java.util.List;

import test.sklep.domain.Book;
import test.sklep.domain.MovieCD;
import test.sklep.domain.MusicCD;
import test.sklep.domain.Product;
import test.sklep.domain.Sound;

public class ProductCatalog {

	private List<Product> products = new ArrayList<Product>();

	public ProductCatalog() {
		products.add(new Book("Ania z Zielonego Wzgórza",
				" Literatura dla dzieci i młodzieży", 19.99,
				"978-83-7517-471-7"));
		products.add(new Book("W pustyni i w puszczy",
				" Literatura dla dzieci i młodzieży", 11.99,
				"978-83-7327-241-5"));

		products.add(new MusicCD(
				"Sinatra Buble Bennett - My Kind Of Music - 2CD", "Jazz",
				25.40, 120));
		products.add(new MusicCD("Michael Buble - Michael Buble - 1CD", "Jazz",
				19.00, 120));

		products.add(new MovieCD("Rambo III", "Film akcji", 39.90, 120,
				Sound.DUBBING));
		products.add(new MovieCD("Pan Wołodyjowski", "Film historyczny", 45.80,
				153, Sound.ORYGINAL));
	}

	public void printOffer() {
		System.out.println("Oferta sklepu internetowego:");
		int i = 0;
		for (Product prod : products) {
			if (prod != null) {
				System.out.println("[" + i + "] " + prod);
				i++;
			}

		}
	}

	public Product getProduct(int prodId) {
		return products.get(prodId);
	}

}
