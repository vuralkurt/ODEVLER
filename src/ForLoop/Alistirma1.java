package ForLoop;

import java.util.Scanner;

public class Alistirma1 {

	public static void main(String[] args) {

		/*
		 * SORU3: Bir String icerisinde yinelenen karakterleri döndüren bir kod
		 * yazýniz.(mülakat Sorusu) Input : String str=“Javaisalsoeasy” Output: a s
		 * 
		 */

		 birKereYazdir("javacýlar çoook afilli arkadaþlar");

    }

    public static void birKereYazdir(String str) {

        String sonuc = "";  //string default deðeri "" atadýk çünkü iþleme etki etmemeli.
        for (int i = 0; i < str.length(); i++) {
            if (!sonuc.contains(str.substring(i, i + 1))) {//sonuç metni str'nin

                sonuc += str.substring(i, i + 1);
            }
        }


        System.out.println(sonuc);
	}

}
