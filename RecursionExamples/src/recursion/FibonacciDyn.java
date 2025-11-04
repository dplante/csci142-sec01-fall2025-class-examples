package recursion;

/**
 * Dynamic programming example for solving a recursive problem.
 * 
 * @author dplante
 *
 */
public class FibonacciDyn {
	public final static int MAX = 6;
	private int[] values;

	public FibonacciDyn() {
		values = new int[MAX + 1];
		values[0] = 0;
		values[1] = 1;
		for (int i = 2; i < MAX + 1; i++) {
			values[i] = -1;
		}
	}

	public static void main(String[] args) {
		FibonacciDyn fd = new FibonacciDyn();
		System.out.println("Fib(" + MAX + ") = " + fd.fib(MAX));

	}

	public int fib(int n) {
		if (n == 0 || n == 1) {
			return values[n];
		} else if (n > 1) {
			if (values[n] != -1) {
				return values[n];
			} else {
				values[n] = fib(n - 1) + fib(n - 2);
				return values[n];
			}
		}
		return 0;
	}

}