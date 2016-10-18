package countAndsay;

public class Solution{
	public String countAndSay(int n){
		String str = "1";
		String res = str;
		if(n==1)
			return str;
		for(int i=2; i<=n; i++){
			res = countAndSay(res);
		}
		return res;
	}
	
	public String countAndSay(String str){
		int count=1;
		StringBuilder sb= new StringBuilder();
		for(int i=1; i<str.length(); i++){
			if(str.charAt(i)==str.charAt(i-1))
				count++;
			else{
				sb.append(count);
				sb.append(str.charAt(i-1));
				count=1;
			}
		}
		sb.append(count);
		sb.append(str.charAt(str.length()-1));
		return sb.toString();
	}
	
	public static void main(String[] args){
		Solution sol = new Solution();
		System.out.println(sol.countAndSay(3));
	}
}