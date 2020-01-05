package cf222jf_lab4.sorter_orter;

public class Ort implements Comparable<Ort>{
	public String pnr;
	public String ortNamn;


	public Ort(String postNummer, String namn){
		pnr = postNummer;
		ortNamn = namn;

	}
	public Ort(){
		
	}



	
	public String toString(){
		String string = ""+pnr+" "+ortNamn;
	
	return string;
	}



	@Override
	public int compareTo(Ort o2) {
		// TODO Auto-generated method stub
		
		return pnr.compareTo(o2.pnr);
	}

}
