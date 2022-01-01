package ForLoop;

import java.util.Scanner;

public class Alistirma6 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen sayiyi giriniz");
		int sayi=scan.nextInt();
		
		for (int i = 1; i < sayi; i++) {
			
					
			if (i%3==0) {
				System.out.println(i+" "+"Java");
				
			} else if(i%5==0) {
				System.out.println(i+" "+"guzeldir");
				
			}if(i%15==0) {
				System.out.println(i+" "+"Java guzeldir");
			}
			
		}
		
	}

}
