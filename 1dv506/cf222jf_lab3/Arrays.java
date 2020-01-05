package cf222jf_lab3;



public class Arrays {

	public static void main(String[] args) {
		int[] n = {5,1,3,9,2,2};
		System.out.println("Summan är "+ sum(n));
		String str = toString(n);
		System.out.println("n = " + str);
		int[] n2 = addN(n,2);
		str = Arrays.toString(n2);
		System.out.println(str);
		reverse(n);
		n2 = reverse(n);
		str = toString(n2);
		System.out.println(str);
		boolean test = hasN(n, 3);
		System.out.println(test);
		replaceAll(n2, 1, 9);
		System.out.println(toString(n2));
		n2 = sort(n);
		System.out.println(toString(n2));
		int[] n3 = {3,4,5};
		int[] n4 = {1,2,3,4,5};
		if (hasSubsequence(n4,n3 )){
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}



	}
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length ; i++){
			sum = sum + arr[i];
		}
		return sum;
	}
	public static String toString(int[] arr) {
		String string = "";
		for (int i = 0; i < arr.length ; i++){
			string = string + arr[i] + ",";
		}
		string = string.substring(0, string.length()-1);		// Formatterar bort kommatecken
		return string;

	}

	public static int[] addN(int[] arr, int n){
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++){
			arr2[i] = arr[i] + n;
		}
		return arr2;
	}
	public static int[] reverse(int[] arr){
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++){
			arr2[i] = arr[arr.length-i-1];
		}
		return arr2;
	}
	public static boolean hasN(int[] arr, int n){
		boolean result = false;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == n){
				result = true;
			}
		}
		return result;

	}
	public static void replaceAll(int[] arr, int old, int nw){
		for (int i = 0; i < arr.length ; i++){
			if (arr[i] == old){
				arr[i] = nw;

			}
		}
	}
	public static int[] sort(int[] arr){
		int[] arr2 = arr.clone();
		int temp = 0;
		int lowestindex = 0;
		for (int i = 0; i < arr2.length-1; i++){
			lowestindex = i;
			for (int j = i+1; j < arr2.length; j++){
				if (arr2[j] < arr2[lowestindex]){
					lowestindex = j;
				}
			}
			temp = arr2[i];
			arr2[i] = arr2[lowestindex];
			arr2[lowestindex] = temp;

		}
		return arr2;
	}
	
	public static boolean hasSubsequence(int[] arr, int[] sub){
		boolean svar = false;
		for (int i = 0; i < arr.length-2; i++){		// -2 eftersom dom 2 sista är ointressanta.
			if (arr[i] == sub[0]){
				if (arr[i+1]== sub[1] && arr[i+2] == sub[2]){
					svar = true;
				}
			}
		}
		
		return svar;
	}



}

