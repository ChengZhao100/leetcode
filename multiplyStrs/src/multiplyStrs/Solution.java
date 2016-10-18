package multiplyStrs;

public class Solution{
	public String multiply(String num1, String num2){
		int len1=num1.length();
		int len2=num2.length();
		if(num1=="0"||num2=="0")
		    return "0";
		int[] pos = new int[len1+len2];
		for(int i=len1-1; i>=0; i--){
			for(int j=len2-1; j>=0; j--){
				int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
				int sum=mul+pos[i+j+1];
				pos[i+j+1]=sum%10;
				pos[i+j] += sum/10;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int p:pos){
			if(!(sb.length()==0 && p==0))
				sb.append(p);
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		Solution sol = new Solution();
		System.out.println(sol.multiply("0", "0"));
	}
}
