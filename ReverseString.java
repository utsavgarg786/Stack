package Stack;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Utsav";
		reverseString(s);
	}

	private static void reverseString(String s) {

		int n = s.length()-1;
		char[] a = s.toCharArray();
		char temp;
		int start = 0;
		for(int i =n; i>=start; i--) {
			temp = a[start];
			a[start] = a[i];
			a[i] = temp;
			start ++;
		}
		System.out.println(a);
	}
}
