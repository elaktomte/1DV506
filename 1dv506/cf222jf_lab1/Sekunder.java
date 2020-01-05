package cf222jf_lab1;
import java.util.Scanner;


public class Sekunder {

	public static void main(String[] args) {// TODO Auto-generated method stub
		System.out.println("antal timmar?");
		Scanner sc= new Scanner(System.in);
		int timmar= sc.nextInt();
		System.out.println("Minuter?");
		int minuter= sc.nextInt();
		System.out.println("Sekunder?");
		int sekunder= sc.nextInt();
		
		System.out.println("totalt antal sekunder "+((timmar*3600)+(minuter*60)+(sekunder)));
		sc.close();

	}

}
