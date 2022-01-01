package ForLoop_Haluk;

public class Tt {

	public static void main(String[] args) {
		
		
		 for ( int satir = 1; satir < 6; satir++) {//satýr kontrolu

	            for (int bosluk = 6- satir; bosluk > 1; bosluk--) {//bosluklari 4,3,2,1 tane yazdýrmalýyým
	                System.out.print(" ");
	            }

	            for (int yildiz =  1; yildiz <=satir; yildiz++) {//yýldýz kontrolu
	                System.out.print("* ");//"*" yapýlýrsa saða dayalý üçgen olur
	            }

	            System.out.println();
	        }

		
		

	}

}
