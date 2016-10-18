import java.util.*;

public class Solution {
    public int[] twoSum(int target,int[] nums) {
    	HashMap<Integer,Integer> map = new HashMap<>();
    	int[] result = {-1,-1};
    	for(int i=0; i<nums.length; i++){
    		map.put(nums[i],i);
    		if(map.containsKey(target-nums[i])){
    			result[1] = i;
    			result[0] = map.get(target-nums[i]);
    			if(result[0] == result[1])
    				continue;
    			return result;
    		}
    	}
    	return result;
    }
}