package searchRotatedSA;

//The idea is that when rotating the array, there must be one half of the array that is still in sorted order.

public class Solution{
	public int search(int[] nums, int target){
		int len=nums.length;
		int low=0, hi=len-1;
		while(low<=hi){
			int m=(low+hi)/2;
			if(nums[m]==target)
				return m;
			if(nums[m]<nums[hi]){
				if(target>nums[m] && target<=nums[hi])
					low=m+1;
				else
					hi=m-1;
			}
			if(nums[m]>=nums[low]){
				if(target<nums[m] && target>=nums[low])
					hi=m-1;
				else
					low=m+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		Solution sol = new Solution();
		int[] nums = {1};
		System.out.println(sol.search(nums,0));
	}
}
