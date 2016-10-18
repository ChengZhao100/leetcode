// public class LinkList{
// 	public Node head;
// 	public Node current;

// 	public void add(int data){
// 		if(head == null){
// 			head = new Node(data);
// 			current = head;
// 		} else{
// 			current.next = new Node(data);
// 			current = current.next;
// 		}
// 	}

// 	public void print(Node node){
// 		if(node == null){
// 			return;
// 		} else{
// 			current = node;
// 			while(current != null){
// 				System.out.print(current.data);
// 				current.next = current;
// 			}
// 		}
// 	}

// 	class Node{
// 		int data;
// 		Node next;

// 		public Node(int data){
// 			this.data = data;
// 		}
// 	}

// 	public static void main(String[] args){
// 		LinkList list = new LinkList();
// 		for(int i=0; i<10; i++){
// 			list.add(i);
// 		}

// 		list.print(list.head);
// 	}
// }


public class LinkList{
	Node head;
	Node current;

	class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
	}

	public void add(int data){
		if(head == null){
			// current.data = data;
			// head = current;
			head = new Node(data);
			current = head;
		} else{
			// current.data = data;
			current.next = new Node(data);
			current = current.next;
		}
	}

	public void print(Node node){
		if(node == null){
			return;
		} else{
			current = node;
			while(current != null){
				System.out.print(current.data);
				current = current.next;
			}
		}
	}

	public static void main(String[] args){
		LinkList list = new LinkList();
		for(int i=0; i<10; i++){
			list.add(i);
		}
		list.print(list.head);
	}
}
}