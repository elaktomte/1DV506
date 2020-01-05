package cf222jf_lab4;
import java.util.*;

/*Ange storlek: 10
Ange max antal steg: 50
Ange antal slumpvandringar: 150
Av 150 onyktra personer, föll 14 (9.34%) i vattnet.
 */

public class DrunkenWalk {

	public static void main(String[] args) {
		int ramlade = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ange storlek: ");
		int storlek = scan.nextInt();
		System.out.println("Ange max antal steg: ");
		int steg = scan.nextInt();
		System.out.println("Ange antal slumpvandringar: ");
		int antal = scan.nextInt();
		
		scan.close();

		for (int i = 0; i < antal; i++){
			RandomWalk walk = new RandomWalk(steg,storlek,0,0);
			for (int j = 0; j < steg; j++){
				walk.takeStep();
			}
			if (walk.inBounds() == false){
				ramlade++;
			}
		}




		System.out.println("av "+antal+" onyktra personer föll "+ramlade+" i vattnet.");





	}

}
