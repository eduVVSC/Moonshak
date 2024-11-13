/*
Write a program that reads N integers and displays them in the same order but without repetitions.
First, the program must read the value of N. Next, it must read the N numbers of the set.

Each element of the result set must be displayed on separate lines.
*/

import java.util.Scanner;

public class Ex2
{
	public static void	read_nums(int[] nums, int many_nums, Scanner input)
	{
		for (int i = 0; i < many_nums; i++)
			nums[i] = input.nextInt();
	}

	public static void print_no_repeat(int[] nums, int many_nums)
	{
		for (int i = 0; i < many_nums; i++)
		{
			for (int j = i; j > 0; j--)
			{
				if (nums[i] == nums[j])
			}
		}

	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int[]	nums;
		int		many_nums;

		many_nums = input.nextInt();
		nums = new int[many_nums];
		read_nums(nums, many_nums, input);

	}

}
