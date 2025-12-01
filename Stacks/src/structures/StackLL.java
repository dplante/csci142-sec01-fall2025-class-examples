package structures;

import java.util.LinkedList;

/**
 * Stack implemented as a "wrapper" around Java's
 * LinkedList class.
 * 
 * @author dplante
 *
 * @param <T>
 */
public class StackLL<T>
{
	private LinkedList<T> data;
	
	public StackLL()
	{
		data = new LinkedList<T>();
	}
	
	/*
	 * Below, as with StackArray, we are not error checking
	 * at all!!  But we should!!  Must catch exceptions that
	 * are thrown, etc.
	 */
	public void push(T e)
	{
		data.addFirst(e);
	}
	
	public T pop()
	{
		return data.removeFirst();
	}
	
	public T peek()
	{
		return data.getFirst();
	}
	
	public boolean empty()
	{
		return data.isEmpty();
	}

}
