package WhileLoop;

public class Alistirma_2 {

	public static void main(String[] args) {
		/*
		 * int i=100;
		 * 
		 * while (i>=100 &&i<1000) {
		 * 
		 * if (i%15==0&&i%20==0&&i%90==0) { System.out.println(i+" "); }
		 * 
		 * i++; }
		 * 
		 */

		int sayi = 100;

		while (sayi < 1000) {

			if (sayi % 15 == 0 && sayi % 20 == 0 && sayi % 90 == 0) {

				System.out.println(sayi);
			}
			sayi++;
		}

	}
}
