package Stack;

import java.util.Stack;

public class MaximumDepth {

	public static void main(String[] args) {

		String s = "(((X))(((Y))))";
		int count = maxDepth(s);
		System.out.println(count);
	}

	private static int maxDepth(String s) {
		
		Stack<Character> stack = new Stack<>();
		int count = 0;
		int n = s.length();
		for(int i =0; i< n; i++) {
			if(s.charAt(i) == '(') {
				stack.push(s.charAt(i));
				if(count<stack.size()) {
					count = stack.size();
				}
			}
			else if(s.charAt(i) == ')'){
				stack.pop();
			}
		}
		return count;
		/*
		 * int count = 0; Stack<Character> stack = new Stack<>(); int n = s.length();
		 * for (int i = 0; i < n; i++) { if (s.charAt(i) == '(') {
		 * stack.push(s.charAt(i)); } else if (s.charAt(i) == ')') { if (count <
		 * stack.size()) { count = stack.size(); } stack.pop(); } } return count;
		 */
	}
}
