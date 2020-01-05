package cf222jf_lab2;
import java.util.*;

public class NastStorsta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int storsta = Integer.MIN_VALUE;			
		int nastStorsta = Integer.MIN_VALUE;		//S�tter till min v�rdet f�r att hantera negativa tal
		
		for (int i=0; i<10; i++){				// Kollar igenom och sparar de h�gsta talen.
			System.out.println("Mata in ett heltal. Heltal "+(i+1)+"/10.");
			int tal = scan.nextInt();
			
			if (tal > storsta && tal > nastStorsta){		// Sparar h�gsta v�rdet till n�st h�gsta
				nastStorsta = storsta;
			}
			
			if (tal > storsta){
				storsta = tal;
			}
			else if (tal > nastStorsta && tal < storsta ){		//kontrollerar n�st h�gsta talet.
				nastStorsta = tal;
			}
		}
		System.out.println("N�st st�rsta �r " + nastStorsta);
		scan.close();
	}

}
