package cf222jf_lab1;
import java.util.*;




public class TelefonNummer {

	public static void main(String[] args) {
		Random rand= new Random();
		String riktnummer= "0"+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(9); // Startar riktnummer med 0 och fyller på med 3 slumpmässiga
		String nummer = ""+rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10); // Sätter "" i början, annars registrera den inte den som string.
		String telefonnummer = riktnummer+"-"+nummer;
		
		System.out.println(telefonnummer);

		
		
		
		
		// TODO Auto-generated method stub

	}

}
