import java.util.Scanner;

/*
Build a program to display the first N terms of Fibonacci's succession.
In this sequence, the first term is zero (0), the second term is one (1), and any of the other terms is equal to the sum of its previous two terms.

Each number should appear on a separate line.
*/

public class Ex3 {
	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		fib_max;
		int		fib_1last;
		int		fib_2last;
		int		fib_now = 1;
		int		fib_value = 1;
		int		i = 1;

		fib_value = 1;
		fib_max = input.nextInt();
		if (fib_max == 0)
			return ;
		else if (fib_max == 1)
			System.out.println(0);
		else
		{
			System.out.println(0);
			System.out.println(1);
			fib_1last = 1;
			fib_2last = 0;
			while (i  < fib_max - 1)
			{
				fib_now = fib_1last + fib_2last;
				System.out.println(fib_now);
				fib_2last = fib_1last;
				fib_1last = fib_now;
				i++;
			}
		}
	}
}
