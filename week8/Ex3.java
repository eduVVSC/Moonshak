/*
Write a program to verify if a sequence of numbers entered by the user is always ascending.
The program should prompt the user for the amount of numbers to enter and then read them.
At the end, the program should display one of the following messages: "always ascending = true" or "always ascending = false" if the sequence of numbers entered is always ascending or not, respectively.

For this purpose implement:
a) A method to read and store in an array the numbers entered by the user.
b) A method to check if the array sequence is ascending. The method must return true or false if the sequence is always ascending or not, respectively.
*/

import java.util.Scanner;


public class Ex3 {
	public static boolean ascending(int[] nums, int many_nums)
	{
		for (int i = 1; i < nums.length; i++)
		{
			if (nums[i -1] >= nums[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		many_nums;
		int[]	nums;

		many_nums = input.nextInt();
		nums= new int[many_nums];
		for (int i = 0; i < many_nums; i++)
			nums[i] = input.nextInt();
		System.out.println("always ascending = "+ ascending(nums, many_nums));
	}
}
