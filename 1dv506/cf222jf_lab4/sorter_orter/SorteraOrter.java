package cf222jf_lab4.sorter_orter;
import java.util.*;
import java.io.*;



public class SorteraOrter {

	public static void main(String[] args) {
		try{
			ArrayList<String> orter = new ArrayList<String>();
			Ort ort = new Ort();
			File file = new File("C:/temp/orter.txt");
			Scanner scan = new Scanner(file);
			int antalOrter = 0; 
			while (scan.hasNext()){
				String line = scan.nextLine();
				for (int i = 0 ; i < line.length(); i++){
					if (line.charAt(i) == ';'){
						ort.ortNamn = line.substring(0, i);
						ort.pnr =line.substring(i+1, line.length());
					}
				}
				orter.add(ort.toString());
				antalOrter++;
				
				
				}
			Collections.sort(orter);
			System.out.println("Läser in från "+file);
			System.out.println("Antal orter: "+antalOrter);
			
			for (int i = 0; i < orter.size(); i++){
				String orten = orter.get(i);
				System.out.println(orten.toString());
			}
			
			
			scan.close();
				
			



		}

		catch (FileNotFoundException e){
			e.printStackTrace();

		}
	}
}
