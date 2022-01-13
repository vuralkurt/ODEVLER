package WhileLoop;

import java.util.Scanner;

public class Alistirma_5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println(" sayi giriniz");
		int sayi = scan.nextInt();

		int i = 1;
		
		while (i <= 10) {
			
			int carpim =sayi;
			carpim=sayi* i;
			System.out.print(sayi+"*"+i+"="+carpim+"\n");
			i++;
		}

	}

}
