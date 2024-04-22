package wiproproject;
import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2,5,8,9,7,3,4};
		int target = 10;
		
		for(int i = 0;i<nums.length;i++) {
			for(int j = i+1;j<nums.length;j++) {
				if(nums[i]+nums[j] == target) {
					System.out.println(nums[i]+ " , "+nums[j]);
				}
			}
		}
	}
}

       



