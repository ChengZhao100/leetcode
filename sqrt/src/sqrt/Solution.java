package sqrt;

public class Solution{
	public int mySqrt(int num){
		if(num<0)
			return -1;
		if(num==0)
			return 0;
		int left=1, right=num/2+1;
		while(left<=right){
			int m=(left+right)/2;
			if(m<=num/m && m+1>num/(m+1))
				return m;
			else{
				if(m>num/m)
					right=m;
				if(m+1<=num/(m+1))
					left=m+1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args){
		Solution sol = new Solution();
		System.out.print(sol.mySqrt(25));
	}
}
