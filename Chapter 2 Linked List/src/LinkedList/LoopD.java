public class LoopD{

	public static class Node{
		int x; 
		Node next;
		boolean visited;

		Node(int x, Node next, boolean visited){
			this.x = x;
			this.next = next;
			this.visited = visited;
		}

	}

	public static class Ll{
		Node head;
		int size;

		Ll(int[] array){
			if(array != null){
				size = array.length;
				Node cur = new Node(array[0], null, false);
				head = cur;
				for(int i = 1; i < size; i++){
					Node add = new Node(array[i], null, false);
					cur.next = add;
					cur = cur.next;
				}
			}
		}

		void addToEnd(int x){
			Node cur = head;
			Node add = new Node(x, null, false);
			if(head == null){
				head = add;
			}
			else{
				while(cur.next != null){
					cur = cur.next;
				}
				cur.next = add;
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

	public static class circularLl{
		Node head;
		int size;

		circularLl(int[] array){
			size = array.length;
			Node cur = new Node(array[0], null, false);
			head = cur;
			for(int i = 1; i < size; i++){
				if(array[0] == array[i]){
					cur.next = new Node(array[i], head, false);
					break;
				}
				Node add = new Node(array[i], null, false);
				cur.next = add;
				cur = cur.next;
			}
		}


		void printList(){
			Node cur = head;
			int count = 0;
			while(count < 20){
				if(cur.visited == true){
					System.out.println();
					System.out.println(cur.x + " is the head node! ");
					break;
				}
				System.out.print(cur.x + "->");
				cur.visited = true;
				cur = cur.next;
				
				count++;
			}
			System.out.println();
		}
	}
	public static void main(String [] args){
		int [] array = {1,2,3,4,5,1};
		Ll list1 = new Ll(array);
		list1.printList();
		circularLl list2 = new circularLl(array);
		list2.printList();

	}
}