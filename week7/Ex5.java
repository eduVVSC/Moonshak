import java.util.Scanner;

/*
Write a program to display multiplication tables of numbers between a user-defined closed range.

The program should read two positive integers that define the range boundaries. Any negative number should be ignored. Then, the multiplication tables must be displayed in ascending order.

Implement the program using:
a) A method (readPositiveValue) to read and return a positive integer greater than zero. Numbers should be read continuously until a valid number is entered. The method returns the validated number;

b) A method (showTablesInRange) to receive the range limits as a parameter and has the responsibility to process the multiplication table of all numbers in that range;

c) A method (showTableOfNumber) to display the multiplication table of a specific number received as a parameter. The result should follow the following format (example for the multiplication table of 7):
*/

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
