package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class DeleteMiddleElement {

	public static void main(String[] args) {

		int[] a = {10,20,30,40,50,60,70};
		deleteMiddle(a);
	}

	private static void deleteMiddle(int[] s) {

		List<Integer> list = new ArrayList<>();
		int n = s.length;
		Stack<Integer> stack = new Stack<>();
		int i = 0;
		for(; i< n/2; i++) {
			stack.push(s[i]);
		}
		if(n%2 != 0) {
			i++;
			stack.push(s[i]);
		}
		stack.pop();
		while(!stack.isEmpty()) {
			list.add(stack.pop());
		}
		for(; i<n; i++) {
			list.add(s[i]);
		}
		Collections.sort(list);
		System.out.println(list);
	}
}
