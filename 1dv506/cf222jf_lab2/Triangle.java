package cf222jf_lab2;
import java.util.*;


public class Triangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mata in ett positivt, udda heltal.");
		int tal = scan.nextInt();
		
		StringBuilder text = new StringBuilder();
		int n1 = 0;
		if (tal % 2 == 0){			//Kontroll utav talet.
			System.out.println("Du måste skriva in ett udda heltal.");
			
		}
		else if (tal < 0){
			System.out.println("Du måste välja ett positivt tal.");
		}
		else
		{
			System.out.println("Rätvinklig triangel");
			for (int n = 0; n<=tal; n++){			// rätvinklig triangel via stringbuilder
				while (n1+n!=tal){
					text.append("*");
					n1++;
				}
				n1 = 0;
				System.out.println(text.toString());
				text.delete(0, text.length());			//Tömmer stringbuilder
			}
			System.out.println("Likbent triangel");
			text.delete(0, text.length());
			int c = tal/2;
			for (int n = 0; n < c+1; n++){			//Adderar mellanslagen i strängen
				String text2 = "";
				for(int j = 0; j < c-n; j++){
					text2 = text2 + " ";
				}
				for (int j = 0; j < 1+ n*2; j++){	//Adderar stjärnorna
					text2 = text2 + "*";
				}
				System.out.println(text2);
			}	
		}
			
	scan.close();
	}

}
