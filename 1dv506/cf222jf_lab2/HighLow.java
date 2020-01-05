package cf222jf_lab2;
import java.util.*;


public class HighLow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int n = 1;
		System.out.println("Skriv in ett heltal mellan 1 och 100. ");
		int gissning = scan.nextInt();
		int svar = rand.nextInt(101);
		System.out.println("Gissning: "+n+": "+gissning);
		
		
		while (gissning != svar) {
			if (gissning < svar){
				System.out.println(" Högre ");
				n++;
				System.out.println("Gissning "+n);
				gissning = scan.nextInt();
			}
			else if (gissning > svar){
				System.out.println("Lägre");
				n++;
				System.out.println("Gissning "+n);
				gissning = scan.nextInt();
			}
					
		}
		System.out.println("Grattis, du gissade rätt efter "+n+" gissningar.");
		scan.close();
	}

}
