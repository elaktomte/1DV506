package cf222jf_lab4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class RaknaTecken {

	public static void main(String[] args) {
		//File file = new File(args[0]);
		File file = new File(args[0]);
		int uppercase = 0;
		int lowercase = 0;
		int whitespace = 0;
		int other = 0;
		try{
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()){
				String line = scan.nextLine();
				whitespace++;
				for (int i = 0; i < line.length(); i++){
					if (Character.isUpperCase(line.charAt(i))) {
						uppercase++;
					}
					else if (Character.isLowerCase(line.charAt(i))){
						lowercase++;
					}
					else if (Character.isWhitespace(line.charAt(i))){
						whitespace++;
					}
					else {
						other++;
					}
				}
			}
			System.out.println("Uppercase	: "+uppercase);	
			System.out.println("Lowercase	: "+lowercase);
			System.out.println("Whitespace	: "+(whitespace-1));	
			System.out.println("Other		: "+other);	
			
			scan.close();
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		
		
	}

}
