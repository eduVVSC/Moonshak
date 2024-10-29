import java.util.Scanner;

public class Ex1
{
	public static final int MAX = 100;

	public static void triple_sum_nums(int num)
	{
		int		n1, n2, n3;
		int		many_trip;

		n1 = num - 1;
		many_trip = 0;
		while (n1 > 0)
		{
			n2 = n1;
			n3 = n1;
			while (n2 > 0)
			{
				n3 = n2;
				while (n3 > 0)
				{
					if ((n1 + n2 + n3) == num)
					{
						many_trip++;
						System.out.printf("%d + %d + %d\n", n1, n2, n3);
					}
					n3--;
				}
				n2--;
			}
			n2 = 1;
			n1--;
		}
		System.out.printf("triples=%d\n", many_trip);
	}

	public static void main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		num;

		num = input.nextInt();
		if (num > MAX || num < 0)
			return ;
		triple_sum_nums(num);
	}
}
