
public class TestPolynom {

	public static void main(String[] args) {
		// Menu.StartMenu();
		// Polynom.polynomAusgabe(Polynom.polynomErstellen());
		double[] d1 = { 17, -6, -5, -4 };
		double[] d2 = { 17, -6, -5, -4, 3, 0, 2 };

		// Polynom.polynomAusgabe(Polynom.polynomErstellen());

		Polynom p1 = new Polynom(d1);
		Polynom p2 = new Polynom(d2);
		Polynom ergebnis = new Polynom();
		PolynomOperationen polynomOperationen = new PolynomOperationen(p1, ergebnis);
		ergebnis.erstellen();

		// Addieren
		ergebnis = polynomOperationen.addieren();
		ergebnis.ausgabe(ergebnis);
		polynomOperationen.funktionsWertBestimmen(ergebnis, 2);

		// System.out.println(ergebnis.getKoeffizienten()[0]);
		// System.out.println(ergebnis.getKoeffizienten()[1]);
		// System.out.println(ergebnis.getKoeffizienten()[2]);
		// System.out.println(ergebnis.getKoeffizienten()[3]);
		// System.out.println(ergebnis.getKoeffizienten()[4]);
		// System.out.println(ergebnis.getKoeffizienten()[5]);
		// System.out.println(ergebnis.getKoeffizienten()[6]);
		// ergebnis.ausgabe(ergebnis);
		// ergebnis.ausgabe(ergebnis);

		// polynomOperationen.ausgabe(ergebnis);
		// polynomOperationen.ausgabe(p2);
		// polynomOperationen.differenz(p1, p2);

		// System.out.println(polynomOperationen.funktionsWertBestimmen(p1, -1));
	}

}
