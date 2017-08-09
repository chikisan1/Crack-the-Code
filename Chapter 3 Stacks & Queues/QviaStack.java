import java.util.*;
public class QviaStack{
	// Queue via Stacks: Implement a MyQueue class which implements a queue using two stacks.
	// Hints: #98, #7 74
	public static class Que{
		Stack<Integer> list; //first in 
		Stack<Integer> flip; //first out, placeholder for the list

		//contructor 
		Que(Stack<Integer> list, Stack<Integer> flip){
			this.list = list;
			this.flip = flip;
		}

		//push
		void add(Integer x){
			list.push(x);
			System.out.println("added " + x);
		}
		//remove the first
		void remove(){
			//if the list is empty 
			if(list.empty()){
				isEmpty();
				return;
			}
			//when its not 
			while(!list.empty()){
				Integer insert = list.pop(); //creating a new object
				flip.push(insert); // pushing into the flip
			}
			flip.pop(); //removing the top of the list
			//put everything back in the list 
			while(!flip.empty()){
				Integer insert = flip.pop();
				list.push(insert);
			}
		}

		//same concept as the remove() without removing it
		Integer peek(){
			while(!list.empty()){
				Integer insert = list.pop();
				flip.push(insert);
			}
			Integer result = flip.peek(); //returning but not removing
			while(!flip.empty()){
				Integer insert = flip.pop();
				list.push(insert);
			}
			return result;
		}
		void isEmpty(){
			if(list.empty()){
				System.out.println("Stack is empty");
			}
		}

		void printQue(){
			if(list.empty()){
				isEmpty();
			}
			while(!list.empty()){
				Integer insert = list.pop();
				flip.push(insert);
			}
			while(!flip.empty()){
				Integer insert = flip.pop();
				list.push(insert);
				System.out.print(insert);
				if(!flip.empty()){
					System.out.print(", ");
				}
			}
			System.out.println();

		}
	}
	
	public static void main(String [] args){
		Stack<Integer> list = new Stack<Integer>();
		Stack<Integer> flip = new Stack<Integer>();
		Que q = new Que(list, flip);
		q.add(1);
		q.add(2);
		q.printQue();
		System.out.println("peek is " + q.peek());
		q.remove();
		q.printQue();
	}
}