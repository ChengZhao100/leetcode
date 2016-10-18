package searchInsertPos;

//此题与search for range思路很像，重点参考那题discuss最高票的那个分析答案，最后肯定就剩下两个数，把所有情况都列出来

public class Solution{
	public int searchInsert(int[] nums, int target){
		int len=nums.length;
		if(len==0)
			return 0;
		int low=0, hi=len-1;
		while(low<=hi){
			int m=(low+hi)/2;
			if(nums[m]==target)
				return m;
			else if(nums[m]<target)
				low=m+1;
			else
				hi=m-1;
		}
		return low;
	}
}