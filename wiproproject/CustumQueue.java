package wiproproject;
import java.util.ArrayList;

import java.util.List;

public class CustumQueue<E> {
	 List<E> queue;

	public CustumQueue() {
	super();
	queue = new ArrayList<>();
	}

	public void Enqueue (E element) {
	queue.add(element);

	}

	public void Dequeue() {
	if(!queue.isEmpty()) {
	queue.remove(queue.size()-1);

	}else
	{
		System.out.println("No element in stack");

	}

	}

	public E peek() {
	if(isEmpty()) {

	System.out.println("No element in stack");

	}
	return queue.get(0);
	}
	public boolean isEmpty() {
	return queue.isEmpty();
	}

	public static void main(String[] args) {
	CustumQueue st = new CustumQueue();
	st. Enqueue (3);
	st. Enqueue(6);
	st. Enqueue(9);

	System.out.println(st.peek());

	st. Dequeue();
	st.Dequeue();
	st. Dequeue();

	boolean f = st.isEmpty();
	System.out.println(f);

	}
	}
