package ForLoop_Haluk;

public class Aa {

	public static void main(String[] args) {
		/*
		 * sayac� ritmik ilerleyen ve ad�m say�s� belli ise FOR kullan�l�r. DE��LSE
		 * While kullan�l�r, E�er d�ng�ye bir kez mutlaka girilecekse DO_WHILE
		 * kullan�l�r. Problem Tan�m� 100'den 0'a kadar 13'e tam b�l�nebilen say�lar� ve
		 * toplamlar�n� ekrana yazd�r�n�z (b�y�kten k����e). Ekran ��kt�s� 91 78 65 52
		 * 39 26 13
		 */

		int top = 0;
		for (int i = 100; i > 0; i--) {
			if (i % 13 == 0) {
				top += i;
				System.out.print(i+"-");
			}
          
		}
		System.out.println();
		System.out.println(top);
	}
}
