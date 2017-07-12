package LinkedList;
public class PalindromeLl{
	public static class Node{
		char a;
		Node prev;
		Node next;

		Node(char a, Node prev, Node next){
			this.a = a;
			this.prev = prev;
			this.next = next;
		}

	}

	public static class Ll{

		Node head;
		int size;

		Ll(char [] array){
			size = array.length;
			Node cur = new Node(array[0], null, null);
			head = cur;
			for(int i = 1; i < size; i++){
				Node add = new Node(array[i], cur, null);
				cur.next = add;
				cur = cur.next;
			}
		}
		
		boolean palindrome(){
			Node cur = head;
			Node end = null;
			//traversing the list 
			while(cur.next != null){
				cur = cur.next;
			}
			//assign "end" to the end of the node;
			end = cur;
			System.out.println("cur " + cur.a);
			cur = head;
			//System.out.println("end" + end.a);
			System.out.println("cur " + cur.a);
			int index = 0;
			while(index != size/2){
				if(cur.a != end.a){
					return false;
				}
				cur = cur.next;
				end = end.prev;
				index++;
			}
			return true;
			
		}
		void printlist(){
			Node cur = head;
			while(cur != null){
				System.out.print( cur.a + "->");
				cur = cur.next;
			}
			System.out.println();
		}
	}

	public static void main(String [] args){
		char[] palin = {'a', 'b', 'c', 'b', 'a'};
		char[] not = {'a', 'b', 'c', 'd', 'e'};
		char[] evenPalin = {'a','b','b','a'};
		char[] notEven = {'a','a','b','a'};

		Ll list1 = new Ll(palin);
		list1.printlist();
		System.out.println(list1.palindrome());
		Ll list2 = new Ll(not);
		System.out.println(list2.palindrome());

		Ll list3 = new Ll(evenPalin);
		System.out.println(list3.palindrome());
		Ll list4 = new Ll(notEven);
		System.out.println(list4.palindrome());


	}
}