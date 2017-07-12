package LinkedList;
public class Intersection{
	public static class Node{
		int x; 
		Node next;

		Node(int x, Node next){
			this.x = x;
			this.next = next;
		}

	}

	public class Ll{
		Node head;
		int size;

		void addToEnd(int x){
			Node cur = new Node(x, null);
			if(head == null){
				head = cur;
			}
			else{
				while(c)
			}

		}

		void printList(){
			Node cur = head;
			while(cur != null){
				System.out.print( cur.x + "->");
				cur = cur.next;
			}
			System.out.println();
		}
	}
}