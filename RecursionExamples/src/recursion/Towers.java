package recursion;

/**
 * Solve the Towers of Hanoi problem recursively
 * 
 * @author dplante
 *
 */
public class Towers {
	private int myNumberOfMoves;
	
	public static void main(String[] args) 
	{
		new Towers(4);

	}
	
	public Towers(int ndisks)
	{
		myNumberOfMoves = 0;
		this.towers(ndisks, 1, 2, 3);
		System.out.println("Total Number of Moves: " + myNumberOfMoves);
	}
	
	public void towers(int ndisks, int p1, int p2, int p3)
	{
		if (ndisks == 1)
		{
			System.out.println("Move disk from " + p1 + " to " + p3);
			myNumberOfMoves++;
		}
		else
		{
			towers(ndisks-1, p1, p3, p2);
			towers(1, p1, p2, p3);
			towers(ndisks-1, p2, p1, p3);
		}
	}

}
