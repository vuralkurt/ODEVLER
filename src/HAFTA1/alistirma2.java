package HAFTA1;

import java.util.Scanner;

public class alistirma2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("bir sayi giriniz");
		Scanner scan = new Scanner(System.in);
		int sayi=scan.nextInt();
		
		int a=sayi%10;
		System.out.println("birler bas:"+a);
		int b=(sayi/10)%10;
		System.out.println("onlar bas:"+b);
		int c=(sayi/100)%10;
		System.out.println("yuzler bas:"+c);
		int d=sayi/1000;
		System.out.println("binler bas."+d);
		
		
		
		
		
		System.out.println("lutfen sayilari giriniz");
		Scanner dor=new Scanner(System.in);
		
		double sayi1=dor.nextDouble();
		System.out.println("1.sayi="+sayi1);
		
		
		double sayi2=dor.nextDouble();
		System.out.println("2.sayi="+sayi2);
		
		double sayi3=dor.nextDouble();
		System.out.println("3.sayi="+sayi3);
		
		System.out.println("toplam="+(sayi1+sayi2+sayi3));
		System.out.println("carpim="+(sayi1*sayi2*sayi3));

	}

}
