package ForLoop_Haluk;

public class Pp {

	public static void main(String[] args) {
		
		/*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */
		
		
		for (char j = 65; j < 71; j++) {
			for (char i = 65; i < j+1; i++) {
				
				
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
		
		
		
		

	}

}
