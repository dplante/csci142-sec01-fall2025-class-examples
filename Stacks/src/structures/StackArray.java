package structures;

public class StackArray<T>
{
	private final static int EMPTY_INDEX = -1;
	private T[] myData;
	private int myMaxSize;
	private int myTop;
	
	@SuppressWarnings("unchecked")
	public StackArray(int num)
	{
		myMaxSize = num;
		myData = (T[]) new Object[num];
		myTop = EMPTY_INDEX;
	}
	
	/*
	 * Below, we do NOT worry about index out of bounds,
	 * but we should.
	 */
	public void push(T e)
	{
		if (myTop + 1 >= myMaxSize) {
			throw new IllegalStateException("Stack overflow");
		}
		myData[++myTop] = e;
	}
	
	public T pop()
	{
		if (this.empty())
			return null;
		
		return myData[myTop--];
	}
	
	public T peek()
	{
		if (this.empty())
			return null;
		return myData[myTop];
	}
	
	public boolean empty()
	{
		return myTop == EMPTY_INDEX;
	}

}