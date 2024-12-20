import java.util.Scanner;

/*
Build a program that reads a sequence of N positive integers, where N is entered by the user.
If the value of N is negative the program terminates immediately.

The program must display on a separate line, for each of the numbers read, the percentage of digits that are divisors of the number itself (using 2 decimal places).
The digit zero (0) should not be considered as potential divisor but should be counted as digit.
At the end, the highest of these percentages should be displayed in brackets (using 2 decimal places).
*/

public class Ex0 {
	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		double	porcentage;
		double	highest_porcentage;
		int		many_digits;
		int		many_divisible;
		int		many_nums;
		int		digit;
		int		num_img;
		int		num;
		int		i;

		i = -1;
		many_nums = input.nextInt();
		highest_porcentage = 0.00;
		if (many_nums < 0)
			return ;
		while (++i < many_nums)
		{
			many_digits = 0;
			many_divisible = 0;
			num = input.nextInt();
			num_img = num;
			if (num < 0)
				return ;
			while (num_img > 0)
			{
				digit = num_img % 10;
				//System.out.printf("%d %% %d = %d\n", num, digit, (num % digit));
				if (digit != 0)
					if (num % digit == 0)
						many_divisible++;
				num_img = num_img / 10;
				many_digits++;
			}
			//System.out.printf("%d %d\n", many_digits, many_divisible );
			porcentage = 100 * ((double)many_divisible / (double)many_digits);
			System.out.printf("%.2f%%\n", porcentage);
			if (porcentage > highest_porcentage)
				highest_porcentage = porcentage;
		}
		System.out.printf("(%.2f%%)\n", highest_porcentage);
	}
}
