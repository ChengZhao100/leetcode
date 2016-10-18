package mergeKLists;

import java.util.*;

public class Solution{
	ListNode head,current;
	
	class ListNode{
		ListNode next;
		int data;
		ListNode(int data){
			this.data = data;
		}
	}
	
	public ListNode add(int data){
		if(head==null){
			head = new ListNode(data);
			current = head;
		} else{
			current.next = new ListNode(data);
			current = current.next;
		}
		return head;
	}
	
	public ListNode merge2Lists(ListNode head1, ListNode head2){
		ListNode head;
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		ListNode curr1,curr2;
		if(head1.data<head2.data){
			head = head1;
			curr1=head1.next;
			curr2=head2;
		}
		else{
			head = head2;
			curr1=head1;
			curr2=head2.next;
		}
		current = head;
		while(curr1!=null && curr2!=null){
			if(curr1.data<curr2.data){
				current.next=curr1;
				curr1 = curr1.next;
			} else{
				current.next=curr2;
				curr2 = curr2.next;
			}
			current = current.next;
		}
		if(curr1==null)
			current.next = curr2;
		if(curr2==null)
			current.next = curr1;
		return head;
	}
	
//	public ListNode mergeKLists(ListNode[] lists){
//		ListNode res=null;
//		for(int i=0; i<lists.length; i++)
//			res = merge2Lists(res,lists[i]);
//		return res;
//	}
	
	public ListNode mergeKLists(ListNode[] lists){
		if(lists.length==0)
			return null;
		if(lists.length==1)
			return lists[0];
		int length = lists.length;
		int mid = (length)/2;
		ListNode l1 = mergeKLists(Arrays.copyOfRange(lists,0,mid));
		ListNode l2 = mergeKLists(Arrays.copyOfRange(lists,mid,length));
		
		return merge2Lists(l1,l2);
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n){
		ListNode current=head;
		ListNode newHead = head;
		for(int i=0; i<n; i++)
			current = current.next;
		if(current==null)
			return head.next;
		else{
			while(current.next!=null){
				newHead = newHead.next;
				current = current.next;
			}
			newHead.next = newHead.next.next;
		}
		return head;
	}
	
	public void print(ListNode head){
		current = head;
		while(current!=null){
			System.out.print(current.data+" ");
			current = current.next;
		}
	}
	
	public static void main(String[] args){
		Solution sol1 = new Solution();
		Solution sol2 = new Solution();
		Solution sol3 = new Solution();
		for(int i=1; i<3; i++)
			sol1.add(i);
		for(int i=5; i<9; i++)
			sol2.add(i);
		for(int i=88; i>77; i--)
			sol3.add(i);
		sol1.print(sol1.head);
		System.out.println();
		ListNode[] lists = {sol1.head,sol2.head,sol3.head};
//		sol1.print(sol1.removeNthFromEnd(sol1.head,1));
		sol1.print(sol1.mergeKLists(lists));
	}
}
