//import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Solution {
//	public List<String> letterCombinations(String digits) {
//		LinkedList<String> ans = new LinkedList<String>();
//		String[] mapping = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//		int len=digits.length();
//		ans.add("");
//		for(int i=0; i<len; i++){
//			int num = Character.getNumericValue(digits.charAt(i));
//			while(ans.peek().length()==i){
//				String s = ans.remove();
//				for(char t:mapping[num].toCharArray())
//					ans.add(s+t);
//			}
//		}
//		return ans;
//	}
	
	public List<String> letterCombinations(String digits){
		ArrayList<String> res = new ArrayList<String> ();
		if(digits=="")
		    return res;
		res.add("");
		for(int i=0; i<digits.length(); i++){
			String letters = getLetters(digits.charAt(i));
			ArrayList<String> newRes = new ArrayList<String> ();
			for(int j=0; j<res.size(); j++){
				for(int k=0; k<letters.length(); k++){
					newRes.add(res.get(j)+letters.charAt(k));
				}
			}
			res = newRes;
		}
		return res;
	}
	
	public String getLetters(char digit){
		switch(digit){
		case '2':
			return "abc";
		case '3':
			return "def";
		case '4':
			return "ghi";
		case '5':
			return "jkl";
		case '6':
			return "mno";
		case '7':
			return "pqrs";
		case '8':
			return "tuv";
		case '9':
			return "wxyz";
		default:
			return "";
			
		}
	}
	
	
	public static void main(String[] args){
		Solution sol = new Solution();
		System.out.println(sol.letterCombinations(""));
	}
}