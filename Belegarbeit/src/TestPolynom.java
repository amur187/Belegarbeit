
public class TestPolynom {

	public static void main(String[] args) {
		// Menu.StartMenu();
		// Polynom.polynomAusgabe(Polynom.polynomErstellen());
		double[] d1 = { -7, 6, 5, 4, -3, 2, -1 };
		// Polynom.polynomAusgabe(Polynom.polynomErstellen());

		Polynom p1 = new Polynom(d1);
		polynomOperationen.ausgabe(p1);
	}

}
