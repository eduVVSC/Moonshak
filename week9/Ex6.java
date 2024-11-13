/*

Write a program that reads a square matrix of integers and displays the sum of the numbers in each of its quadrants.
If we divide a matrix in half vertically and horizontally, we obtain 4 quadrants (q1, q2, q3, q4) in the following order:

[q2][q1]
[q3][q4]

Each quadrant has its own elements, not shared with other quadrants.

The program must read a value N corresponding to the dimension of the array (1 < N <= 20). Then it should read N lines, each containing N numbers separated by spaces.

At the end, the value of the 4 quadrants should be visualized as follows:

[q2][q1]
[q3][q4]

 */

import java.util.Scanner;

public class Ex6
{
	public static void read_value(int[][] nums, int dimension, Scanner input)
	{
		for (int i = 0; i < dimension; i++)
		{
			for (int j = 0; j < dimension; j++)
			{
				nums[i][j] = input.nextInt();
			}
		}
	}

	public static void deal_odd(int[][] nums, int dimension)
	{		int	q1 = 0;
		int	q2 = 0;
		int	q3 = 0;
		int	q4 = 0;


		for (int i = 0; i < dimension / 2; i++)
		{
			for (int j = 0; j < dimension / 2; j++)
				q2 += nums[i][j];
		}
		for (int i = 0; i < dimension / 2; i++)
		{
			for (int j = ((dimension / 2 )+ 1); j < dimension; j++)
				q1 += nums[i][j];
		}

		for (int i = ((dimension / 2 )+ 1); i < dimension; i++)
		{
			for (int j = 0; j < dimension / 2; j++)
				q3 += nums[i][j];
		}

		for (int i = ((dimension / 2 )+ 1); i < dimension; i++)
		{
			for (int j = ((dimension / 2 )+ 1); j < dimension; j++)
				q4 += nums[i][j];
		}
		System.out.printf("[%d][%d]\n[%d][%d]\n", q2, q1, q3, q4);

	}

	public static void deal_even(int[][] nums, int dimension)
	{
		int	q1 = 0;
		int	q2 = 0;
		int	q3 = 0;
		int	q4 = 0;


		for (int i = 0; i < dimension / 2; i++)
		{
			for (int j = 0; j < dimension / 2; j++)
				q2 += nums[i][j];
		}
		for (int i = 0; i < dimension / 2; i++)
		{
			for (int j = dimension / 2; j < dimension; j++)
				q1 += nums[i][j];
		}

		for (int i = dimension / 2; i < dimension; i++)
		{
			for (int j = 0; j < dimension / 2; j++)
				q3 += nums[i][j];
		}

		for (int i = dimension / 2; i < dimension; i++)
		{
			for (int j = dimension / 2; j < dimension; j++)
				q4 += nums[i][j];
		}
		System.out.printf("[%d][%d]\n[%d][%d]\n", q2, q1, q3, q4);
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int[][]	nums;
		int		dimension;

		dimension = input.nextInt();
		if(dimension > 20)
			return ;
		nums = new int[dimension][dimension];
		read_value(nums, dimension, input);
		if(dimension % 2 == 0)
			deal_even(nums, dimension);
		else
			deal_odd(nums, dimension);
	}
}
