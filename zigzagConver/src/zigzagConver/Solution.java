package zigzagConver;

public class Solution {
    public String convert(String s, int numRows) {
    	int nrow = numRows;
    	StringBuffer[] sb = new StringBuffer[nrow];//请注意这里是定义数组！
    	for(int i=0; i<nrow; i++){
    		sb[i] = new StringBuffer();
    	}
    	
    	int i=0, len=s.length();
    	while(i < len){
    		for(int idx=0; idx<nrow && i<len; idx++){
    			sb[idx].append(s.charAt(i));
    			i ++;
    		}
    		for(int idx=nrow-2; idx>0 && i<len; idx--){
    			sb[idx].append(s.charAt(i));
    			i ++;
    		}
    	}
    	
    	for(int j=1; j<nrow; j++)
    		sb[0].append(sb[j]);
    	return sb[0].toString();
    }
    
    public static void main(String[] args){
    	Solution sol = new Solution();
//    	System.out.println(sol.convert("paypalishiring", 3));
    	System.out.println(sol.convert("", 1));
    }
}
