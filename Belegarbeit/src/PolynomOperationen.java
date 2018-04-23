import Prog1Tools.IOTools;

public class polynomOperationen {

	public static double funktionsWertBestimmen(double[] polynom) {
		int stelle = IOTools.readInt("Welcher Stellenwert soll bestimmt werden? \n");
		double erg = 0;
		for (int i = 0; i < polynom.length; i++) {
			erg = erg + polynom[i] * Math.pow(stelle, i);
		}
		return erg;
	}

	public static double[] erstellen() {
		int hoechsterGrad = IOTools.readInteger("Bitte geben Sie den höchsten Grad Ihres Polynomes ein:\n");
		double[] polynom = new double[7];
		for (int i = 0; i <= hoechsterGrad; i++) {
			if (i > hoechsterGrad) {
				polynom[i] = 0;
			} else {
				polynom[i] = IOTools.readDouble("Bitte geben Sie den Koeffizienten von x^" + i + "ein:\n");
			}
		}
		return polynom;
	}

	// Ausgabe ist fertig
	public static void ausgabe(Polynom p) {
		double[] d = p.getKoeffizienten();
		for (int i = d.length - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.printf("%+.2f ", d[i]);
			} else if (i == 1) {
				System.out.printf("%+.2fx ", d[i]);
			} else {
				System.out.printf("%+.2fx^%d ", d[i], i);
			}
		}
	}

	// public static void listeFuellen(Polynom p) {
	// for (int i = 0; i < 5; i++) {
	// if (p.getKoeffizienten()[i] == null) {
	//
	// }
	// }
	// }

	public static void listeErstellen() {
		double[][] liste = new double[5][];
		for (int i = 0; i < liste.length; i++) {
			liste[i] = null;
		}
		System.out.println(liste.length);
	}

	public static void speichern() {

	}

	public static void aendern() {

	}

	public static void addieren() {

	}

	public static void differenz() {

	}

}
