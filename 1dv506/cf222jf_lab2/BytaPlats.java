package cf222jf_lab2;

public class BytaPlats {

	public static void main(String[] args) {
		
		char[] text = { 't', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 
     			't', 't', 'e', 'D' };
		System.out.println(text);
		char temp;
		for (int i = 0; i < (text.length)/2; i++){
			temp = text[text.length-i-1];
			text[text.length-i-1] = text[i];
			text[i] = temp;
			
			
			
		}
		System.out.println(text);
		
		

	}

}
