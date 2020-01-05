package cf222jf_lab1;
import java.util.*;


public class VindAvkylning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vad är lufttemperaturen? ");
		double temp = sc.nextDouble();
		System.out.println("Hur hög är vindhastigheten i m/s ? ");
		double hastighet = sc.nextDouble();
		
		
		sc.close();
		double upplevdkyla = 33+(temp-33)*(0.474+(0.454*Math.sqrt(hastighet)-0.0454*hastighet));		//Siples formel
		double kyla = Math.round(upplevdkyla);		//Avrundar formeln till heltal.
		System.out.println("Upplevd temperatur är: "+ kyla +" grader." );
		

	}

}
