package cf222jf_lab4.stack;

import java.util.Iterator;

public class StackList implements Stack{
	private Object[] stack;
	private int size = 0;
	Exception stackError = new Exception("Stack is Empty");



	public StackList(int sz){
		stack = new Object[sz];


	}
	public StackList(){
		stack = new Object[10];
		this.size = 0;
	}
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {

		return size == 0;
	}

	@Override
	public void push(Object element) {
		if (size == stack.length-1){
			Object[] stack2 = new Object[(stack.length+1)*2];
			for (int i = 0; i < stack.length; i++){
				stack2[i] = stack[i];
			}
			stack = stack2;	
		}
		size++;
		stack[size-1] = element;


	}

	@Override
	public Object pop() throws Exception{
		if (size == 0){
			throw stackError;
		}
		else{
			Object top = stack[size-1];
			stack[size-1] = null;

			size--;
			return top;
		}

	}

	@Override
	public Object peek() throws Exception {
		if (size == 0){

			throw stackError;
		}
		else{
			return stack[size-1];
		}
	}

	@Override
	public Iterator<Object> iterator() {

		return new StackIterator();
	}

	class StackIterator implements Iterator{
		private int currentpos = 0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return currentpos < size;
		}

		@Override
		public Object next() {
			Object obj = stack[currentpos];
			currentpos++;
			return obj;
		}


	}

}

