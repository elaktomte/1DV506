package cf222jf_lab1;
import java.util.*;




public class TelefonNummer {

	public static void main(String[] args) {
		Random rand= new Random();
		String riktnummer= "0"+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(9); // Startar riktnummer med 0 och fyller p� med 3 slumpm�ssiga
		String nummer = ""+rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10); // S�tter "" i b�rjan, annars registrera den inte den som string.
		String telefonnummer = riktnummer+"-"+nummer;
		
		System.out.println(telefonnummer);

		
		
		
		
		// TODO Auto-generated method stub

	}

}
