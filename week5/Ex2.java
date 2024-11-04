import java.util.Scanner;

/*
Build a program that determines and visualizes the first N perfect numbers.
A number is perfect if it is natural and equals to the sum of all its divisors (excluding the number itself).

Each number should appear on a separate line.
*/

public class Ex2 {
	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		many_perfect_nums;
		int		printed = 1;
		int		i = 28;
		int		divisor;
		int		sum = 0;

		many_perfect_nums = input.nextInt();
		if (many_perfect_nums <= 0)
			return ;
		System.out.println("6");
		while (printed < many_perfect_nums)
		{
			divisor = 1;
			sum = 0;
			while (divisor <= i / 2)
			{
				if (i % divisor == 0)
					sum = sum + divisor;
				divisor++;
			}
			if (sum == i)
			{
				System.out.println(i);
				printed++;
			}
			i++;
		}
	}
}
