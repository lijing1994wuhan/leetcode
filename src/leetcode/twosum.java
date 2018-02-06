package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class twosum {
	public int[] twoSum(int[] nums, int target) {
	   /* for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target - nums[i]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	  1 solution  */
		
		   /* HashMap<Integer, Integer> map = new HashMap<>();
		    for (int i = 0; i < nums.length; i++) {
		        map.put(nums[i], i);
		    }
		    for (int i = 0; i < nums.length; i++) {
		        int complement = target - nums[i];
		        if (map.containsKey(complement) && map.get(complement) != i) {
		            return new int[] { i, map.get(complement) };
		        }
		    }
		    throw new IllegalArgumentException("No two sum solution");
		    2 solution */
		 HashMap<Integer, Integer> map = new HashMap<>();
		    for (int i = 0; i < nums.length; i++) {
		        int complement = target - nums[i];
		        if (map.containsKey(complement)) {
		            return new int[] { map.get(complement), i };
		        }
		        map.put(nums[i], i);
		    }
		    throw new IllegalArgumentException("No two sum solution");
		}
		
	
	
	public static void main(String[]args) {
		twosum a = new twosum();
		int[] b=new int[] {2,3,4};
		int[] c=new int[] {};
			c=a.twoSum(b,6);
		System.out.println(Arrays.toString(c));
	}
}
