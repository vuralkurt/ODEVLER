package StringManipulation;

import java.util.Scanner;

public class Alistirma2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("cumle gir");
		String cumle = scan.nextLine();
		System.out.println("kelime gir");
		String kelime = scan.next();

		int index = cumle.indexOf(kelime);
		System.out.println(index);

		if (index < 0) {
			System.out.println("kelime yok");
		} else if (index == 1) {
			System.out.println("kelime bir kez");
		} else
			System.out.println("kelime birden fazla");

	}

}
