package WhileLoop;

import java.util.Scanner;

public class Alistirma_7 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi girin");
		int sayi=scan.nextInt();
		
		int rakam=0;
		int toplam=0;
		
		 String sayiStr=""+sayi;
		
		for (int i = 0; i <sayiStr.length(); i++) {
            rakam=sayi%10;
            toplam+=rakam;
            sayi/=10;
		}
				
		System.out.println(toplam);

 // for loop ile yapalim
        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfenrakamlar toplamini bulmak icin pozitif bir tam sayi giriniz");
        int sayi=scan.nextInt(); // 345 data turu int
        
        int rakamlarToplami=0;
        int rakam=0;
        
        String sayiStr=""+sayi; // 345 data turu String
        // int olarak verilen bir sayinin basamak sayisini bulmak istersek
        // kisa yoldan o sayiyi String'e cevirip, str.length() method'unu kullanabiliriz
                
                for (int i = 0; i < sayiStr.length(); i++) {
                    rakam=sayi%10;
                    rakamlarToplami+=rakam;
                    sayi/=10;
                }
                System.out.println("girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
                */
                scan.close();
	}

}
