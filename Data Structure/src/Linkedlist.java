
public class Linkedlist {
	Node head;           //head of node
	
	static class Node{   //LL Node. This inner class is made static so that main()can access it.
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
	}

	public static void main(String[] args) {
		Linkedlist llist = new Linkedlist();
		
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next = second;   //Link first node with second node
		second.next = third;        //Link second node with third node
		}

}
