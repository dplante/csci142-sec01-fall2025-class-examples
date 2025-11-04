package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		new Fibonacci(6);

	}

	public Fibonacci(int num) {
		int result = fib(num);
		System.out.println("Fib(" + num + ") = " + result);
	}

	public int fib(int n) {
		if (n == 1) {
			return 1;
		} else if (n > 1) {
			return fib(n - 1) + fib(n - 2);
		}
		return 0;
	}

}
