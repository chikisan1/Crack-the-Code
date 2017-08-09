import java.util.*;
public class ThreeInOne{

	public static class ArrayStack{
		Integer [] array;
		int start;
		int end;

		ArrayStack(Integer[] array, int num){
			this.array = array;
			switch(num){
				case 1:
					start = 0;
					end = array.length/3 -1;
					break;
				case 2:
					start = array.length/3;
					end = 2*array.length/3 - 1;
					break;
				case 3:
					start = 2*array.length/3;
					end = array.length - 1;
			}
		}

		int peek() throws EmptyStackException{
			if(array[start] == null){
				throw new EmptyStackException();
			}
			else{
				return (int) array[start];
			}
		}


		void push(int x) throws EmptyStackException{
			if(array[end] != null){
				System.out.println("Stack is full");
			}
			else{
				int count = end;
				while(count >= start){
					if(count == start){
						array[count] = x;
					}
					else{
						array[count] = array[count - 1];
					}
					count--;
				}

			}
		}

		void pop()throws EmptyStackException{
			if(array[start] == null){
				isEmpty();
			}
			else{
				int count = start;
				while(count < end){
					if(array[count + 1] != null){
						array[count] = array[count + 1];
					}	
					else{
						array[count] = null;
						break;
					}
					count++;
				}
				array[end] = null;
			}
		}

		void isEmpty(){
			if(array[start] == null){
				System.out.println("Stack is empty");
			}
		}

		void printStack(){
			for(int i = start; i <= end; i++){
				if(i == end){
					System.out.print(array[i]);
				}
				else{
					System.out.print(array[i] + ", ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		Integer [] array = {1,2,3,5,6,null, 7, 8, null};
		ArrayStack stack1 = new ArrayStack(array, 1);
		ArrayStack stack2 = new ArrayStack(array, 2);
		stack2.push(4);
		ArrayStack stack3 = new ArrayStack(array, 3);
		stack3.pop();
		stack1.printStack();
		stack2.printStack();
		stack3.printStack();
		System.out.println(stack1.peek());


	}
}