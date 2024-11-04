import java.util.Scanner;

/*
Write a program to identify integers that have unique digits, that is, do not have repeated digits.
The program must read integers, positive and/or negative and display those that do not have repeated digits.
The reading ends with the number zero.
At the end, the percentage of positive, negative and single digit numbers should be displayed (using two decimal places and the % symbol), in the following format:

<n1>
<n2>
negatives: <n3>%
positives: <n4>%
with unique digits: <n5>%
*/

public class Ex4
{
	public static int	is_unique(String num)
	{
		int	strlen;
		int	i = 0;
		int	j;

		strlen = num.length();
		while (i < strlen)
		{
			j = i + 1;
			while (j < strlen)
			{
				if (num.charAt(i) == num.charAt(j))
					return (1);
				j++;
			}
			i++;
		}
		System.out.println(num);
		return (0);
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		String	numString;
		double	many_positive;
		double	unique_numbers;
		double	many_negative;
		double	many_nums;
		int		num;

		many_nums = 0;
		unique_numbers = 0;
		many_positive = 0;
		many_negative = 0;
		num = input.nextInt();
		if (num == 0)
			return ;
		while (num != 0)
		{
			numString = Integer.toString(num);
			if (is_unique(numString) == 0)
				unique_numbers++;
			if (num >= 0)
				many_positive++;
			if (num < 0)
				many_negative++;
			num = input.nextInt();
			many_nums++;
		}
		System.out.printf("negatives: %.2f%%\n", (double)(many_negative / many_nums) * 100);
		System.out.printf("positives: %.2f%%\n", (double)(many_positive / many_nums) * 100);
		System.out.printf("with unique digits: %.2f%%\n", (double)(unique_numbers / many_nums) * 100);
	}
}
