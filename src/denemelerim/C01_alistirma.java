package denemelerim;

import java.util.Scanner;

public class C01_alistirma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.
		 * println("Lutfen isminizi ve soyisminizi giriniz \n isimden sonra enter basiniz"
		 * );
		 * 
		 * String isim = scan.next(); String soyisim = scan.next();
		 * 
		 * 
		 * System.out.
		 * println("Lutfen tercihinizi giriniz.\nAcik isim icin 1 basaniz.\nGizli olarak gormek icin 2 basiniz."
		 * ); int tercih = scan.nextInt();
		 * 
		 * 
		 * String birlesikIsim=null;
		 * 
		 * 
		 * if(tercih==1) { birlesikIsim=isimAcik(isim,soyisim); } else if(tercih==2){
		 * birlesikIsim=isimGizle(isim,soyisim); } else
		 * {System.out.println("1 veya 2 giriniz");
		 * 
		 * }System.out.println("Kullanici tercihi:"+birlesikIsim);
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * private static String isimGizle(String isim, String soyisim) { // TODO
		 * Auto-generated method stub isim = isim.substring(0, 1).toUpperCase()
		 * +isim.substring(1).replaceAll("\\w", "*"); soyisim = soyisim.substring(0,
		 * 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*"); return (isim
		 * + soyisim); }
		 * 
		 * private static String isimAcik(String isim, String soyisim) { // TODO
		 * Auto-generated method stub isim = isim.substring(0, 1).toUpperCase() +
		 * isim.substring(1).toLowerCase(); soyisim = soyisim.substring(0,
		 * 1).toUpperCase() + soyisim.substring(1).toLowerCase(); return (isim +
		 * soyisim);
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		String isim = scan.nextLine();
		String soyisim = scan.nextLine();
		String birlesik = null;

		isimAcik(isim, soyisim);
		isimGizli(isim, soyisim);

		int secim = scan.nextInt();

		if (secim == 1) {
			System.out.println(isimAcik(isim, soyisim));
		} else if (secim == 2) {
			System.out.println(isimGizli(isim, soyisim));

		}
		else  {
			System.out.println("lutfen dogru deger giriniz" + "\n" + birlesik);
		}

	}// main sonu

	public static String isimGizli(String isim, String soyisim) {

		String isimGizli = isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*") + " "
				+ soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");

		return (isimGizli);

	}

	public static String isimAcik(String isim, String soyisim) {
		// TODO Auto-generated method stub

		String isimAcik = isim.substring(0,1).toUpperCase() + isim.substring(1) + " " + soyisim.substring(0,1).toUpperCase()
				+ soyisim.substring(1);

		return (isimAcik);

	}

}
