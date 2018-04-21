import java.util.Scanner;

public class Menu {
	public static void StartMenu() {
		System.out.print("#########################################\n");
		System.out.print("### Belegarbeit Dennis Hiller         ###\n");
		System.out.print("### Polynome                          ###\n");
		System.out.print("### 1. Polynom erstellen              ###\n");
		System.out.print("### 2. Polynom ausgeben               ###\n");
		System.out.print("### 3. Polynom verändern              ###\n");
		System.out.print("### 4. Funktionswert bestimmen        ###\n");
		System.out.print("### 5. Summe                          ###\n");
		System.out.print("### 6. Differenz                      ###\n");
		System.out.print("### 7. Funktion ableiten              ###\n");
		System.out.print("#########################################\n");
		System.out.print("### Bitte geben Sie Ihre Auswahl ein. ###\n");
		System.out.print("#########################################\n");
		Abfrage();
	}

	public static void Abfrage() {
		Scanner sc = new Scanner(System.in);
		int Eingabe = sc.nextInt();
		switch (Eingabe) {
		case 1: // Polynome erstellen
			System.out.println("Danke");
			break;
		case 2: // Polymom ausgeben
			System.out.println("Danke");
			break;
		case 3: // Polynom verändern
			System.out.println("Danke");
			break;
		case 4: // Funktionswert bestimmen
			System.out.println(
					"Welches Polynom soll zur Funktionswertbestimmung verwendet werden?\n \t 1. Neues Polynom \n \t 2. Aus Liste auswählen");
			// System.out.println(Polynom.funktionsWertBestimmen());
			break;
		case 5: // Summe
			System.out.println("Danke");
			break;
		case 6: // Differenz
			System.out.println("Danke");
			break;
		case 7: // Funktion ableiten
			System.out.println("Danke");
			break;

		default:
			System.out.println("Falsche Eingabe! Bitte wählen Sie einen erlaubten Wert");
			Abfrage();
			break;
		}
	}
}
