package cf222jf_lab3;

public class MultiDisplay {
	static String message;
	static int counter = 0;
	
	public void setDisplayMessage(String str){
		message = str;
	}
	public void setDisplayCount(int x){
		counter = x;
		
	}
	public String getDisplayMessage(){
		return message;
	}
	public int getDisplayCount(){
		return counter;
	}
	public void display(String str, int x){
		String message = str;
		int counter = x;
		for (int i = 0; i < counter; i++){
			System.out.println(message);
		}
	}
	public void display(){
		for (int i = 0 ; i < counter; i++){
			System.out.println(message);
			
		}
	}

}
