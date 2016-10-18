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
    				walker ++;//���ѭ���������¶���walker��λ�ã���ʱ���Ѿ���һ���ظ��ˣ�֮ǰ��char����û�õģ������������ͬ�ģ��м��������ڵ�Ҳ�����ʡ�ps:ע��runner�Ŀ�ʼλ��
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