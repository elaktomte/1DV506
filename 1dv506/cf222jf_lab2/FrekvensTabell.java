package cf222jf_lab2;
import java.util.*;

public class FrekvensTabell {

	public static void main(String[] args) {
		Random tarning = new Random();
		int tarningen = tarning.nextInt(6)+1;
		
		int[] resultat ={0,0,0,0,0,0};
		
		for ( int i = 0; i < 6000; i++){		// de 6000 tärningskasten
			tarningen = tarning.nextInt(6);		
			resultat[tarningen]++;
				
			
		}
		System.out.println("Resultatet utav 6000 tärningsslag");			// Skriver ut allt
		System.out.println("Antal ettor: " + resultat[0]);
		System.out.println("Antal tvåor: " + resultat[1]);
		System.out.println("Antal treor: " + resultat[2]);
		System.out.println("Antal fyror: " + resultat[3]);
		System.out.println("Antal femmor: " + resultat[4]);
		System.out.println("Antal sexor: " + resultat[5]);

	}

}
