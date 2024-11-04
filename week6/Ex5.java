import java.util.Scanner;

/*
a) Implement a module that receives two positive integers and returns the number of common digits in the same positions.

b) Write a program to read N pairs of positive integers. The value of N is entered by the user.
After reading the N value pairs, the program must display the pair that has the most common digits at the same positions. If there is more than one pair with the same number of digits in common, the last pair found must be displayed.


The result should contain only the pair in question in the following format:
"number1/number2".

If there are no pair of numbers that have digits in common, the message "no results" should be displayed.
*/

public class Ex5
{
	public static int	many_common(String	num1, String num2)
	{
		int	digit_num1;
		int	digit_num2;
		int	many_digits = 0;


		digit_num1 = 0;
		digit_num2 = 0;
		while(digit_num1 < num1.length() && digit_num2 < num2.length())
		{
		 		if (num1.charAt(digit_num1) == num2.charAt(digit_num2))
				many_digits++;
			digit_num1++;
			digit_num2++;
		}
		return (many_digits);
	}

	public static void	main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int		many_nums;
		int		most_same;
		int		most_num1;
		int		most_num2;
		int		same_now;
		int		num1;
		int		num2;


		most_same = 0;
		most_num1 = 0;
		most_num2 = 0;
		many_nums = input.nextInt();
		for (int i = 0; i < many_nums; i++)
		{
			num1 = input.nextInt();
			num2 = input.nextInt();
			same_now = many_common(Integer.toString(num1), Integer.toString(num2));
			if (same_now > most_same)
			{
				most_same = same_now;
				most_num1 = num1;
				most_num2 = num2;
			}
		}
		if (most_num1 != 0)
			System.out.printf("%d/%d\n", most_num1, most_num2);
		else
			System.out.println("no results");
	}
}
