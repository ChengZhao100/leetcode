package removeDuplicates;

public class Solution{
	public int removeDuplicates(int[] nums){
		int len=nums.length;
		int num=0;
		if(len==0)
			return 0;
		for(int i=0; i<nums.length; i++){	
			if(i==0 || nums[i]!=nums[i-1]){
				nums[num] = nums[i];
				num++;
			}
		}
		return num;
	}
	
	public static void main(String[] args){
		Solution sol = new Solution();
		int[] nums={1,1,1,1,1,2};
		System.out.print(sol.removeDuplicates(nums));
	}
}
