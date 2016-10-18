public class Solution {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	
	ListNode head = null;
	ListNode current = null;
	
	public ListNode add(int num){
		if(head == null){
			head = new ListNode(num);
			current = head;
		}
		else{
			current.next = new ListNode(num);
			current = current.next;
		}
		return head;
	}
	
	public void print(ListNode node){
		if(node == null)
			return;
		current = node;
		while(current != null){
			System.out.print(current.val + " ");
			current = current.next;
		}
	}
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode c1 = l1;
    	ListNode c2 = l2;
    	int sum = 0;
    	ListNode d = new ListNode(0);
    	ListNode sentinel = d;
    	if(c1 == null)
    		return c2;
    	if(c2 == null)
    		return c1;
    	while(c1 != null || c2 != null){
    		if(c1 != null){
    			sum += c1.val;
    			c1 = c1.next;
    		}
    		if(c2 != null){
    			sum += c2.val;
    			c2 = c2.next;
    		}
    		d.next = new ListNode(sum % 10);
    		sum = sum / 10;
    		d = d.next;
    	}
    	if(sum != 0)
    		d.next = new ListNode(sum);
    	return sentinel.next;
    }
    
    public static void main(String[] args){
    	Solution l1 = new Solution();
    	Solution l2 = new Solution();
    	Solution l3 = new Solution();
    	for(int i=0; i<3; i++)
    		l1.add(i);
    	for(int i=6; i<9; i++)
    		l2.add(i);
//    	l3.print(l2.head);
    	l3.print(l3.addTwoNumbers(l1.head, l2.head));
    }
}