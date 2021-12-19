
public class Fibonacci {

	public static void fiboRep(int n, int a, int b) { // Repeat

		int fib, i;
		int[] arr = new int[n];

		arr[0] = a;
		arr[1] = b;

		for (i = 2; i < n; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		System.out.println(arr[n - 1]);

	}

	// 동빈나 유튜브
	public static int fibo1(int n) { // Repeat

		int one = 1;
		int two = 1;
		int result = -1 ;

		if (n == 1)
			return one;
		else if (n == 2)
			return two;
		else {
			for (int i = 2; i < n; i++) {
				result = one + two;
				one = two;
				two = result;
			}
			return result;
		}
	}

	public static int fiboRec(int n) { // Recursive
		int fib = 0;
		if (n == 1 || n == 2) {
			fib = 1;
			return fib;
		} else {
			return fiboRec(n - 1) + fiboRec(n - 2);
		}
	}

	// 동빈나 유튜브
	public static int fibo2(int n) { // Recursive
		int fib =0;
		int one=1;
		int two=1;
		int result=-1
		
		if(n==1||n==2) {
			fib=1;
			return fib;
		}
		else {
			return fiboRec(n-1) + fiboRec(n-2); 
		}
	}

	public static void main(String[] args) {
		fiboRep(6, 1, 1);
		System.out.println(fiboRec(6));
	}

}
