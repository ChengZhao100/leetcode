package swapNodesInPairs;

public class Solution{
	ListNode head,current;
	
	class ListNode{
		int val;
		ListNode next;
		ListNode(int val){
			this.val = val;
		}
	}
	
	public void add(int num){
		if(head==null){
			head=new ListNode(num);
			current=head;
		}
		else{
			ListNode node = new ListNode(num);
			current.next=node;
			current=current.next;
		}
	}
	
	public void print(ListNode node){
		if(node==null)
			return;
		else{
			current=node;
			while(current!=null){
				System.out.print(current.val+" ");
				current=current.next;
			}
		}
	}
	
	public ListNode swapPairs(ListNode head){
		if(head==null || head.next==null)
			return head;
		ListNode node = new ListNode(0);
		node.next=head;
		current=node;
		while(current.next!=null && current.next.next!=null){
			ListNode left=current.next;
			ListNode right=current.next.next;
			current.next=right;
			left.next=right.next;
			current.next.next=left;
			current=left;
		}
		return node.next;
	}
	
	public static void main(String[] args){
		Solution sol = new Solution();
		for(int i=0; i<7; i++)
			sol.add(i);
		sol.print(sol.head);
		System.out.println();
		sol.print(sol.swapPairs(sol.head));
	}
}
