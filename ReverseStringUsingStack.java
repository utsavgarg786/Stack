package Stack;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {

		String s = "Utsav Garg";
		reverse(s);
	}

	private static void reverse(String s) {
		
		String a = "";
		Stack<Character> stack = new Stack<>();
		int n = s.length();
		for(int i = 0; i<n ; i++) {
			stack.push(s.charAt(i));
		}
		while(!stack.isEmpty()) {
			a = a + stack.pop();
		}
		System.out.println(a);
	}
}
