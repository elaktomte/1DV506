package cf222jf_lab3;

public class Pnr {

	public static void main(String[] args) {
		String pnr1 = "900126-1073";
		String pnr2 = "890126-5526";
		String pnr3 = "900126-1073";
				
		System.out.println(pnr1);
		System.out.println(getFirstPart(pnr1));
		System.out.println(getSecondPart(pnr1));
		System.out.println(isFemaleNumber(pnr1));
		System.out.println(isMaleNumber(pnr1));
		System.out.println(isEqual(pnr1 , pnr3));
		System.out.println(isCorrect(pnr1));
		
	
	}

	public static String getFirstPart(String str){
		String string = str.substring(0, 6);
		
		return string;
	}
	public static String getSecondPart(String str){
		String string = str.substring(7,11);
		return string;
	}
	public static boolean isFemaleNumber(String str){
		boolean answer = false;
		if (str.charAt(10)%2 == 0){
			answer = true;
			
		}
		return answer;
	}
	public static boolean isMaleNumber(String str){
		boolean answer = false;
		if (str.charAt(10)%2 == 1){
			answer = true;
			
		}
		return answer;
	}
	
	public static boolean isEqual(String str, String str2){
		boolean answer = false;
		if (str == str2){
			answer = true;
		}
		return answer;
	}
	public static boolean isCorrect(String str){
		boolean answer = false;
		String pnr = str.substring(0,6) + str.substring(7,11);
		int sum = 0;
		for (int i = 0; i < pnr.length(); i++){
			if (i % 2 == 0){
				int number = pnr.charAt(i);
				sum = sum + (number*2);
			}
			else {
				int number2 = pnr.charAt(i);
				sum = sum + number2;
			}
			
		}
		System.out.println(sum);
		if (sum % 10 != 0){
			answer = false;
		}
		return answer;
	}

}
