package cf222jf_lab2;
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Skriv in en text. ");
		//String text = scan.nextLine();
		String text = "A1n%n/a";
		String text2 = "";
		String text3 = "";
		
		for (int i = 0; i < text.length(); i++){
			if (Character.isLetter(text.charAt(i))){
				text3 = text3+text.charAt(i);
				
			}
		}
				
		for (int i = 0; i < text3.length(); i++){
			
			text2 = text2 + text3.charAt(text3.length()-i-1);
			}
		for (int i = 0; i < text2.length() ; i++){
			text3 = text3.toLowerCase();
			text2 = text2.toLowerCase();
		
			if (text3.charAt(i) != text2.charAt(i)){
				System.out.println("Detta är inget palindrom");
			
			}
				
		}
		System.out.println(text2);
		scan.close();
		
	}
}

