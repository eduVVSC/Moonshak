/*
Write a program that reads a square matrix of integers and writes the values corresponding to the various diagonals with the same direction of the main diagonal and from right to left.
The program should read a value N (1 < N <= 20) corresponding to the dimension of the array. Then it should read N lines each containing N numbers separated by spaces.

The elements of each diagonal must be visualized in separate lines and in the following way:

[a]...[z]
*/

// wrong

import java.util.Scanner;

public class Ex5
{
	public static final int	MAX = 20;

	public static void	reading_nums(int[][] nums, Scanner input, int dimensions)
	{
		int	height;
		int	width;
		int	many_to_alloc;
		int	many_allocated;


		many_to_alloc = 1;
		width = dimensions;
		height = (dimensions * 2) - 1 ;
		for (int i = 0; i < dimensions; i++)
		{
			System.out.printf("row %d many to alloc ->|%d|\n", i, many_to_alloc);
			many_allocated = 0;
			for (int j = 0; j < width; j++)
			{
				if (many_allocated > many_to_alloc)
					nums[i][j] = -1;
				else
					nums[i][j] = (input.nextInt());
				many_allocated++;
			}
			many_to_alloc++;
		}

		many_to_alloc -= 2 ;

		/*
		for (int i = dimensions; i < height; i++)
		{
			many_allocated = 0;
			for (int j = 0; j < width; j++)
			{
				if (many_allocated > many_to_alloc)
					nums[i][j] = -1;
				else
					nums[i][j] = Integer.parseInt(input.next());
				many_allocated++;
			}
			System.out.printf("row %d many to alloc ->|%d|\n", i, many_to_alloc);
			many_to_alloc--;
		} */
	}

	public static void	print_all(int[][] nums, int dimensions)
	{
		for (int i = 0; i < dimensions; i++)
		{
			for (int j = 0; j < dimensions; j++)
			{
				System.out.printf("[%d]", nums[i][j]);
			}
			System.out.printf("\n");
		}
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		dimensions;
		int[][]	nums;

		dimensions = input.nextInt();
		if (dimensions > MAX)
			return ;
// check later..
		nums = new int[(dimensions * 2 )- 1][dimensions];
		reading_nums(nums, input, dimensions);
		print_all(nums, dimensions);
	}
}
