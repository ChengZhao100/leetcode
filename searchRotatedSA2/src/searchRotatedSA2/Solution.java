package searchRotatedSA2;

public class Solution{
	public boolean search(int[] nums, int target){
		int len=nums.length;
		int low=0, hi=len-1;
		while(low<=hi){
			int m=(low+hi)/2;
			if(nums[m]==target)
				return true;
			if(nums[m]>nums[low]){
				if(target<nums[m] && target>=nums[low])
					hi=m-1;
				else
					low=m+1;
			} else if(nums[m]<nums[low]){
				if(target>nums[m] && target<=nums[hi])
					low=m+1;
				else
					hi=m-1;
			} else
				low ++;
		}
		return false;
	}
}