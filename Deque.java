import java.util.Queue;
import java.util.Stack;


public class Deque<Content> extends Stack<Content> implements Queue<Content> {


private int count;
private Stack<Content> tail;
Stack<Content> s2 = new Stack<Content>();
private int capacity;

//Constructor
public Deque(int capacity) {
	this.capacity = capacity;
}

//Removes from the front of Deque
public Content dequeue() throws UnsupportedOperationException  {
	//checks if stack is empty
	if(isEmpty()) {
		throw new UnsupportedOperationException();
	}else {
	//Return top of deque
	Content e = peek();
	pop();
	count--;
	return e;
	}
}

// Adds element to back of Deque
public void enqueue(Content e) {
	// Move elements from stack to s2
	while (!isEmpty())
	{
		s2.push(pop());
		
	}
	//push item into stack
	push(e);
	
	//Push everything back
	while(!s2.isEmpty())
	{
		push(s2.pop());
	}
}

//Inserts element into Deque
	@Override
	public boolean offer(Content e) {
		// TODO Auto-generated method stub
		return offer(e);
	}
	
	//Adds element to Deque
	public boolean add(Content e) {
		return offer(e);
	}

	@Override
	public Content remove() {
		// TODO Auto-generated method stub
		return remove();
	}

	@Override
	
	//Retrieves and removes top element
	public Content poll() {
		
		return poll();
	}

	@Override
	public Content element() {
		// TODO Auto-generated method stub
		return null;
	}
	// Removes from front of Deque
	public Content enqueueFront(Content element) {
		count++;
		return push(element);
		
	}
	// Removes from the tail of Deque
public Content dequeueBack() throws UnsupportedOperationException  {
	if(isEmpty())
		throw new UnsupportedOperationException();
	
	 Content e = tail.lastElement();
	 tail.removeElement(e);
	 count--;
	 return e;
	
}

// Returns first element
public Content first() {
	return first();
}

// Returns last element
public Content last() {
	return last();
}

// Returns size
public int size() {
	return capacity;
}

// Returns true or false
public boolean isEmpty() {
	return isEmpty();
}

}
