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

	public static int calc_q1(int[][] nums, int dimension, int tolerance)
	{
		int	q1 = 0;

		for (int i = 0; i < dimension / 2; i++)
		{
			for (int j = ((dimension / 2 ) + tolerance); j < dimension; j++)
				q1 += nums[i][j];
		}
		return (q1);
	}

	public static int calc_q2(int[][] nums, int dimension, int tolerance)
	{
		int	q2 = 0;

		for (int i = 0; i < dimension / 2; i++)
		{
			for (int j = 0; j < dimension / 2; j++)
				q2 += nums[i][j];
		}
		return (q2);
	}

	public static int calc_q3(int[][] nums, int dimension, int tolerance)
	{
		int	q3 = 0;

		for (int i = ((dimension / 2 ) + tolerance); i < dimension; i++)
		{
			for (int j = 0; j < dimension / 2; j++)
				q3 += nums[i][j];
		}
		return (q3);
	}

	public static int calc_q4(int[][] nums, int dimension, int tolerance)
	{
		int	q4 = 0;

		for (int i = ((dimension / 2 ) + tolerance); i < dimension; i++)
		{
			for (int j = ((dimension / 2 ) + tolerance); j < dimension; j++)
				q4 += nums[i][j];
		}
		return (q4);
	}


	public static void quadrants(int[][] nums, int dimension, int tolerance)
	{
		int	q1;
		int	q2;
		int	q3;
		int	q4;

		q1 = calc_q1(nums, dimension, tolerance);
		q2 = calc_q2(nums, dimension, tolerance);
		q3 = calc_q3(nums, dimension, tolerance);
		q4	 = calc_q4	(nums, dimension, tolerance);
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
			quadrants(nums, dimension, 0);
		else
			quadrants(nums, dimension, 1);
	}
}
