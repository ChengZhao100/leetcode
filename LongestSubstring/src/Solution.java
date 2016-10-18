import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s){
    	int max = 0;
    	HashSet<Character> set = new HashSet<Character>();
    	int walker = 0;
    	int runner = 0;
    	while(runner < s.length()){
    		if(set.contains(s.charAt(runner))){
    			if(max < runner -walker)
    				max = runner - walker;
    			while(s.charAt(walker) != s.charAt(runner)){
    				set.remove(s.charAt(walker));
    				walker ++;//这个循环就是重新定义walker的位置，这时候已经有一个重复了，之前的char都是没用的，就算后面有相同的，中间包含这个节点也不合适。ps:注意runner的开始位置
    			}
    			walker ++;
    		} else{
    			set.add(s.charAt(runner));
    		}
    		runner ++;
    	}
    	max = Math.max(max,runner-walker);
    	return max;
    }
    
    public static void main(String[] args){
    	Solution sol = new Solution();
    	System.out.print(sol.lengthOfLongestSubstring("aasdfsdf"));
    }
}