package test.sklep.service;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ProductCatalog pCat = new ProductCatalog();
		pCat.printOffer();
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Podaj numer [indexu] produktu, który chcesz kupić: ");
			int index = scan.nextInt();
			
			System.out.println("Podaj ilość sztuk produktu [" + index + "]");
			int count = scan.nextInt();
			
		scan.close();
		
		Koszyk koszyk = new Koszyk();
		System.out.println("\nTwój koszyk:");
		
		//kupujemy produkt z listy i podajemy ilość kupionych rzeczy
		koszyk.buy(pCat.getProduct(index), count);

		
		System.out.println("Wartość zamówienia to: " + koszyk.getTotalPrice());
	}
}
