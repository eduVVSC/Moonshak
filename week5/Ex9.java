import	java.util.Scanner;

public class Ex9 {
	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		greater_odd;
		double	many_num;
		double	many_even;
		int		digit;
		int		num;

		many_num = 0;
		many_even = 0;
		greater_odd = 0;
		num = input.nextInt();
		while (num > 0)
		{
			digit = num % 10;
			if (digit % 2 == 1)
			{
				if (digit > greater_odd)
					greater_odd = digit;
			}
			else
				many_even++;
			many_num++;
			num = num % 10;
		}
		if (many_even > 0)
			System.out.println((many_even / many_num) * 100);
		else
			System.out.println("0.00%");
		if (greater_odd != 0)
			System.out.println(greater_odd);
		else
			System.out.println("no odd digits");
	}
}
