/*
L - Neighbours
Write a program to read a set of integers and display all numbers in that set that are larger than their neighbours.
A number is larger than its neighbours if it is simultaneously larger than the previous and next number.
Reading ends when a negative number is entered. Never more than 30 numbers will be entered.

Result elements should be displayed on separate lines.

Example1:
8, 2, 4 , 1, 6, 12 , 5, 9, -1
*/

import java.util.Scanner;

public class Ex3
{
	public static final int MAX_READ = 30;

	public static int	read_nums(int[] nums, Scanner input)
	{
		int	i;

		for (i = 0; i < MAX_READ; i++)
			nums[i] = input.nextInt();
		return (i);
	}

	public static void	great_neighbour(int	[]nums, int many_nums)
	{
		for (int i = 1; i < (many_nums - 1); i++)
		{
			if (nums[i] > nums[i + 1] && nums[i] > nums[i - 1])
				System.out.println(nums[i]);
		}
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		many_nums;
		int[]	nums;

		nums = new int[MAX_READ];
		many_nums = read_nums(nums, input);
		great_neighbour(nums, many_nums);
	}
}
