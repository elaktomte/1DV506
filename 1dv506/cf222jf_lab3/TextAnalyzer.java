package cf222jf_lab3;

public class TextAnalyzer  {
	private String string;
	private int chars = 0;
	private int whitespaces = 0;
	private int upperCases= 0;
	private int digits = 0;

	
	public TextAnalyzer(String str){
		string = str;
		
	}
	public int charCount(){
		chars = string.length();
		return chars;
		}
	public int whitespaceCount(){
		for (int i = 0 ; i < string.length(); i++){
			String sub = string.substring(i,i+1);
			if (sub.contains(" ")){
				whitespaces++;
			}
			
		}
	return whitespaces;
	}
	public int upperCaseCount(){
		for (int i = 0; i < string.length(); i++){
			if (Character.isUpperCase(string.charAt(i))){
				upperCases++;
			}
		}
		return upperCases;
	}
	public int digitCount(){
		for (int i = 0; i < string.length(); i++){
			if (Character.isDigit(string.charAt(i))){
				digits++;
			}
		}
		return digits;
	}
	public boolean containsChar(char ch){
		boolean answer = false;
		for (int i = 0; i < string.length(); i++){
			if (string.charAt(i) == ch){
			answer = true;
			}
		}
		return answer;
	}
	
	public boolean containsString(String str){
		boolean answer = false;
		if (string.contains(str)){
			answer = true;
			
		}
		return answer;
	}
	
	
}
