import java.util.*;
public class StackMin{

	public static void pushMin(Stack st, Stack minStack, int x){
		if(st.isEmpty() || x < peekMin(minStack)){
			minStack.push(x);
		}
		st.push(x);
	}

	public static void popMin(Stack st, Stack minStack){
		if((int) st.peek() == peekMin(minStack)){
			minStack.pop();
		}
		st.pop();

	}

	public static int peekMin(Stack minStack){
		return (int) minStack.peek();
	}

	public static void main(String[] args){
		Stack st = new Stack();
		Stack minStack = new Stack();
		pushMin(st, minStack, 1);
		pushMin(st, minStack, 4);
		pushMin(st, minStack, 2);


	}
}