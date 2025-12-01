package structures;

import java.util.NoSuchElementException;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main 
{

	public static void main(String[] args) 
	{
		Stack<String> stack = new Stack<String>();
		//StackArray<String> stack = new StackArray<String>(5);
		//StackVector<String> stack = new StackVector<String>();
		//StackLL<String> stack = new StackLL<String>();
		
		//System.out.println(stack.pop());
		
		stack.push("Tired");
		stack.push("Students");
		stack.push("Love");
		stack.push("Sleeping");
		
		System.out.println("Stack empty? " + stack.empty());
		while (!stack.empty())
		{
			System.out.println(stack.pop());
		}

		try{
			stack.pop();
			System.out.println("Should be empty now");
		} catch (NoSuchElementException e)
		{
			System.out.println("Empty linked list based stack, you did a no no!");
		} catch (EmptyStackException e)
		{
			System.out.println("Empty stack, you did a no no!");
		}
		System.out.println("Stack empty? " + stack.empty());

		/*
		 * The following 500000 push and pops are really 
		 * slow for the "really" bad lines in StackVector!
		 */
//		System.out.println("Begin");
//		System.out.println("      Weeeeeeee!");
//		for (int i=0; i < 500000; i++)
//		{
//			stack.push("Yeah");
//		}
//		System.out.println("      Whoooooooo!");
//		for (int i=0; i < 500000 - 1; i++)
//		{
//			stack.pop();
//		}
//		System.out.println("      Yayyyyyyy!");
//		System.out.println("End");
		/*
		 * Problem with Java Stack is that it violates the
		 * true meaning of a stack by extending a Vector
		 */
//		stack.add(0, "Many");
//		stack.add(1, "Problems");
//		stack.add(2, "With");
//		stack.add(3, "This!");
//
//		try{
//			stack.pop();
//			System.out.println("Should be empty now");
//		} catch (NoSuchElementException e)
//		{
//			System.out.println("Empty linked list based stack, you did a no no!");
//		} catch (EmptyStackException e)
//		{
//			System.out.println("Empty stack, you did a no no!");
//		}
//		System.out.println("Stack empty? " + stack.empty());
//
	}


}
