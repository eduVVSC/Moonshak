/*
Write a program to read a set of positive integers (for an array). Number reading ends when a negative number is entered.
Then, determine which is the element with minimum value in the set and how many times it has been inserted. The last number (negative) should be avoided.

The program should display the number with minimum value and how many times it was inserted, on separate lines and with the following format:

min=<lowest number>
occurrences=<number of occurrences>
*/

import java.util.Scanner;

public class Ex2{
	public static void min(int[] nums, int many_nums)
	{
		int	min = nums[0];
		int	occurrences = 0;

		for (int i = 0; i < many_nums; i++)
			if(nums[i] < min)
				min = nums[i];
		for (int j = 0; j < many_nums; j++)
			if (min == nums[j])
				occurrences++;
		System.out.printf("min=%d\n", min);
		System.out.printf("occurrences=%d\n", occurrences);
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int[]	nums;
		int		i = 0;

		nums = new int[10000];
		nums[i] = input.nextInt();
		if (nums[i] < 0)
			return ;
		while (nums[i] >= 0)
		{
			i++;
			nums[i] = input.nextInt();
		}
		min(nums, i);
	}
}
