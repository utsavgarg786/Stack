package Stack;

import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
		String s = "[{()()}]";
		boolean ans = isParenthesisBalanced(s);
		System.out.println(ans);
	}

	private static boolean isParenthesisBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		int n = s.length();
		for(int i = 0; i< n; i++) {
			char a = s.charAt(i);
			if(a == '[' || a == '{' || a == '(') {
				stack.push(a);
				continue;
			}
			if(stack.isEmpty()) {
				return false;
			}
			char popChar;
			switch(a) {
			case ')':
				popChar = stack.pop();
				if(popChar == '[' || popChar == '{') {
					return false;
				}
			break;	
			case '}':
				popChar = stack.pop();
				if(popChar == '[' || popChar == '(') {
					return false;
				}
			break;	
			case ']':
				popChar = stack.pop();
				if(popChar == '(' || popChar == '{') {
					return false;
				}	
			break;	
			}
		}
		if(!stack.isEmpty()) {
			return false;
		}
		return true;
	}
}
