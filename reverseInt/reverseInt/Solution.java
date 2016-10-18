package reverseInt;
//import java.util.Stack;

public class Solution {
//	public int reverse(int x){
//		Stack<Integer> s = new Stack<Integer> ();
//		long res = 0;
//		while(x != 0){
//			s.push(x % 10);
//			x = x/10;
//		}
//		for(int i=0; !s.empty(); i++){
//			res += s.pop()*(Math.pow(10,i));
//			if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
//				return 0;
//		}
//		return (int)res;
//	}
//	
	
	public int reverse(int x){
		int result=0;
		int tail=0;
		int newResult=0;
		while(x != 0){
			tail = x % 10;
			newResult = result * 10 + tail;
			if((newResult-tail)/10 != result)
				return 0;
			result = newResult;
			x = x/10;
		}
		return result;
	}
	public static void main(String[] args){
		Solution sol = new Solution();
		System.out.println(123);
		System.out.println(sol.reverse(1534236469));
	}
}
