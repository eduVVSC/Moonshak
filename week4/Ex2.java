import java.util.Scanner;

/*
Build a program that calculates the sum of the
even digits of a positive integer entered by the user.
*/

public class Ex2 {
	public static void main(String[] args)
	{
		int	sum;
		int	num;
		int	digit;
		Scanner input = new Scanner(System.in);

		num = input.nextInt();
		while (num >= 0)
		{
			sum = 0;
			while(num > 0)
			{
				digit = num % 10;
				num = num / 10;
				if (digit % 2 == 0)
					sum += digit;
			}
			System.out.println(sum);
			num = input.nextInt();
		}
	}
}
