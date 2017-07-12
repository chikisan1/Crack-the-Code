package LinkedList;
public class Kth{
	public static class Node{
		int x;
		Node next;

		Node(int x, Node next){
			this.x = x;
			this.next = next;
		}

	}

	public static class Ll{

		Node head;
		int size;

		Ll(int [] array){
			size = array.length;
			Node cur = new Node(array[0], null);
			head = cur;
			for(int i = 1; i < size; i++){
				Node add = new Node(array[i], null);
				cur.next = add;
				cur = cur.next;
			}
		}

		void printlist(){
			Node cur = head;
			while(cur != null){
				System.out.print( cur.x + "->");
				cur = cur.next;
			}
		}

		int kthLast(int data){
			int kth = 0;
			Node cur = head;
			while(cur != null){
				if(cur.x == data){
					return size - kth - 1;
				}
				kth++;
				cur = cur.next;
			}
			return -1;
		}
}

	public static void main(String [] args){
		int[] array = {1, 2, 3, 4, 5};
		Ll list = new Ll(array);
		list.printlist();
		System.out.println();
		System.out.println(list.kthLast(1));

	}

}
