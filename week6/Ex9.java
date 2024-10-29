import java.util.Scanner;

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
