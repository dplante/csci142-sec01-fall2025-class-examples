package recursion;

/**
 * RecursivePrimeFactors is another example of when you would NOT use recursion
 * (again, it is easier to just use the iterative approach), but it provides
 * another example of recursion.
 * 
 * Code to find all prime factors for an integer.
 * 
 * @author dplante
 */
public class RecursivePrimeFactors {

	public static void main(String[] args) {
		new RecursivePrimeFactors();
	}

	public RecursivePrimeFactors() {
		int value;

		value = 150;

		System.out.println("Prime factors of " + value + ": Iteratively");
		this.primeFactorsIterative(value);

		System.out.println("");
		System.out.println("Prime factors of " + value + ": Recursively");
		this.primeFactorsRecursive(value);

	}

	// Iterative approach
	public void primeFactorsIterative(int value) {
		int factor;

		factor = 2;

		while (value > 1) {
			if (value % factor == 0) {
				System.out.print(" " + factor);
				// value = value/factor;
				value /= factor;
			} else {
				factor++;
			}
		}
	}

	// Recursive approach
	public void primeFactorsRecursive(int value) {
		this.primeFactorsRecursive(value, 2);
	}

	private void primeFactorsRecursive(int value, int factor) {
		if (value > 1) {
			if (value % factor == 0) {
				System.out.print(" " + factor);
				value /= factor;
			} else {
				factor++;
			}
			this.primeFactorsRecursive(value, factor);
		}
	}
}
