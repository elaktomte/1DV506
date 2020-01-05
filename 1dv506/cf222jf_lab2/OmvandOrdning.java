package cf222jf_lab2;
import java.util.Scanner;
import java.util.ArrayList;


public class OmvandOrdning {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mata in ett positivt heltal.");
		int tal = scan.nextInt();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		
		
		
		while (tal >= 0){			// Fyller på listan
				lista2.add(tal);
				System.out.println("Mata in ett positivt heltal.");
				tal = scan.nextInt();
				
				}
		if (tal < 0 ){			// Byter plats på heltalen i listan.
			for (int j = 0; j < (lista2.size()) ; j++){
				System.out.println(lista2.get(lista2.size()-j-1));
				
			
				}
		
			}
		scan.close();
		
		}

	}
