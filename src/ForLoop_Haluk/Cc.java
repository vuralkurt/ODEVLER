package ForLoop_Haluk;

import java.util.Scanner;

public class Cc {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String cumle=scan.nextLine();
		
		int sayac=0;
		
		for (int i = 0; i < cumle.length()-1; i++) {
			
			if (cumle.toLowerCase().charAt(i)=='a') {
				sayac++;
				
			}else if(cumle.toLowerCase().charAt(i)=='c') 
				break;
			
				
			
			
			
		}
		
		System.out.println("girdiginiz metindeki c karakterine kadar olan a karakter sayisi :"+sayac);
		
	}

}
