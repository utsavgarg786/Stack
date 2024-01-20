package Stack;

import java.util.Stack;

public class DeleteMiddleUsingStack {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		//stack.push(50);
		System.out.println(stack);
		deleteMiddle(stack);
	}

	private static void deleteMiddle(Stack<Integer> stack) {

		Stack<Integer> tempStack = new Stack<>();
		int n = stack.size();
		int i =0;
		for(; i< n/2;i++) {
			int a = stack.pop();
			tempStack.push(a);
			//stack.pop();
		}
		stack.pop();
		while(!tempStack.isEmpty()) {
			int b = tempStack.pop();
			stack.push(b);
		}
		System.out.println(stack);
	}
}
