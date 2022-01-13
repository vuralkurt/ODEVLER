package While;

import java.util.Scanner;

public class Aa {

	public static void main(String[] args) {
		
		for (int i = 1; i < 6; i++) {
			
		}
		 Scanner scan=new Scanner(System.in);
		 
		 int sayi=1;
		 int toplam=0;
		 int sayac=0;
		 
		while(sayi!=0) {
			
			System.out.println("Lutfen toplama eklemek icin bir tamsayi yazin \nbitirmek icin 0'a basin");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
			
			
		}
		
		System.out.println("girilen sayi adedi : " + (sayac-1));
		System.out.println("girilen sayilarin toplami : " + toplam);
		scan.close();
		
		
	}

}
