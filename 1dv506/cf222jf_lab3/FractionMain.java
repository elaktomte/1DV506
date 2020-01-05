package cf222jf_lab3;

public class FractionMain {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(2,2);
		Fraction f2 = new Fraction(2,2);
		Fraction f3 = new Fraction(-1,0);
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		if (f1.isEqualTo(f2)){
			System.out.println("They are equal");
		}
		if (f3.isNegative()){
			System.out.println("The fraction is negative");
		}
		System.out.println(f2.getDenominator());
		System.out.println(f3.getNumerator());
		System.out.println(f1.add(f2));
		System.out.println(f1.divide(f2));
		System.out.println(f2.subtract(f1));
		System.out.println(f1.multiply(f2));
		

	}

}
