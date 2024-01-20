package Stack;

import java.util.Stack;

public class Pallindrome {

	public static void main(String[] args) {

		String s= "ABCDCBA";
		boolean result = isPallindrome(s);
		System.out.println(result);
	}

	private static boolean isPallindrome(String s) {

		Stack<Character> stack = new Stack<>();
		int n = s.length();
		if(n == 1) {
			return false;
		}
		int i =0;
		for(; i< n/2 ; i++) {
			stack.push(s.charAt(i));
		}
		if(n%2 != 0) {
			i++;
		}
		for(; i < n; i++) {
			if(stack.pop() != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
