package ForLoop;

import java.util.Scanner;

public class Alistirma1 {

	public static void main(String[] args) {

		/*
		 * SORU3: Bir String icerisinde yinelenen karakterleri d�nd�ren bir kod
		 * yaz�niz.(m�lakat Sorusu) Input : String str=�Javaisalsoeasy� Output: a s
		 * 
		 */

		 birKereYazdir("javac�lar �oook afilli arkada�lar");

    }

    public static void birKereYazdir(String str) {

        String sonuc = "";  //string default de�eri "" atad�k ��nk� i�leme etki etmemeli.
        for (int i = 0; i < str.length(); i++) {
            if (!sonuc.contains(str.substring(i, i + 1))) {//sonu� metni str'nin

                sonuc += str.substring(i, i + 1);
            }
        }


        System.out.println(sonuc);
	}

}
