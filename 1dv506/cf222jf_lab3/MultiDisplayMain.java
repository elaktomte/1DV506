package cf222jf_lab3;


public class MultiDisplayMain {

	public static void main(String[] args) {
		MultiDisplay md = new MultiDisplay();
		
		md.setDisplayMessage("Fiskbil");
		md.setDisplayCount(5);
		md.display();                           // ==> print-out
				
		md.display("Du luktar sill", 4);  // ==> print-out
				
		System.out.println("Current Message: "+ md.getDisplayMessage());

	}

}
