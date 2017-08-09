import java.util.*;
public class SortStack{
	// Sort Stack: Write a program to sort a stack such that the smallest items are on the top. You can use
	// an additional temporary stack, but you may not copy the elements into any other data structure
	// (such as an array). The stack supports the following operations: push, pop, peek, and isEmpty.
	// Hints: # 75, #32, #43
	public static class Sort{
		Stack<Integer> list;
		Stack<Integer> flip;

		Sort(Stack<Integer> list, Stack<Integer> flip){
			this.list = list;
			this.flip = flip;
		}

		void addSort(Integer x){
			if(list.empty()){
				list.push(x);
			}
			while(!list.empty()){
				if(list.peek() < x){
					Integer insert = list.pop();
					flip.push(insert);
				}
				else{
					//put in when x > than the element in list
					list.push(x);
					break;
				}
			}
			//if x is greater than all in the list
			if(list.empty()){
				list.push(x);
			}
			//put back into list
			while(!flip.empty()){
				Integer insert = flip.pop();
				list.push(insert);
			}
			//System.out.println("added " + x);
		}
		
		Integer peek(){
			return list.peek();
		}

		void isEmpty(){
			if(list.empty()){
				System.out.println("Stack is empty");
			}
		}

		void printStack(){
			if(list.empty()){
				isEmpty();
			}
			while(!list.empty()){
				Integer insert = list.pop();
				System.out.print(insert);
				if(!list.empty()){
					System.out.print(", ");
				}
				flip.push(insert);
			}
			while(!flip.empty()){
				Integer insert = flip.pop();
				list.push(insert);
			}
			System.out.println();

		}
	}

	public static void main(String [] args){
		Stack<Integer> list = new Stack<Integer>();
		Stack<Integer> flip = new Stack<Integer>();
		Sort st = new Sort(list, flip);
		st.addSort(2);
		st.addSort(4);
		st.addSort(1);
		st.addSort(3);
		st.printStack();
		System.out.println("peek is " + st.peek());
	}

	
}