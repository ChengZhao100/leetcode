package groupAnagrams;
import java.util.*;

public class Solution{
	public List<List<String>> groupAnagrams(String[] strs){
		HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
		for(String s:strs){
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String keyStr = String.valueOf(ca);
			if(!map.containsKey(keyStr))
				map.put(keyStr,new ArrayList<String>());
			map.get(keyStr).add(s);
		}
		for(String key:map.keySet())
			Collections.sort(map.get(key));
		return new ArrayList<List<String>> (map.values());
	}
	
	public static void main(String[] args){
		Solution sol = new Solution();
		String s[]  = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.print(sol.groupAnagrams(s));
		
	}
}
