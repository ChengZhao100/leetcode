import java.util.*;

public class Solution{
	public List<List<Integer>> threeSum(int[] nums){
		Arrays.sort(nums);
		ArrayList<List<Integer>> res = new ArrayList<List<Integer>> ();
		for(int i=0; i<nums.length-2; i++){
			int start=i+1, end=nums.length-1;
			if(i==0 || nums[i]!=nums[i-1]){
				while(start<end){
					int sum=nums[start]+nums[end];
					if(sum+nums[i]==0){
						res.add(Arrays.asList(nums[i],nums[start],nums[end]));
						while(start<end && nums[end-1]==nums[end])
							end--;
						end--;
						while(start<end && nums[start+1]==nums[start])
							start++;
						start++;
						
					}
					if(sum+nums[i]>0){
						while(start<end && nums[end-1]==nums[end])
							end--;
						end--;
					}
					if(sum+nums[i]<0){
						while(start<end && nums[start+1]==nums[start])
							start++;
						start++;
					}
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args){
		Solution sol = new Solution();
		int[] nums={-1, 0, 1, 2, -1, -4};
		System.out.print(sol.threeSum(nums));
	}
}
