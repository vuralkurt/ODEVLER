package WhileLoop;

import java.util.Scanner;

public class Alistirma_6 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi girin");
		int sayi=scan.nextInt();
		int sayac=0;
		int bolen=1;
		
		while (bolen<=sayi) {
			if(sayi%bolen==0) {
				System.out.print(bolen+"-");
				sayac++;
			}
			bolen++;
		}
		System.out.println("");
		System.out.println(sayi+" sayisinin "+sayac+" tane boleni vardir.");
				
		
		
	}
}
