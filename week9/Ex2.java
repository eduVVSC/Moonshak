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
		boolean	print_flag;

		//System.out.println("--------------------");
		System.out.println(nums[0]);
		for (int i = 1; i < many_nums; i++)
		{
			print_flag = true;

			for (int j = i - 1; j >= 0; j--)
			{
				if (nums[i] == nums[j])
					print_flag = false;
			}

			if (print_flag == true)
				System.out.println(nums[i]);
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
		print_no_repeat(nums, many_nums);
	}

}
