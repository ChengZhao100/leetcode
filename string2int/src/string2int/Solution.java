package string2int;

public class Solution {
	public int myAtoi(String str) {
        int total=0, tail=0, sign=1;
        int index=0;
        int len=str.length();
        if(len==0)
            return 0;
        while(str.charAt(index) == ' ' && index<len){
            index ++;
        }
        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
            sign = str.charAt(index)=='+' ? 1 : -1;
            index ++;
        }
        while(index<len){
            tail = str.charAt(index) - '0';
            if(tail<0 || tail>9)
                break;
            if(total > Integer.MAX_VALUE/10 || total == Integer.MAX_VALUE/10 && tail > Integer.MAX_VALUE%10)
                return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            total = 10*total + tail;
            index ++;
        }
        return sign*total;
    }
    
    public static void main(String[] args){
    	Solution sol = new Solution();
    	System.out.println(sol.myAtoi("2147483648"));
    }
}