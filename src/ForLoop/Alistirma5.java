package ForLoop;

import java.util.Scanner;

public class Alistirma5 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen sayiyi giriniz");
		int sayi=scan.nextInt();
		
		for (int i = 1; i < sayi; i++) {
			if (i%3==0&&i%5==0) {
				System.out.print(i+",");
			}
			
		}
		
		
	}

}
