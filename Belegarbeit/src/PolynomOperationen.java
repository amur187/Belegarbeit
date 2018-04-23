public class PolynomOperationen {

	private Polynom erstesPolynom;
	private Polynom zweitesPolynom;

	public PolynomOperationen() {
	}

	public PolynomOperationen(Polynom erstesPolynom, Polynom zweitesPolynom) {
		this.erstesPolynom = erstesPolynom;
		this.zweitesPolynom = zweitesPolynom;
	}

	// Funktionswert an einer Stelle x ist fertig
	public double funktionsWertBestimmen(Polynom p1, double stelle) {
		double erg = 0;
		for (int i = 0; i < p1.getKoeffizienten().length; i++) {
			erg = erg + p1.getKoeffizienten()[i] * Math.pow(stelle, i);
		}
		System.out.println(erg);
		return erg;
	}

	public void listeErstellen() {
		double[][] liste = new double[5][];
		for (int i = 0; i < liste.length; i++) {
			liste[i] = null;
		}
		System.out.println(liste.length);
	}

	public void speichern() {

	}

	public void aendern() {

	}

	public void hornerFunktionswert(Polynom p1, double x) {
		double funktionswert;
		double[] matrix = p1.getKoeffizienten();

		for (int i = 0; i < matrix.length; i++) {
			if (i == 0) {
				funktionswert = matrix[i] * x;
			} else {
				// matrix[i] =
			}

		}

	}

	public void nullstelleBestimmen(Polynom p1) {
		for (int i = 0; i < 1000; i++) {
		}
	}

	// Addieren fertig
	public Polynom addieren() {
		double[] ergebnisArray = new double[7];
		Polynom p = new Polynom(ergebnisArray);

		for (int i = 0; i < this.erstesPolynom.getKoeffizienten().length; i++) {
			ergebnisArray[i] = ergebnisArray[i] + this.erstesPolynom.getKoeffizienten()[i];
		}

		for (int i = 0; i < this.zweitesPolynom.getKoeffizienten().length; i++) {
			ergebnisArray[i] = ergebnisArray[i] + this.zweitesPolynom.getKoeffizienten()[i];
		}
		p.setKoeffizienten(ergebnisArray);

		return p;
	}

	public static void differenz(Polynom p1, Polynom p2) {
		double[] d = new double[7];
		Polynom p = new Polynom(d);
		for (int i = 0; i < d.length; i++) {
			d[i] = p1.getKoeffizienten()[i] - p2.getKoeffizienten()[i];
		}
		p.setKoeffizienten(d);
		// polynomOperationen.ausgabe(p);
	}

}
