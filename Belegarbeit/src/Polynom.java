
public class Polynom {
	double[] koeffizienten;

	public Polynom(double[] uebergabe) {

		koeffizienten = uebergabe;
	}

	public double[] getKoeffizienten() {
		return this.koeffizienten;
	}

	public void setKoeffizienten(double[] koeffizient) {
		this.koeffizienten = koeffizient;
	}

}
