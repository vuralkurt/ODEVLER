package ForLoop_Haluk;

public class Rr {

	public static void main(String[] args) {
		/*
		 * A B B C C C D D D D E E E E E F F F F F F þekli yazdýrýnýz
		 */

		for (char i = 65; i < 71; i++) {

			for (char j = 65; j < i + 1; j++) {

				System.out.print(i);
			}
			System.out.println();
		}

	}

}
