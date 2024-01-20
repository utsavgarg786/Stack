package Stack;

import java.util.Arrays;

public class NextGreaterElement {

	public static void main(String[] args) {

		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		int[] num = nextgreaterElement(nums1,nums2);
		System.out.println(Arrays.toString(num));
	}

	private static int[] nextgreaterElement(int[] nums1, int[] nums2) {

		int n1 = nums1.length;
		int n2 = nums2.length;
		for(int i =0 ; i <n1; i++) {
			int j=0;
			for(; j< n2-1; j++) {
				if(nums1[i] == nums2[j] && nums2[j] > nums2[j+1]) {
					nums1[i] = -1;
					break;
				}
				else if (nums1[i] == nums2[j] && nums2[j] < nums2[j+1]) {
					nums1[i] = nums2[j+1];
					break;
				}
			}
			if(nums1[i] == nums2[j]) {
				nums1[i] = -1; 
			}
		}
		System.out.println(nums1.length);
		return nums1;
	}
}
