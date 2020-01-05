package cf222jf_lab1;
import java.util.*;




public class Konvertera {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hur många grader Fahrenheit?");		// Frågar efter grader i Fahrenheit
		double f = sc.nextDouble();		// Tar input i Fahrenheit och sparar
		double c= (f-32) *5/9;
		double C = c*10;
		C=Math.round(C);		// Avrundning till 1 decimal
		C=C/10;
		
				
		System.out.println("Det blir "+C+" grader Celcius.");
		
		sc.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
