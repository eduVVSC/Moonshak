/*
Write a program that reads a set of positive integers and visualizes, for each one, how many different digits make up the number.
Reading ends when a negative number is entered.

Result elements must be displayed on separate lines, in the following format:

<entered number>:<different digits>
 */

import java.util.Scanner;

public class Ex4 {
	public static final int MAX = 214748;

	public static int	read_Nums(Scanner input, String[] nums)
	{
		int i;

		for (i = 0; i < MAX; i++)
		{
			nums[i] = input.next();
			if(Integer.parseInt(nums[i]) < 0)
				break ;
		}
		return i;
	}

	public static int different_Digits(String num)
	{
		boolean	unique;
		int		many_characters;
		int		count;

		count = 1;
		many_characters =  num.length();
		for (int i = 1; i < many_characters ; i++)
		{
			unique = true;
			for (int j = i - 1; j >= 0; j--)
			{
				if (num.charAt(i) == num.charAt(j))
					unique = false;
			}
			if (unique == true)
				count++;
		}
		return (count);
	}

	public static void print_Different(String[] nums, int many_nums)
	{
		for (int i = 0; i < many_nums; i++)
		{
			System.out.printf("%s:%d\n", nums[i], different_Digits(nums[i]));
		}
	}

	public static void main(String[] args)
	{
		Scanner		input = new Scanner(System.in);
		int			many_nums;
		String[]	nums;

		nums = new String[MAX];
		many_nums = read_Nums(input, nums);
		print_Different(nums, many_nums);
	}
}
