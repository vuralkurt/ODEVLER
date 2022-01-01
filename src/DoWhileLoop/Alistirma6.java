package DoWhileLoop;

import java.util.Scanner;

public class Alistirma6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String cumle = scan.nextLine();

		ters(cumle);
		System.out.println(ters(cumle) + cumle.substring(0, cumle.indexOf(" ")));
	}

	private static String ters(String cumle) {

		String sepet = "";
		for (int i = cumle.length() - 1; i >= 0; i = cumle.lastIndexOf(" ")) {

			sepet += cumle.substring(cumle.lastIndexOf(" ") + 1) + " ";

			cumle = cumle.substring(0, cumle.lastIndexOf(" "));

		}
		return sepet;
	}
}