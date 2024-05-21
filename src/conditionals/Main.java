package conditionals;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// --------------------------------------------- IF-ELSE ----------------------------------------------
		int x = 20, y = 30, z = 40;
		if (!(x > y)) System.out.println("X è maggiore di Y");
		else System.out.println("X è minore o uguale a Y");

		if (x > y) System.out.println("X è maggiore di Y");
		else if (x == 100) System.out.println("X è uguale a 100");
		else System.out.println("X è minore o uguale a Y e non è uguale a 100");


		// --------------------------------------------- TERNARY ----------------------------------------------
		String result = x > y ? "X è maggiore di Y" : "X è minore di Y";

		// Meglio non abusare del ternary operator per non compromettere la comprensibilità/leggibilità del codice
		int w = x > y ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println(w);

		// --------------------------------------------- SWITCH-CASE ----------------------------------------------
		String piattoPreferito = "Carne";

		switch (piattoPreferito) {
			default: {
				System.out.println("Il mio piatto preferito non è nessuno dei precedenti!");
				break;
			}
			case "Pizza": {
				System.out.println("Il mio piatto preferito è la pizza");
				break;
			}
			case "Pasta": {
				System.out.println("Il mio piatto preferito è la pasta");
				break;
			}
			case "Pesce": {
				System.out.println("Il mio piatto preferito è il pesce");
				break;
			}
		}

		Scanner scanner = new Scanner(System.in);

		System.out.println("Dammi il primo numero");
		int num1 = Integer.parseInt(scanner.nextLine()); // 1000

		System.out.println("Dammi il secondo numero");
		int num2 = Integer.parseInt(scanner.nextLine()); // 100

		int num3 = num1 > num2 ? num1 : num2; // 1000

		switch (num3) {
			case 10: {
				System.out.println("num3 è 10");
				num1++;
			}
			case 100: {
				System.out.println("num3 è 100");
				num1--;
				break;
			}
			case 1000: { // <---
				System.out.println("num3 è 1000");
				num1++; // 1001
			}
			default: { // <--
				System.out.println("Nessuno dei precedenti");
				num1--; // 1000
				break;
			}
		}

		System.out.println("num1? " + num1); // 1000


		scanner.close();


	}


}
