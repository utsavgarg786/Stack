package Stack;

public class Test1 {
	
	public static void main(String[] args) {
		int a =16;
		convertDecimalToBinary(a);
		
		int b =16;
		convertDecimalToBinary1(b);
		
		int n = 101;
		convertBinaryToDecimal(n);
		
		String c ="101";
		convertBinaryToDecimal1(c);
	}

	private static void convertDecimalToBinary1(int b) {

		String x = "";
		int count = 0;
		while(b>0) {
			int n = b&1;
			if(n == 1) {
				count++;
			}
			x = n+x;
			b= b >> 1;
		}
		System.out.println(count);
		System.out.println(x);
	}

	private static void convertBinaryToDecimal1(String n) {

		int decimal = 0;
		int p = 0;
		for(int i = n.length() -1; i>= 0; i--) {
			if(n.charAt(i) == '1') {
				decimal = (int) (decimal + 1 * Math.pow(2, p));
			}
			p++;
		}
		System.out.println(decimal);
	}

	private static void convertBinaryToDecimal(int n) {

		int decimal = 0;
		int p =0;
		while(n>0) {
			int a = n%10;
			decimal = (int) (decimal + a * Math.pow(2, p));
			p++;
			n = n/10;
		}
		System.out.println(decimal);
	}

	private static void convertDecimalToBinary(int n) {

		String x = "";
		int count =0;
		while (n > 0) {
			int b = n % 2;
			if (b == 1) {
				count++;
			}
			x = b + x;
			n = n / 2;
		}
		System.out.println(count);
		System.out.println(x);
	}

}
