package cf222jf_lab1;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ange din l�ngd");
		Scanner sc= new Scanner(System.in);
		double langd= sc.nextDouble();
		System.out.println("Ange din vikt");
		double vikt = sc.nextDouble();
		double bmi= vikt/(langd*langd);
		int bmi_heltal= (int) bmi;
		System.out.println("Ditt BMI v�rde �r "+bmi_heltal);
		sc.close();
		
	}

}
