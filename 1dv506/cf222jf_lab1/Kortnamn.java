package cf222jf_lab1;
import java.util.*;

public class Kortnamn {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("F�rnamn? ");
		String fornamn = sc.nextLine();
		System.out.println("Efternamn? ");
		String efternamn= sc.nextLine() + "    ";  // S�tter 4 mellanslag efter f�r att f�rl�nga str�ngen till minst 4 tecken.
		
		
		
		
	
		String kortnamn= fornamn.substring(0,1)+ ". " + efternamn.substring(0,4);		//Klipper ihop f�rsta bokstaven fr�n f�rsta str�ngen och de f�rsta 4 i andra str�ngen.
		
		
		System.out.println("F�rnamn: " + fornamn);
		System.out.println("Efternamn: " + efternamn);
		System.out.println("Kortnamn: " + kortnamn);
		
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
