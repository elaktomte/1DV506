package cf222jf_lab1;
import java.util.Scanner;



public class Vaxelpengar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Mottaget belopp: ");		
		int belopp= sc.nextInt();				//Sparar mottaget belopp
		System.out.print("Ange kostnad: ");
		int kostnad=sc.nextInt();				//Sparar kostnaden
		int vaxel=belopp-kostnad;				//Beräknar växeln
		int vaxel1000= vaxel/1000;
		int vaxel500=(vaxel-(vaxel1000*1000))/500;
		int vaxel100=(vaxel-(vaxel1000*1000)-(vaxel500*500))/100;
		int vaxel50=(vaxel-(vaxel1000*1000)-(vaxel500*500)-(vaxel100*100))/50;
		int vaxel10=(vaxel-(vaxel1000*1000)-(vaxel500*500)-(vaxel100*100)-(vaxel50*50))/10;
		int vaxel5= (vaxel-(vaxel1000*1000)-(vaxel500*500)-(vaxel100*100)-(vaxel50*50)-(vaxel10*10))/5;
		int vaxel1=(vaxel-(vaxel1000*1000)-(vaxel500*500)-(vaxel100*100)-(vaxel50*50)-(vaxel10*10)-(vaxel5*5));
			
		System.out.print("Växel tillbaka: "+vaxel);
		System.out.print("\n1000-lappar : "+(vaxel1000));
		System.out.print("\n500-lappar : "+vaxel500);
		System.out.print("\n100-lappar: "+vaxel100);
		System.out.print("\n50-lappar :"+vaxel50);
		System.out.print("\n10-kronor : "+vaxel10);
		System.out.print("\n5-kronor : "+vaxel5);
		System.out.print("\nenkronor : "+vaxel1);
		
		sc.close();
		
		
				
		
		
		
		// TODO Auto-generated method stub

	}

}
