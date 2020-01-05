package cf222jf_lab2;
import java.util.*;


public class StorstaK {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mata in ett positivt heltal: ");
		int tal = scan.nextInt();
		//int tal = 12;		
		int K_tot = 0;
		int k = 0;
		for (int K = 0; K_tot<tal ; K=K+2){
			K_tot = K_tot + K;
			k = K;
	
			}
		
		System.out.println("Största värdet för K sådant att 0+2+4+6+...+K  < "+ tal + " är "+ (k-2));
		scan.close();

	}

}
