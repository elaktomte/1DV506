package cf222jf_lab2;

public class Tartljus {

	public static void main(String[] args) {
		int ljus = 0;
		int lador = 0;
		int totalt = 0;
		
		for (int i = 0; i <= 100; i++){
			ljus = ljus-i;
			if (ljus < 0){
				while (ljus < 0){
					lador++;
					ljus = ljus + 24;
					totalt++;
					
				}
				
				System.out.println("Till din " + i + "-�rsdag, k�p " + lador + " L�da/l�dor");
				lador = 0;
				
			}
		}
		System.out.println("Totalt antal l�dor k�pta); " + totalt);
		System.out.println("Ljus kvar: " + ljus);
		
			

	}

}
