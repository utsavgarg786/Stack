package Stack;

import java.util.Arrays;
import java.util.Stack;

public class ImmediateSmallerElement {

	public static void main(String[] args) {

		int[] arr = {5,6,2,3,1,7};
		immediateSmallerElement(arr);
	}

	private static void immediateSmallerElement(int[] arr) {

		int n = arr.length;
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i< n; i++) {
			stack.push(arr[i]);
		}
		for(int i = n-2; i>=0; i--) {
			int a = stack.pop();
			if(a< arr[i]) {
				arr[i] =a;
			}
			else {
				arr[i] = -1;
			}
			arr[n-1] = -1;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * int n = arr.length; int i = 0; for(; i< n-1; i++) { if(arr[i] > arr[i+1]) {
		 * arr[i] = arr[i+1]; } else { arr[i] = -1; } } arr[i] = -1;
		 * System.out.println(Arrays.toString(arr));
		 */
	}
}
