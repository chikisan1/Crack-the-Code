import java.util.*;
public class StackPlates{

	// Stack of Plates: Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
	// Therefore, in real life, we would likely start a new stack when the previous stack exceeds some
	// threshold. Implement a data structure SetOfStacks that mimics this. SetOfStacks should be
	// composed of several stacks and should create a new stack once the previous one exceeds capacity.
	// SetOfStacks. push () and SetOfStacks. pop () should behave identically to a single stack
	// (that is, pop ( ) should return the same values as it would if there were just a single stack).
	// FOLLOW UP
	// Implement a function popAt (int index) which performs a pop operation on a specific sub-stack.
	// Hints: #64, #87

	public static class SetOfStacks{
		int capacity;
		ArrayList<Stack<Integer>> set; //the entire set of the stack

		//constructor 
		SetOfStacks(ArrayList<Stack<Integer>> set, int capacity){
			this.set = set;
			this.capacity = capacity;
		}

		//return the current stack 
		public Stack<Integer> getLastStack(){
			if(set.size() == 0){
				return null;
			}
			return set.get(set.size() - 1);
		}


		//adding an Integer
		void add(Integer x){
			size++;		//incrementing the list
			//when the stack is full 
			if(size > max){
				Stack<Integer> newStack = new Stack<Integer>(); //create a new list 
				newStack.push(x); //add the Integer to the new list
				set.add(newStack); //add that list to the set 
				currentStack = newStack; //set the new list as the currentstack 
				size = 1; //start the new list with 1 
			}
			else{
				currentStack.push(x);
			}
		}

		void remove(){
			currentStack.pop();
			if(currenStack.empty()){
				set.remove();
			}
			else{
				size--;
			}
		}

	}
	public static void main(String [] args){

	}
}