import Prog1Tools.IOTools;

public class Polynom {
	private final int HOECHSTERGRAD = 7;
	private double[] koeffizienten = { 0, 0, 0, 0, 0, 0, 0 };

	public Polynom() {
	}

	public Polynom(double[] uebergabe) {
		this.koeffizienten = uebergabe;
	}

	public void erstellen() {
		int abfrageHoechsterGrad;
		boolean abfrageKorrekt = false;
		do {
			abfrageHoechsterGrad = IOTools
					.readInteger("Bitte geben Sie den höchsten Grad (zwischen 0 und 6 Grad) Ihres Polynomes ein: \n");
			if (abfrageHoechsterGrad >= 0 && abfrageHoechsterGrad < HOECHSTERGRAD) {
				abfrageKorrekt = true;
			}
		} while (abfrageKorrekt == false);
		for (int i = 0; i <= abfrageHoechsterGrad; i++) {
			this.koeffizienten[i] = IOTools.readDouble("Bitte geben Sie den Koeffizienten von x^" + (i) + "ein:\n");
		}
	}

	public static void ausgabe(Polynom p) {
		double[] d = p.getKoeffizienten();

		System.out.println();
		for (int i = d.length - 1; i >= 0; i--) {
			if (d[i] != 0) {
				if (i == 0) { // Absolutes Glied
					System.out.printf("%+.2f ", d[i]);
				} else if (i == 1) {
					System.out.printf("%+.2f", d[i]);
					System.out.printf("x ");
				} else {
					System.out.printf("%+.2f", d[i], i);
					System.out.printf("x^%d ", (i));
				}
			}
		}
		System.out.println();
	}

	public double[] getKoeffizienten() {
		return this.koeffizienten;
	}

	public void setKoeffizienten(double[] koeffizient) {
		this.koeffizienten = koeffizient;
	}

}
