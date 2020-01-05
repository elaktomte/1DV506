package cf222jf_lab1;
import java.util.*;
import java.lang.Math;



public class Avstand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ange första punktens koordinater med kommatecken emellan");
		String punkt1 = sc.nextLine();
		System.out.println("Ange andra punktens koordinater med kommatecken emellan");
		String punkt2 = sc.nextLine();
		
		
		char x1 = punkt1.charAt(0);		//Sparar x1,x2,y1 och y2
		char y1 = punkt1.charAt(2);
		char x2 = punkt2.charAt(0);
		char y2 = punkt2.charAt(2);
		
		double avstand = Math.sqrt( Math.pow(x1-x2,2) + Math.pow(y1-y2,2));		//Formeln
		sc.close();
		double avstand2= avstand;
		avstand2= avstand2*1000;
		avstand2 = Math.round(avstand2);
		avstand2 = avstand2/1000;
		System.out.println("avståndet är " + avstand2);
		
		
		
	}

}
