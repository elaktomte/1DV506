package cf222jf_lab2;
import java.util.*;


public class Baklanges {
	

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Mata in en textrad.");
		String text = scan.nextLine();
		//String text ="Gurka BengT";   	Teststr�ng
		StringBuilder nytext = new StringBuilder();		//Skapar str�ngen som vi ska anv�nda oss av.
		for (int i = text.length(); i>0; i--){
			char c = text.charAt(i-1);		//H�mtar bokst�verna fr�n texten.
			nytext.append(c);
			}
		scan.close();
		String texten	= 	nytext.toString();
		System.out.println(texten);
		}
		

	}


