package test1;
//import java.util.*;

//import swapNodesInPairs.Solution.ListNode;

public class LinkList{
	public Node head;
	public Node current;

	public void add(int data){
		if(head == null){
			head = new Node(data);
			current = head;
		} else{
			current.next = new Node(data);
			current = current.next;
		}
	}
	
	public void add(Node node){
		if(node == null){
			return;
		}
		
		if(head == null){
			head = node;
			current = head;
		} else{
			current.next = node;
			current = current.next;
		}
	}
	
	public void print(Node node){
		if(node == null){
			return;
		} else{
			current = node;
			while(current != null){
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
	}
	
	public Node swapPairs(Node head){
		if(head==null || head.next==null)
			return head;
		Node node = new Node(0);
		node.next=head;
		while(node.next!=null && node.next.next!=null){
			Node left=node.next;
			Node right=node.next.next;
			node.next=right;
			left.next=right.next;
			node.next.next=left;
		}
		return node.next;
	}
	
//	public int getLength(Node head){
//		if(head == null)
//			return 0;
//		else{
//			Node current = head;
//			int length = 0;
//			while(current != null){
//				length ++;
//				current = current.next;
//			}
//			return length;
//		}	
//	}

//	public int findLastNode(int index){
//		int size=0;
//		current = head;
//		while(current != null){
//			size ++;
//			current = current.next;
//		}
//		
//		current = head;
//		for(int i=0; i<size-index; i++){
//			current = current.next;
//		}
//		
//		return current.data;
//	}
	
	public int findLastNode(int index){
		
		if(head == null || index == 0){
//			throw new IOException("data error");
			return -1;
		}
		
		Node first = head;
		Node second = head;
		
		for(int i=0; i<index-1; i++){
			second = second.next;
		}
		
		while(second.next != null){
			first = first.next;
			second = second.next;
		}
		
		return first.data;
	}
	
	public Node reverseList(Node head){
		if(head == null || head.next == null){
			return head;
		}
		
		Node reverseHead = null;
		Node current = head;
		Node next = null;
		
		while(current != null){
			next = current.next;
			current.next = reverseHead;
			reverseHead = current;
			current = next;
		}
		return reverseHead;
	}
	
//	public void reversePrint(Node head){
//		if(head == null){
//			return;
//		}
//		
//		Node current = head;
//		Stack<Node> stack = new Stack<Node>();
//		while(current != null){
//			stack.push(current);
//			current = current.next;
//		}
//		
//		while(stack.size()>0){
//			current = stack.pop();
//			System.out.print(current.data + " ");
//		}
//	}
	
	public void reversePrint(Node head){
		if(head == null)
			return;
		reversePrint(head.next);
		System.out.print(head.data + " ");
	}
	
	public Node hasCycle(Node head){
		if(head == null){
			return null;
		}
		
		Node first = head;
		Node second = head;
		while(second != null){
			first = first.next;
			second = second.next.next;
			if(first == second)
				return first;
		}
		return null;
	}
	
	public int getCycleLength(Node node){
		if(node == null)
			return 0;
		Node current = node;
		int length=0;
		while(current != null){
			length ++;
			current = current.next;
			if(current == node){
				return length;
			}
		}
		return 0;
	}
	
	class Node{
		int data;
		Node next;

		public Node(int data){
			this.data = data;
		}
	}

	public static void main(String[] args){
		LinkList list = new LinkList();
//		Node second = null;
		for(int i=0; i<6; i++){
			list.add(i);
//			if(i==1)
//				second = list.current;
		}

		list.print(list.head);
//		System.out.println(list.getLength(list.head));
		System.out.println();
		list.print(list.swapPairs(list.head));
//		System.out.println(list.findLastNode(1));
//		list.print(list.reverseList(list.head));
//		list.print(list.head);
//		list.reversePrint(list.head);
//		list.add(second);
//		System.out.println(list.getCycleLength(list.hasCycle(list.head)));
	}
}