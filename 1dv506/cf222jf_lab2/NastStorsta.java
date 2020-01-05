package cf222jf_lab2;
import java.util.*;

public class NastStorsta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int storsta = Integer.MIN_VALUE;			
		int nastStorsta = Integer.MIN_VALUE;		//Sätter till min värdet för att hantera negativa tal
		
		for (int i=0; i<10; i++){				// Kollar igenom och sparar de högsta talen.
			System.out.println("Mata in ett heltal. Heltal "+(i+1)+"/10.");
			int tal = scan.nextInt();
			
			if (tal > storsta && tal > nastStorsta){		// Sparar högsta värdet till näst högsta
				nastStorsta = storsta;
			}
			
			if (tal > storsta){
				storsta = tal;
			}
			else if (tal > nastStorsta && tal < storsta ){		//kontrollerar näst högsta talet.
				nastStorsta = tal;
			}
		}
		System.out.println("Näst största är " + nastStorsta);
		scan.close();
	}

}
