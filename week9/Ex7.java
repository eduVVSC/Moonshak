/*
Write a program that reads an integer N (0 <= N <= 100000000) and an integer X (0 <= X <= 100000000) and determines how many of the positive numbers from zero to N (inclusive) have the sum of the factorials of the its digits greater than X.

Implement an efficient solution.

example: for N=5 and X=10
0 : 0! =1
1 : 1! =1
2 : 2! =2
3 : 3! =6
4 : 4! =24
5 : 5! =120
output: 2
*/

import java.util.Scanner;

public class Ex7
{
	public static final int MAX  = 100000000;
	public static final int MIN  = 0;

	public static int factorial(int num)
	{
		if (num == 0)
			return 1;
		if (num == 1)
			return 1;
		return (num * factorial(num - 1));
	}

	public static int factorial_digits(int num)
	{
		int	factorial;
		int digit;

		factorial = 0;
		if (num == 0)
			return 1;
		while(num > 0)
		{
			digit = num % 10;
			num = num / 10;
			factorial =+ factorial(digit);
		}
		return (factorial);
	}

	public static void factorial_greater(int factorial_max, int greater_than)
	{
		int		factorial_digits;
		int		count;
		int		i;

		count = 0;
		factorial_digits = 0;
		for (i = 0; i <= factorial_max; i++)
		{
			factorial_digits = factorial_digits(i);
			if(factorial_digits > greater_than)
				count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		factorial_max;
		int		greater_than;

		factorial_max = input.nextInt();
		greater_than = input.nextInt();

		if (factorial_max < MIN || factorial_max > MAX)
			return ;
		if (greater_than < MIN || greater_than > MAX)
			return ;
		factorial_greater(factorial_max, greater_than);
	}
}
