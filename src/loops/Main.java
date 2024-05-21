package loops;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dammi il primo numero");
		int num1 = Integer.parseInt(scanner.nextLine()); // 20

		System.out.println("Dammi il secondo numero");
		int num2 = Integer.parseInt(scanner.nextLine()); // 4

		System.out.println("------------------------ WHILE ---------------------------");
		// Nel while la condizione viene valutata come prima cosa. Se essa dovesse essere subito falsa, allora non eseguirò mai quello che sta nella parentesi graffe.
		// Se è vera allora eseguirò fino a che non diventa falsa.

		while (num2 <= num1 + 10) { // 32 <= 30 ? NO
			num2 += 4; // 32
			System.out.println(num2);
		}

		System.out.println("------------------------ DO WHILE ---------------------------");
		// Nel do-while la condizione viene valutata solo dopo aver eseguito tutto ciò che c'è nelle parentesi graffe. Quindi anche se la condizione dovesse essere falsa,
		// siamo sicuri che almeno una volta il codice verrà eseguito.

		do {
			System.out.println(num1 += 1); // ++num1
		} while (num1 < 100);

		scanner.close();
	}

}
