package divide2Int;

public class Solution{
	public int divide(int dividend, int divisor){
		int res=0;
		int digits=0;
		int sign=1;
		if(divisor==0)
			return Integer.MAX_VALUE;
		if(divisor==Integer.MIN_VALUE){
			if(dividend==Integer.MIN_VALUE)
				return 1;
			return 0;
		}
		if(dividend==Integer.MIN_VALUE){
			if(divisor==-1)
				return Integer.MAX_VALUE;
			else{
				dividend += Math.abs(divisor);
				res ++;
			}
		}
		if((dividend>0 && divisor<0)||(dividend<0 && divisor>0))
			sign=-1;
		dividend=Math.abs(dividend);
		divisor=Math.abs(divisor);
		while(divisor<=(dividend>>1)){
			divisor <<= 1;
			digits ++;
		}
		while(digits>=0){
			if(dividend>=divisor){
				res += 1<<digits;
				dividend -= divisor;
			}
			divisor >>= 1;
			digits --;
		}
		return sign*res;
	}
	
	public static void main(String[] args){
		Solution sol = new Solution();
		System.out.print(sol.divide(2147483647,2));
	}
}
