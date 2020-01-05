package cf222jf_lab3;


public class Fraction {
	private int T;
	private int N;

	



	public Fraction(int t, int n){
		T = t;
		N = n;
		if (N == 0){
			System.out.println("The denominator cannot be 0, changing denominator to 1");
			N = 1;
			
		}
	
	}
	public String toString(){
		String s = ""+T+"/"+N;
		return s;
	}
	
	public int getNumerator(){
		return T;
	}
	public int getDenominator(){
		return N;
	}
	public boolean isNegative(){
		boolean answer = false;
		if (T/N < 0 ){
			answer = true;
		}
		return answer;
	}
	public Fraction add(Fraction f2){
		int n1 = N*f2.N;
		int t1 = T*f2.N;
		int t2 = f2.T*N;
		T = t1+t2;
		N = n1;
		
		return this;		
		
	}
	public Fraction subtract(Fraction f2){
		int n1 = N*f2.N;
		int t1 = T*f2.N;
		int t2 = f2.T*N;
		T = t1-t2;
		N = n1;
		
		return this;
	}

	public Fraction multiply(Fraction f2){
		T = T*f2.T;
		N = N*f2.N;
		return this;
	}
	
	public Fraction divide(Fraction f2){
		T = T+f2.N;
		N = N * f2.T;
		
		return this;
	}
	
	public boolean isEqualTo(Fraction f2){
		boolean answer = false;
		if (T/N == f2.T/f2.N){
			answer = true;
		}
		return answer;
	}
}
	
	
	
	
