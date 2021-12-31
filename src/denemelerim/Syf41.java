package denemelerim;

import java.util.Scanner;

public class Syf41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String x="Mehmet"; String y="Bulutluoz";
		 * System.out.println("Isminiz;"+x+"\n"+"Soyadiniz:"+y);
		 */

		/*
		 * int sayi1=89; int sayi2=91; System.out.println("Toplam:"+(sayi1+sayi2));
		 */

		/*
		 * int x=55; double y=85.36 ; System.out.println("Toplam:"+(x+y));
		 */

		/*
		 * char x='A'; char y='S'; char z='D'; System.out.println(x+y+z);
		 */

		/*
		 * char x='p'; int y=88; System.out.println(x+y);
		 */

		/*
		 * int sayi1=50; int sayi2=80;
		 * 
		 * int x=sayi2; sayi2=sayi1; sayi1=x;
		 * 
		 * System.out.println("sayi1:"+sayi1+"\n"+"sayi2:"+sayi2);
		 */

		/*
		 * int sayi1=8000; int sayi2=1500;
		 * 
		 * int fark=sayi1-sayi2; sayi1=sayi1-fark; sayi2=fark+sayi2;
		 * 
		 * System.out.println(sayi1+"\n"+sayi2);
		 */

		Scanner scan = new Scanner(System.in);
		// int x=scan.nextInt();
		// int y=scan.nextInt();
		// System.out.println(x+y);System.out.println(x-y);System.out.println(x*y);

		/*
		 * int x=scan.nextInt(); int cevre=4*x; int alan=x*x;
		 * 
		 * System.out.println(cevre+"\n"+alan);
		 */

		/*
		 * 
		 * double r=scan.nextInt(); double cevre=2*3.14*r; double alan=r*r;
		 * System.out.println(cevre+"\n"+alan);
		 * 
		 */
		/*
		 * double x=scan.nextDouble(); double y=scan.nextDouble(); double
		 * z=scan.nextDouble();
		 * 
		 * double hacim; hacim=x*y*z;
		 * 
		 * System.out.println("hacim:"+hacim);
		 */

		/*
		 * String isim=scan.nextLine(); String soyisim=scan.nextLine();
		 * System.out.println("isminiz:"+isim+"\n"+"soyisminiz:"+soyisim+
		 * "\n"+"kaydiniz basarili olarak alinmistir");
		 * 
		 */
		/*
		 * String isim=scan.nextLine(); char x=isim.charAt(0);
		 * 
		 * System.out.println("ismin ilk harfi="+x);
		 * 
		 */
		/*
		 * byte x=12; short y=x; int z=x; double b=z; System.out.println(y);
		 * System.out.println(z); System.out.println(b);
		 * 
		 * double a=236.54; int c= (int) a; byte d=(byte) a;
		 * 
		 * System.out.println(d);
		 */

		/*
		 * int b=scan.nextInt(); double c=scan.nextDouble(); double e = b/c; double d =
		 * b*c; System.out.println(e); System.out.println(d);
		 */
		/*
		 * int a=40256; short b= (short)a; byte c=(byte)a; System.out.println(b);
		 * System.out.println(c);
		 */
		/*
		 * int numc=7; numc/=2; System.out.println(numc);
		 */
		/*
		 * int a=15; int b=a++; System.out.println(b);
		 */
		/*
		 * int a=15%4; System.out.println(a);
		 */
		/*
		 * String str1="Java"; String str2="Guzel"; int sayi1=5; int sayi2=4;
		 * 
		 * System.out.println(str1+" "+str2+" "+sayi1+sayi2);
		 * System.out.println(str1+" "+sayi1+" "+str2);
		 * System.out.println(str1+" "+(sayi1+sayi2)+sayi2);
		 * System.out.println(str1+" "+((sayi1*3+sayi2)));
		 * System.out.println(""+sayi1+sayi2+" "+str2);
		 * 
		 */
		/*
		 * boolean sonuc1=5+2==17; System.out.println(sonuc1);
		 * 
		 * boolean sonuc2=5*2!=15; System.out.println(sonuc2);
		 * 
		 * boolean sonuc3=(5+2==7)&&(4+3!=5); System.out.println(sonuc3);
		 * 
		 * boolean sonuc4=(5+2==7)||(5*3!=15); System.out.println(sonuc4);
		 */
		/*
		 * int a=7; int b=5; if(a>b) { System.out.println(a+b); }if(a<b) {
		 * System.out.println(a*b); }if(a==b) { System.out.println(a-b); }
		 */
		/*
		 * int sayi1=scan.nextInt();
		 * 
		 * if(sayi1%2==0) { System.out.println("sayi cift"); }if(sayi1%2!=0) {
		 * System.out.println("sayi tek"); }
		 */

		/*
		 * String gunn=scan.next().toLowerCase(); char gun=gunn.charAt(0);
		 * 
		 * 
		 * if(gun=='p') { System.out.println("pazartesi,persembe,pazar"); }if(gun=='c')
		 * { System.out.println("cuma,cumartesi,carsamba"); }if(gun=='s') {
		 * System.out.println("sali"); }
		 */

		/*
		 * System.out.println("gunu gir"); String gun = scan.next().toLowerCase();
		 * 
		 * if (gun.equals("pazar") || gun.equals("cumartesi")) {
		 * System.out.println("hafta sonu");
		 * 
		 * } if (gun.equals("cuma") || gun.equals("persembe") || gun.equals("carsamba")
		 * || gun.equals("sali") || gun.equals("pazartesi")) {
		 * System.out.println("hafta ici");
		 * 
		 * System.out.println("hafta ici"); }
		 * 
		 */
         /*
		int kenar2 = scan.nextInt();

		int kenar1 = scan.nextInt();
		int kenar3 = scan.nextInt();

		if (kenar1 == kenar2 && kenar3 == kenar2 && kenar1 == kenar3) {
			System.out.println("bu bir karedir");

		}
		if(kenar1 != kenar2 || kenar3 != kenar2 || kenar1 != kenar3) {
			System.out.println("bu bir kare degildir");
		}
		*/
		
		String gun=scan.next();
		 
		
		  
		
		
		
		
		
		
		
		
		
		
		
	}
}
