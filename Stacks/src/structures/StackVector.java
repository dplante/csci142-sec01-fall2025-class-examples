package structures;

import java.util.Vector;

/**
 * Stack that uses a Vector internally rather than extending
 * a Vector as the Java API does.  This "wrapping" shields 
 * the other functionality of a Vector that should not exist 
 * for a stack.
 * 
 * @author dplante
 *
 * @param <T>
 */
public class StackVector<T>
{
	private Vector<T> data;
	
	public StackVector()
	{
		data = new Vector<T>();
	}
	
	/*
	 * Below, for push() and pop(), doing so at front of
	 * Vector (i.e. at index 0) slows down performance 
	 * tremendously for large stacks, as seen in class!
	 */
	public void push(T e)
	{
		// this line is really bad!
		//data.add(0, e);
		data.add(e);
	}
	
	public T pop()
	{
		// this line is really bad!
//		if (data.size() > 0)
//		  return data.remove(0);
		if (!this.empty())
			return data.remove(data.size()-1);
		return null;
	}
	
	public T peek()
	{
		// this line is really bad!
		//return data.elementAt(0);
		return data.elementAt(data.size()-1);
	}
	
	public boolean empty()
	{
		return data.isEmpty();
	}

}
