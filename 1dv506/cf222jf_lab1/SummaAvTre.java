package cf222jf_lab1;
import java.util.Scanner;

public class SummaAvTre {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ange ett 3-siffrigt tal");
		int tal= sc.nextInt();
		int siffra1= tal/100;
		int siffra2= (tal/10)%10;
		int siffra3=tal%10;
		
		System.out.println("Summan av siffrorna är :"+(siffra1+siffra2+siffra3));
		sc.close();
	
		
		// TODO Auto-generated method stub

	}

}
