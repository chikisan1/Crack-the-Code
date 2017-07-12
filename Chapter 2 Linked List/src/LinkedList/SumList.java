package LinkedList;
public class SumList{
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


		int digitReverse(){
			Node cur = head;
			int power = 0;
			int result = 0;
			while(cur != null){
				result +=  cur.x * (int) Math.pow(10.0, power);
				power++;
				cur = cur.next;
			}
			return result;
		}

		int digit(){
			Node cur = head;
			int result = 0;
			while(cur != null){
				result = result*10 + cur.x;
				cur = cur.next;
			}
			return result;
		}

	}

	public static class LlIntreverse{

		Node head;

		LlIntreverse(int result){
			Node cur = new Node(result%10, null);
			result = result/10;
			head = cur;
			while(result != 0){
				Node add = new Node(result%10, null);
				cur.next = add;
				cur = cur.next;
				result = result/10;
			}
		}

		void printlist(){
			Node cur = head;
			while(cur != null){
				System.out.print( cur.x + "->");
				cur = cur.next;
			}
			System.out.println();
		}
	}


	public static class LlInt{

		Node head;
		//from ones to nth digit
		LlInt(int result){
			Node cur = new Node(result%10, null);
			result = result/10;
			while(result !=0){
				System.out.println(result);
				Node add = new Node(result%10, null);
				add.next = cur;
				cur = add;
				result = result/10;
			}
			head = cur;
		}

		void printlist(){
			Node cur = head;
			while(cur != null){
				System.out.print( cur.x + "->");
				cur = cur.next;
			}
		}

	}


	public static void main(String [] args){
		int[] num1 = {7, 1, 6};
		int[] num2 = {5, 9, 2};
		Ll digit1 = new Ll(num1);
		Ll digit2 = new Ll(num2);
		digit1.printlist();
		System.out.println();
		digit2.printlist();
		System.out.println();
		System.out.println(digit1.digitReverse());
		System.out.println(digit2.digitReverse());
		int total = digit1.digitReverse() + digit2.digitReverse();
		System.out.println(total);
		LlIntreverse list1 = new LlIntreverse(total);
		list1.printlist();
		//############################################################################
		int[] num3 = {6, 1, 7};
		int[] num4 = {2, 9, 5};
		Ll digit3 = new Ll(num3);
		Ll digit4 = new Ll(num4);
		digit3.printlist();
		System.out.println();
		digit4.printlist();
		System.out.println();
		System.out.println(digit3.digit());
		System.out.println(digit4.digit());
		int total2 = digit3.digit() + digit4.digit();
		System.out.println(total2);
		LlInt list2 = new LlInt(total2);
		list2.printlist();

	}

}
