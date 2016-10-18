package searchInsertPos;

//������search for range˼·�����ص�ο�����discuss���Ʊ���Ǹ������𰸣����϶���ʣ����������������������г���

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