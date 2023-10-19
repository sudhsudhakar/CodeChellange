package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GFG {
	static String largest(ArrayList<Integer> l) {
		ArrayList<String> lst = new ArrayList<String>();
		Collections.sort(l);
		do {
			String s = "";
			for (int i = 0; i < l.size(); i++) {
				s += Integer.toString(l.get(i));
			}
			lst.add(s);
		} while (nextPermutation(l));
		return Collections.max(lst);
	}

	static boolean nextPermutation(ArrayList<Integer> nums) {
		int i = nums.size() - 2;
		while (i >= 0 && nums.get(i) >= nums.get(i + 1)) {
			i--;
		}
		if (i < 0) {
			return false;
		}

		int j = nums.size() - 1;
		while (nums.get(j) <= nums.get(i)) {
			j--;
		}

		Collections.swap(nums, i, j);
		Collections.reverse(nums.subList(i + 1, nums.size()));
		return true;
	}

	public static void main(String[] args) {
		ArrayList<Integer> v = new ArrayList<Integer>(Arrays.asList(54, 546, 548, 60));
		System.out.println(largest(v));
	}
}
