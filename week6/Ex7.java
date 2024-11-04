import java.util.Scanner;

/*
An Armstrong number has the following characteristic: the sum of the digits raised to the number of digits equals the number itself.
For example:
2 = 2 ^ 1 (1 digit => sum all digits raised to 1)
407 = 4 ^ 3 + 0 ^ 3 + 7 ^ 3 (3 digits => add all digits raised to 3)
1634 = 1 ^ 4 + 6 ^ 4 + 3 ^ 4 + 4 ^ 4 (4 digits => add up to 4 digits)

a) Implement a method to verify that an integer is an Armstrong number.

b) Write a program to display all Armstrong numbers up to a user-entered value N.
*/

public class Ex7
{
	public static int is_armstrong(int num)
	{
		int		many_digits;
		int		cp_num;
		int		digit;
		int		sum;

		sum = 0;
		many_digits = (Integer.toString(num)).length();
		cp_num = num;
		while (cp_num > 0)
		{
			digit = cp_num % 10;
			sum += Math.pow(digit, many_digits);
			cp_num = cp_num / 10;
		}
		if (sum == num)
			return (0);
		return (1);
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int		max;

		max = input.nextInt();
		for (int i = 0; i <= max; i++)
		{
			if (is_armstrong(i) == 0)
				System.out.println(i);
		}
	}
}
