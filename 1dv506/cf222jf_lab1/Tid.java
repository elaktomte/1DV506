package cf222jf_lab1;
import java.util.Scanner;

public class Tid {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("antal sekunder?");
		int tot_sekunder = sc.nextInt();
		int timmar= tot_sekunder/3600;
		int minuter= (tot_sekunder-(timmar*3600))/60;
		int sekunder= tot_sekunder-(timmar*3600)-(minuter*60);
		System.out.println("Sammanlagd tid är "+timmar+"timmar, "+minuter+"minuter och "+sekunder+"sekunder.");
		
		
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
