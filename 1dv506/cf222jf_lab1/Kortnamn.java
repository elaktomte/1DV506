package cf222jf_lab1;
import java.util.*;

public class Kortnamn {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Förnamn? ");
		String fornamn = sc.nextLine();
		System.out.println("Efternamn? ");
		String efternamn= sc.nextLine() + "    ";  // Sätter 4 mellanslag efter för att förlänga strängen till minst 4 tecken.
		
		
		
		
	
		String kortnamn= fornamn.substring(0,1)+ ". " + efternamn.substring(0,4);		//Klipper ihop första bokstaven från första strängen och de första 4 i andra strängen.
		
		
		System.out.println("Förnamn: " + fornamn);
		System.out.println("Efternamn: " + efternamn);
		System.out.println("Kortnamn: " + kortnamn);
		
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
