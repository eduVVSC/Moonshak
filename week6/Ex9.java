import java.util.Scanner;

/*
Write a program to determine if a user-entered integer is a number of the Fibonacci sequence.
In Fibonacci's succession, the first term is zero (0), the second is one (1), and any of the other terms is the sum of the previous two (0,1,1,2,3,5,8,13, 21,34,55,89,144, ...).

The message "is a Fibonacci number" or "is not a Fibonacci number" should be displayed if the number entered belongs to the sequence of Fibonacci or not, respectively.
*/

public class Ex9
{
	public static int	fibonnacci(int	num)
	{
		int		fib;
		int		last;
		int		s_last;

		fib = 0;
		last = 1;
		s_last = 0;
		while ((fib - num < 0))
		{
			fib = last + s_last;
			s_last = last;
			last = fib;
		}
		if(fib == num)
			return (0);
		return (1);
	}

	public static void	main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		num1;

		num1 = input.nextInt();
		if (fibonnacci(num1) == 0)
			System.out.println("is a Fibonacci number");
		else
			System.out.println("is not a Fibonacci number");
	}
}
