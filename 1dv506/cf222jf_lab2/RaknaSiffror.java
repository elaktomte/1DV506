package cf222jf_lab2;


import java.util.Scanner;
public class RaknaSiffror {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mata in ett heltal." );
		int tal = scan.nextInt();
		//int tal = 361002;
		int noll = 0;
		int j = 0;
		int u = 0;
		String talet = ""+tal;		//konverterar till sträng för att använda längden
		
		
		for (int i = 0; i < talet.length(); i++ ){
			char c = talet.charAt(i);
			if (c % 2==1){
				u++;
			}
			else if (c % 2 == 0 && c != '0'){		//kontroller jämna och skiljer på nollor
				j++;
			}
			else if (c == '0'){
				noll++;
			}
				
			
		}
		System.out.println("Jämna Siffror: "+j);
		System.out.println("Udda siffror: "+u);
		System.out.println("Nollor : "+noll);
		scan.close();
		

	}
}


