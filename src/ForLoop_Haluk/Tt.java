package ForLoop_Haluk;

public class Tt {

	public static void main(String[] args) {
		
		
		 for ( int satir = 1; satir < 6; satir++) {//sat�r kontrolu

	            for (int bosluk = 6- satir; bosluk > 1; bosluk--) {//bosluklari 4,3,2,1 tane yazd�rmal�y�m
	                System.out.print(" ");
	            }

	            for (int yildiz =  1; yildiz <=satir; yildiz++) {//y�ld�z kontrolu
	                System.out.print("* ");//"*" yap�l�rsa sa�a dayal� ��gen olur
	            }

	            System.out.println();
	        }

		
		

	}

}
