import java.util.Scanner;

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
