import java.util.Scanner;

public class Ex9
{
	public static final int SEARCHING = 1;
	public static final int FOUND = 0;

	public static int	lmc(int num1, int num2)
	{
		int	greater;
		int	flag = SEARCHING;

		greater = num1;
		if (num2 > num1)
			greater = num2;
		while (flag == SEARCHING)
		{
			if ((greater % num1 == 0) && (greater % num2 == 0))
			{
				flag = FOUND;
			}
			else
				greater++;
		}
		return (greater);
	}

	public static void	main(String[] args)
	{
		Scanner	input = new Scanner(System.in);
		int		num1, num2;

		num1 = input.nextInt();
		num2 = input.nextInt();
		System.out.println(lmc(num1, num2));
	}
}
