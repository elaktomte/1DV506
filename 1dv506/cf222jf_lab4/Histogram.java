package cf222jf_lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Histogram {


	public static void main(String[] args) {
		File file = new File(args[0]);
		int tio = 0;
		int tjugo = 0;
		int trettio = 0;
		int fyrtio = 0;
		int femtio = 0;
		int sextio = 0;
		int sjuttio = 0;
		int åttio = 0;
		int nittio = 0;
		int hundra = 0;
		int övriga = 0;

		try {
			Scanner scan = new Scanner(file);
			ArrayList<Integer> lista = new ArrayList<Integer>();
			while (scan.hasNext()){
				int heltal = scan.nextInt();
				lista.add(heltal);
			}
			scan.close();
			for (int i = 0; i < lista.size(); i++){
				if (lista.get(i) > 0 && lista.get(i) <=10){
					tio++;	
				}
				else if (lista.get(i) > 10 && lista.get(i) <=20){
					tjugo++;
				}
				else if (lista.get(i) > 20 && lista.get(i) <=30){
					trettio++;
				}
				else if (lista.get(i) > 30 && lista.get(i) <=40){
					fyrtio++;
				}
				else if (lista.get(i) > 40 && lista.get(i) <=50){
					femtio++;
				}
				else if (lista.get(i) > 50 && lista.get(i) <=60){
					sextio++;
				}
				else if (lista.get(i) > 60 && lista.get(i) <=70){
					sjuttio++;
				}
				else if (lista.get(i) > 70 && lista.get(i) <=80){
					åttio++;
				}
				else if (lista.get(i) > 80 && lista.get(i) <=90){
					nittio++;
				}
				else if (lista.get(i) > 90 && lista.get(i) <=100){
					hundra++;
				}
				else if (lista.get(i) <= 0  || lista.get(i) > 100){
					övriga++;
				}
			}
			int summa = tio+tjugo+trettio+fyrtio+femtio+sextio+sjuttio+åttio+nittio+hundra;
			System.out.println("Läser filen från "+args[0]);
			System.out.println("Antal i intervallet [1,100] "+summa);
			System.out.println("övriga  "+övriga);
			System.out.println("Histogram");
			StringBuilder stars = new StringBuilder();
			for (int i = 1; i <= tio; i++){
				stars.append('*');
				if (i == tio){
					System.out.println("1 - 10	|"+stars.toString());
					stars.delete(0, stars.length()-1);
				}
			}
			for (int i = 1; i <= tjugo; i++){
					stars.append('*');
					if (i == tjugo){
						System.out.println("11 - 20	|"+stars.toString());
						stars.delete(0, stars.length()-1);
					}
			}
			for (int i = 1; i <= trettio; i++){
				stars.append('*');
				if (i == trettio){
					System.out.println("21 - 30	|"+stars.toString());
					stars.delete(0, stars.length()-1);
				}
		}
			for (int i = 1; i <= fyrtio; i++){
				stars.append('*');
				if (i == fyrtio){
					System.out.println("31 - 40	|"+stars.toString());
					stars.delete(0, stars.length()-1);
				}
		}
			for (int i = 1; i <= femtio; i++){
				stars.append('*');
				if (i == femtio){
					System.out.println("41 - 50	|"+stars.toString());
					stars.delete(0, stars.length()-1);
				}
		}
			for (int i = 1; i <= sextio; i++){
				stars.append('*');
				if (i == sextio){
					System.out.println("51 - 60	|"+stars.toString());
					stars.delete(0, stars.length()-1);
				}
		}
			for (int i = 1; i <= sjuttio; i++){
				stars.append('*');
				if (i == sjuttio){
					System.out.println("61 - 70	|"+stars.toString());
					stars.delete(0, stars.length()-1);
				}
		}
			for (int i = 1; i <= åttio; i++){
				stars.append('*');
				if (i == åttio){
					System.out.println("71 - 80	|"+stars.toString());
					stars.delete(0, stars.length()-1);
				}
		}
			for (int i = 1; i <= nittio; i++){
				stars.append('*');
				if (i == nittio){
					System.out.println("81 - 90	|"+stars.toString());
					stars.delete(0, stars.length()-1);
				}
		}
			for (int i = 1; i <= hundra; i++){
				stars.append('*');
				if (i == hundra){
					System.out.println("91 - 100|"+stars.toString());
					stars.delete(0, stars.length()-1);
				}
		}
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}



	}


}

