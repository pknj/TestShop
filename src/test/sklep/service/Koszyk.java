package test.sklep.service;

import java.util.ArrayList;
import java.util.List;

import test.sklep.domain.Product;

class ProdCount {
	private Product prod;

	private int count;

	public ProdCount(Product prod, int count) {
		this.prod = prod;
		this.count = count;
	}

	public Product getProd() {
		return prod;
	}

	public int getCount() {
		return count;
	}
}

public class Koszyk {

	private List<ProdCount> products = new ArrayList<ProdCount>();

	public void buy(Product prod, int count) {
		products.add(new ProdCount(prod, count));

		System.out.println("kupiono produkt: " + prod + " w ilości sztuk "
				+ count + ". łączna cena: " + prod.getPrice() * count);

	}

	public double getTotalPrice() {
		double totalPrice = 0;

		for (ProdCount prodCount : products) {
			if (prodCount != null)
				totalPrice += prodCount.getProd().getPrice()
						* prodCount.getCount();
		}

		return totalPrice;
	}
}
