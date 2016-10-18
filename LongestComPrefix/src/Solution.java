import java.util.Arrays;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		int len=strs.length;
		if(len==0 || strs==null){
			return null;
		}
		String pre = strs[0];
		int i=1;
		while(i<len){
			while(strs[i].indexOf(pre)!=0)
				pre = pre.substring(0, pre.length()-1);
			i ++;
		}
		return pre;
	}
	
//	public String longestCommonPrefix(String[] strs) {
//	    if (strs == null) return null;
//	    if (strs.length == 0) return "";
//	    
//	    Arrays.sort(strs);
//	    char[] first = strs[0].toCharArray();
//	    char[] last  = strs[strs.length - 1].toCharArray();
//	     
//	    int i = 0, len = Math.min(first.length, last.length);
//	    while (i < len && first[i] == last[i]) i++;
//	    return strs[0].substring(0, i);
//	}
//	
	public static void main(String[] args){
		String[] strs = new String[]{"asd","aja","kkaz","ab","ajkk"};
		Arrays.sort(strs);
//		System.out.print(Arrays.toString(strs));
		Solution sol = new Solution();
		System.out.print(sol.longestCommonPrefix(strs));
	}
}
