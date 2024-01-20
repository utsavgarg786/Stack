package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementUsingStack {

	public static void main(String[] args) {

		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		int[] num = nextgreaterElement(nums1,nums2);
		System.out.println(Arrays.toString(num));
	}

	private static int[] nextgreaterElement(int[] nums1, int[] nums2) {

		Stack<Integer> stack = new Stack<>();
		stackfill(stack, nums2);
		int previous =-1;
		for(int i = 0; i< nums1.length; i++) {
			if(nums1[i] == stack.peek()) {
				nums1[i] = previous;
			}
			else {
				while(!stack.isEmpty()) {
					previous = stack.pop();
					if(nums1[i] == stack.peek() && nums1[i] < previous) {
						nums1[i] = previous;
					}
				}
			}
			stackfill(stack, nums2);
		}
		return nums1;
	}

	private static void stackfill(Stack<Integer> stack, int[] nums2) {

		for(int i = 0; i< nums2.length; i++) {
			stack.push(nums2[i]);
		}
	}

}
