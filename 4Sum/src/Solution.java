import java.util.*;

public class Solution{
	public List<List<Integer>> fourSum(int[] nums, int target){
		Arrays.sort(nums);
		ArrayList<List<Integer>> res = new ArrayList<List<Integer>> ();
		if(nums.length<4)
			return res;
		for(int i=0; i<nums.length-3; i++){
			if(i>0 && nums[i]==nums[i-1])
				continue;
			for(int j=i+1; j<nums.length-2; j++){
				if(j>i+1 && nums[j]==nums[j-1])
					continue;
				int start=j+1, end=nums.length-1;
				while(start<end){
					int sum=nums[i]+nums[j]+nums[start]+nums[end];
					if(sum==target){
						res.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
						while(start<end && nums[start]==nums[start+1])
							start++;
						while(start<end && nums[end]==nums[end-1])
							end--;
						if(start<end){
							start++;
							end--;
						}
					}
					if(sum>target){
						while(start<end && nums[end]==nums[end-1])
							end--;
						if(start<end){
							end--;
						}
					}
					if(sum<target){
						while(start<end && nums[start]==nums[start+1])
							start++;
						if(start<end){
							start++;
						}
					}
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args){
		Solution sol = new Solution();
//		int[] nums={5,5,3,5,1,-5,1,-2};
		int[] nums={5,5,3,1,-5,1};
		System.out.print(sol.fourSum(nums,4));
	}
}
