import java.util.Scanner;

public class Ex5 {
	public static void	table_num(int num)
	{
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", num, i, (num * i));
		}
	}

	public static void	table_range(int min, int max)
	{
		while (min <= max)
		{
			System.out.println("Multiplication table of " + min);
			table_num(min);
			min++;
		}
	}

	public static void	get_nums(Scanner input)
	{
		int		num;
		int		max;
		int		min;
		int		valid_nums = 0;

		max = 0;
		min = 0;
		num = 0;
		while (valid_nums < 2)
		{
			num = input.nextInt();
			if (num > 0)
			{
				valid_nums++;
				if (valid_nums == 1)
					max = num;
				else
					min = num;
			}
		}
		if (min > max)
		{
			min = max;
			max = num;
		}
		table_range(min, max);
	}

	public static void	main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		get_nums(input);
	}
}
