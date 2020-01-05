package cf222jf_lab2;
import java.util.*;

public class Lonerevision {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Mata in lön, avsluta med X");
	
		String lon =scan.nextLine();
				
		while (lon != "X"){					//Loopen som fyller listan.
				if (lon.contains("X")){
					lista.sort(null);
					System.out.println(lista);
					break;
				}
				else {
					lista.add(Integer.parseInt(lon));
					System.out.println("Mata in lön, avsluta med X");
					lon = scan.nextLine();
				}
					
			}
		int median = 0;
		int medellon = 0;
		int spridning = lista.get(lista.size()-1) - lista.get(0);
		int summa = 0;
		
		for (int i = 0; i < lista.size(); i++){
			summa = summa + lista.get(i);
		}
		medellon = summa / lista.size();			// Medellönen
		
		
	
		
		if (lista.size()%2 == 1){
			median = lista.get(lista.size()/2);
			
		}
		if (lista.size()%2 == 0){		// Rättar till medianen vid jämnt antal.
			median = (lista.get(lista.size()/2) + lista.get(lista.size()/2-1))/2;
		}
		System.out.println("Medianen är: "+ median);					// skriver ut alla tal
		System.out.println("Medellönen är: " + medellon);
		System.out.println("Lönsespridningen är: " + spridning);
		

		scan.close();
			
		}

}		
		




