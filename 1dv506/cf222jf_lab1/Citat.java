package cf222jf_lab1;
import java.util.Scanner;

public class Citat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("skriv in texten");
		Scanner sc= new Scanner(System.in);
		String text= sc.nextLine();
		System.out.println('"'+text+'"');
		sc.close();
	}

}
