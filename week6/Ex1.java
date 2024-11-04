import java.util.Scanner;

/*
a) Implement a module to determine the number of digits of a given number as a parameter.

b)Write a program to read a sequence of integers with less than N digits and average these numbers.
The value of N must be the first number read.

The program must first read the maximum number of digits (N) the numbers can have.
Then read integers smaller than N.
The program ends when a number with more than N digits is entered or when more than K numbers are read.

The average should be displayed to 2 decimal places.

Use a constant to define the maximum number of elements that can be read (K = 5).
*/

public class Ex1 {

	public static int many_digits (int num) {
		String digit = Integer.toString(num);
		return (digit.length());
	}

	public static void main(String[] args)
	{
		int		MAX = 5;
		Scanner	input = new Scanner(System.in);
		int		max_digits;
		double	average;
		int		total;
		int		num;
		int		i = 1;

		max_digits = input.nextInt();
		num = input.nextInt();
		total = 0;
		while (many_digits(num) < max_digits && i <= MAX)
		{
			total = total + num;
			//System.out.printf("total -> %d\n", total);
			if (i < MAX)
				num = input.nextInt();
			i++;
		}
		average = (double)total / (i - 1);
		if ((int)average == 0)
			System.out.println("0.00");
		else
			System.out.printf("%.2f\n", average);
	}
}
