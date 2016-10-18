package pow;

public class Solution{
//	public double myPow(double x, int n){
//		if(n<0)
//			return -1;
//		if(n==0)
//			return 1;
//		if(n==1)
//			return x;
//		while(n>0){
//			if(n%2==0)
//				return myPow(x,n/2)*myPow(x,n/2);
//			if(n%2==1)
//				return myPow(x,n/2)*myPow(x,n/2)*x;
//		}
//		return 0;
//	}
	
	double pow(double x, int n) {  
	    if (n == 0) return 1.0;  
	    double half = pow(x, n/2);  
	    if (n%2 == 0)  
	    {  
	        return half*half;  
	    }  
	    else if (n>0)  
	    {  
	        return half*half*x;  
	    }  
	    else  
	    {  
	        return half/x*half;  
	    }  
	} 
	
	public static void main(String[] args){
		Solution sol = new Solution();
		System.out.print(sol.pow(10,-2));
		System.out.print(-10/4);
	}
}