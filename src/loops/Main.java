package loops;

public class Main {
	public static void main(String[] args) {
	/*	Scanner scanner = new Scanner(System.in);

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


		scanner.close();*/


		System.out.println("------------------------ FOR ---------------------------");
		/*for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) continue; // continue serve per saltare l'iterazione corrente e passare alla successiva
			System.out.println(i);
		}

		for (int i = 0; i <= 10; i++) {
			if (i == 5) break; // break serve per uscire forzatamente dal loop
			System.out.println(i);
		}*/

		esterno:
		// Se io mettessi un'etichetta al loop esterno, poi con i break posso decidere di uscire da quel loop specifico
		for (int i = 0; i < 5; i++) {
			if (i == 3) continue;
			for (int j = 0; j < 5; j++) {
				if (j == 2) break esterno;
				System.out.println("j: " + j);
			}
			System.out.println("i: " + i);
		}
	}

}
