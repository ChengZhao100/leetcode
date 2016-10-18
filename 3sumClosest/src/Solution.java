import java.util.*;

public class Solution{
	public int threeSumClosest(int[] nums, int target){
		int result=nums[0]+nums[1]+nums[2];
		Arrays.sort(nums);
		for(int i=0; i<nums.length-2; i++){
			int start=i+1, end=nums.length-1;
			while(start<end){
				int sum=nums[i]+nums[start]+nums[end];
				if(sum>target)
					end--;
				else
					start++;
				if(Math.abs(sum-target)<Math.abs(result-target))
					result=sum;
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		Solution sol = new Solution();
		int[] nums={-1,2,1,-4};
		System.out.print(sol.threeSumClosest(nums,1));
	}
}
