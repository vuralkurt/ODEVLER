package denemelerim;

import java.util.Scanner;

public class replit {

	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen dakika giriniz");

		int dakika = scan.nextInt();
		System.out.println(dakika / 525600 + "yildir");

		int kalan = dakika % 525600;
		System.out.println(kalan / (60 * 24) + "gundur");

		/*
		 * int x=Integer.MAX_VALUE; System.out.println(x);
		 */
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("float gir");
		float sayi = scan.nextFloat();
		
		short x= (short) sayi;
		
		
		System.out.println(x);
		
		*/
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("double gir");
		double sayi=scan.nextDouble();
		
		int x=(int)sayi;
		System.out.println(x);
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen isim gir");
		String isim=scan.next();
		System.out.println("lutfen soyisim gir");
		String soyisim=scan.next();
		System.out.println("lutfen kart no gir");
		String kartNo=scan.next();
		
		System.out.println("isim:"+isim.toUpperCase().substring(0, 1)+isim.replaceAll("\\w","*" ).substring(1));
		
		System.out.println("soyisim:"+soyisim.toUpperCase().substring(0, 1)+soyisim.replaceAll("\\w","*" ).substring(1));
		
		System.out.println("kart no:"+kartNo.replaceAll("\\w", "*").substring(0, kartNo.length()-4));
		
		
	}
}