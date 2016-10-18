import java.util.Arrays;
//import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args){
		int targ = 6;
		int[] nums = {3,2,4};
		Solution sol = new Solution();
		int[] result = new int[2];
		result = sol.twoSum(targ, nums);
		System.out.println(Arrays.toString(result));
	}
}
