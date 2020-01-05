package cf222jf_lab4.stack;

import java.util.Iterator;

public class StackMain {

	public static void main(String[] args) {
		try{
		StackList stack = new StackList(5);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		//System.out.println(stack.peek());
		stack.push("fisk");
		stack.push("gurka");
		stack.push("groda");
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		Iterator itr = stack.iterator();
		
		System.out.println("ITERATOR TEST");
		while (itr.hasNext()){
			System.out.println(itr.next().toString());
			}
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}


	}
}
