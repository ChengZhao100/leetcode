class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j] == target-nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        
        throw new IllegalArgumentException("no such a solution");
    }
}

public class TwoSum {
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.twoSum([1,3,4,7,9], 7));
    }
}