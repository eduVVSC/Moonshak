import java.util.Scanner;

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
