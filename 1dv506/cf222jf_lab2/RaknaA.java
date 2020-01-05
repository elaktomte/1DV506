package cf222jf_lab2;
import java.util.*;


public class RaknaA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mata in en textrad: ");
		String text = sc.nextLine();
		int na=0;
		int nA=0;
		for (int i=0; i<text.length(); i++){
			if (text.charAt(i)	=='a')
				na++;
			else if (text.charAt(i)	=='A')
				nA++;
			
			}	
	System.out.println("Antal a: "+na);
	System.out.println("Antal A: "+nA);
	sc.close();
	
	}
		// TODO Auto-generated method stub

	}
