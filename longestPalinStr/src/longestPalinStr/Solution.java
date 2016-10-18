package longestPalinStr;

public class Solution {
	int lo=0, max=0;
	public String longestPalindrome(String s) {
		int len = s.length();
		if(s == null || len < 2)
			return s;
		for(int i=0; i<=len-2; i++){
			extendPalin(s,i,i);
			extendPalin(s,i,i+1);
		}
		return s.substring(lo,lo+max);
	}  
	
	public void extendPalin(String s, int j,int k){
		while(j >= 0 && k <= s.length()-1 && s.charAt(j) == s.charAt(k)){
			j --;
			k ++;
		}
		if(max < k-j-1){
			max = k-j-1;
			lo = j+1;
		}
	}
	
//	public String longestPalindrome(String s){
//		if(s == null || s.length() < 2)
//			return s;
//		String res = "";
//		int max = 0;
//		boolean[][] palin = new boolean[s.length()][s.length()];
//		for(int i=s.length()-1; i>=0; i--){
//			for(int j=i; j<s.length(); j++){
//				if(s.charAt(i)==s.charAt(j) && (j-i<=2 || palin[i+1][j-1])){
////				if(s.charAt(i)==s.charAt(j) && (palin[i+1][j-1] || j-i<=2))  {忽视了数组越界问题，一定要把那个放在后面
//					palin[i][j] = true;
//					if(max < j-i+1){
//						max = j-i+1;
//						res = s.substring(i,j+1);
//					}
//				}
//			}
//		}
//		return res;
//	} 
	
	public static void main(String[] args){
		Solution sol = new Solution();
		System.out.println(sol.longestPalindrome("asdfghgaa"));
	}
}
