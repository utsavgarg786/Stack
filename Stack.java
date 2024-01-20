package Stack;

import java.util.Arrays;

public class Stack {

	private int size;
	private Object[] stackArray;
	private int top;
	
	public Stack(int size) {

		this.size=size;
		top= -1;
		stackArray = new Object[size];
	}
	
	@Override
	public String toString() {
		return "Stack [size=" + size + ", stackArray=" + Arrays.toString(stackArray) + ", top=" + top + "]";
	}


	public void push(Object value) {
		if(top == size-1) {
			System.out.println("Stack is full");
		}
		top++;
		stackArray[top] = value;
	}
	
	public Object pop() {

		if(top == -1) {
			System.out.println("Stack is empty");
			return stackArray[0];
		}
		int oldTop = top;
		top --;
		stackArray[oldTop] = null;
		return stackArray[oldTop];
		
	}
	
	public static void main(String[] args) {

		Stack stack = new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
	}

}
