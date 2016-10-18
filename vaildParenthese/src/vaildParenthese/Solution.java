package vaildParenthese;
import java.util.Stack;

public class Solution{
	public boolean isValid(String s){
		if(s==null || s.length()==0)
			return true;
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			switch(c){
			case '(':
			case '[':
			case '{':
				stack.push(c);
				break;
			case ')':
				if(stack.isEmpty() || stack.pop()!='(')
					return false;
				break;
			case ']':
				if(stack.isEmpty() || stack.pop()!='[')
					return false;
				break;
			case '}':
				if(stack.isEmpty() || stack.pop()!='{')
					return false;
				break;
			default:
				break;
			}
		}
		if(stack.isEmpty())
			return true;
		return false;
	}
}
